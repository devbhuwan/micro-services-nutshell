#!/usr/bin/env bash
#heroku container:login
for X in configuration service-registry order-service-runner service-api-gateway service-auth-server service-hystrix-dashboard
do
    heroku apps:destroy --app --confirm oms-${X}
    heroku apps:create oms-${X}
    docker tag io.github.devbhuwan/oms-${X}:1.0-SNAPSHOT registry.heroku.com/oms-${X}/web
    docker push registry.heroku.com/oms-${X}/web
done