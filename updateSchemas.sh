#!/bin/sh

# prepare type and protoToOpenAPISchema submodules
git submodule init
git submodule update

# invoke script with parameter
./protoToOpenAPISchema/protoToOpenAPISchema.py --openAPI src/main/resources/bco-openapi.yaml --overwrite --schemaPrefix Openbase -p type

