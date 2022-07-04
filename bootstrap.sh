#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=org.iboo.quarkus.mongo \
        -DprojectArtifactId=ms-suscription \
        -DclassName="ar.com.ib.suscription.SuscriptionResource" \
        -Dpath="/api/v1/suscription" \
        -Dextensions="resteasy-jsonb, smallrye-openapi, resteasy-reactive-jackson, mongodb-panache"
