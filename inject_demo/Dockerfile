FROM registry.access.redhat.com/ubi9/openjdk-17:latest

USER jboss

COPY --chown=185 target/quarkus-app/lib/ /deployments/lib/
COPY --chown=185 target/quarkus-app/*.jar /deployments/
COPY --chown=185 target/quarkus-app/app/ /deployments/app/
COPY --chown=185 target/quarkus-app/quarkus/ /deployments/quarkus/

EXPOSE 8080

ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"

