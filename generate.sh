

# prepare swagger if needed
export CODE_GEN="swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar"
if test -f "${CODE_GEN}"; then
    echo "using existing swagger-codegen"
else
    echo "install swagger-codegen"
    git submodule init
    git submodule update
    cd swagger-codegen
    git checkout v3.0.8
    mvn install -DskipTests
    cd ..
fi

# create cient folder if needed
mkdir -p client-java client-spring client-jaxrs-jersey

# generate clients
java -jar ${CODE_GEN} generate -i api/bco-openapi.yaml -o client-java -l java
java -jar ${CODE_GEN} generate -i api/bco-openapi.yaml -o client-spring -l spring
java -jar ${CODE_GEN} generate -i api/bco-openapi.yaml -o client-jaxrs-jersey -l jaxrs-jersey

