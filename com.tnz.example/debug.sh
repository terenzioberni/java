#! /bin/sh
export JAVA_HOME=/Library/Java/JavaVirtualMachines/CurrentJDK/Contents/Home
mvn clean install -Dmaven.surefire.debug
