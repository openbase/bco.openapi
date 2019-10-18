# BCO OpenAPI Repository 
This repository contains the BCO OpenAPI description which can be used to generate the OpenAPI client and server interfaces of BCO.
Furthermore, this repository contains all required generators to generate the schemata from the openbase type library and the api description based on the BCO interfaces. 

## Install Requirements

Since the schema generator requires yaml to be functional, we have to install this dependency in advance:
```pip3 install pyyaml```

## How to Generate the API Description File

### Generate Schemata

First of all execute ```./updateSchemas.sh``` which will create the api description file and generates all required api schemata which are then stored in the created file.
This initial step needs to be repeated any time the openbase type lib was modified to make sure the schemata is always up-to-date and compatible with the latest BCO interfaces.

### Generate API Description

After the schemata has been generated, we need to generate the path entries to finalize the api interface description file.
Do to so, change into the ```method-generator``` folder and perform the ```./install.sh``` script. Afterwards perform
```
bco-openapi-method-generator ~/workspace/openbase/bco.openapi/src/main/resources/bco-openapi.yaml
```
which then updates all api path declarations.
All methods which could not be updated are indicated by warning logs.

An more generic generator script will be offered in a future release.

### Generate the Server Interface

The server interface as well as configured client bundles can be installed locally via the ```./install.sh``` script placed at the top level at the bco.openapi repository.

## Example API Calls

In the following examples we are using ```localhost``` as the host where the BCO OpenAPI Server App is serving on port ```8484```.
Please adjust this host and port name if the app is served on another machine.

How to get a list of all device classes via curl:
```
curl -X GET http://localhost:8484/registry/class/getDeviceClasses
```


How to resolve a unit id via its alias (This example seems to be broken!).
```
curl -d '{"arg0":"Battery-1"}' -H "Content-Type: application/json" -X POST http://localhost:8484/registry/unit/getUnitConfigByAlias
```

### Server Send Events

How to listen to unit state updates in the browser:
```
http://localhost:8484/unit/events?unitId=99aec777-6fa4-403b-ae01-ce78754296a3&serviceType=POWER_STATE_SERVICE
```