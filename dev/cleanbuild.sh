#!/bin/bash

pushd ../
mvn clean package -Dmaven.test.skip=true
popd
