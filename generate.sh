

# prepare swagger
git submodule init
git submodule update
cd swagger-codegen
git checkout v3.0.8
mvn install
cd ..

java -jar swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i api/bco-openapi.yaml -o client-jaxrs-jersey -l jaxrs-jersey
#java -jar swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i api/bco-openapi.yaml -o client-jaxrs-jersey -l jaxrs-jersey
