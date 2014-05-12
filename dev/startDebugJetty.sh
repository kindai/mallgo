#!/bin/bash

export MAVEN_OPTS="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=8123,server=y,suspend=n"

pushd ../
mvn org.eclipse.jetty:jetty-maven-plugin:run
popd
