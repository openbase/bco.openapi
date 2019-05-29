

# prepare swagger if needed
export CODE_GEN="openapi-generator/modules/openapi-generator-cli/target/openapi-generator-cli.jar"
if test -f "${CODE_GEN}"; then
    echo "using existing openapi-codegen"
else
    echo "install openapi-codegen"
    git submodule init
    git submodule update
    cd openapi-generator
    mvn install -DskipTests
    cd ..
fi

# create server folder if needed
mkdir -p server-spring

# generate clients
java -jar ${CODE_GEN} generate -i api/bco-openapi.yaml -o server-spring -g spring

