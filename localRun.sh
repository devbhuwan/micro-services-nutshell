#!/usr/bin/env bash
X_CURRENT_PATH=$(pwd)

for i in configuration service-discovery service-api-gateway order-service-runner
do
gnome-terminal --working-directory="$X_CURRENT_PATH/$i" --command="gradle bootRun"
sleep 15s
done