#!/usr/bin/env bash
X_CURRENT_PATH=$(pwd)

cd $X_CURRENT_PATH/configuration
gradle clean build buildDocker

cd $X_CURRENT_PATH/service-discovery
gradle clean build buildDocker

cd $X_CURRENT_PATH/service-api-gateway
gradle clean build buildDocker

cd $X_CURRENT_PATH/order-service-runner
gradle clean build buildDocker