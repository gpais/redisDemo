#!/bin/bash
echo run this again 3.
#/bin/bash -c -v "java -jar /opt/dropwizard/LetsGetDigital-0.0.1-SNAPSHOT.jar server /opt/dropwizard/config_aws.yml"
#/bin/sh -c "java -jar /opt/dropwizard/LetsGetDigital-0.0.1-SNAPSHOT.jar server /opt/dropwizard/config_aws.yml"
/bin/sh -c "java -jar  -Dspring.profiles.active=prod /opt/dropwizard/LetsGetDigital-0.0.1-SNAPSHOT.jar"