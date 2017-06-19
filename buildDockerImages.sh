#!/usr/bin/env bash
X_CURRENT_PATH=$(pwd)

for X in configuration service-discovery order-service-runner service-api-gateway service-auth-server service-hystrix-dashboard
do
    cd ${X_CURRENT_PATH}/${X}
    gradle clean build buildDocker
done