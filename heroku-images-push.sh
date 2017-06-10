#!/usr/bin/env bash
#heroku container:login
for X in oms-service-discovery oms-configuration oms-order-service-runner oms-service-api-gateway
do
    heroku apps:destroy --app --confirm ${X}
    heroku apps:create ${X}
    docker tag io.github.devbhuwan/${X}:1.0-SNAPSHOT registry.heroku.com/${X}/web
    docker push registry.heroku.com/${X}/web
    #heroku container:push web --app $X
done
#heroku open -a <app>