FROM registry.access.redhat.com/ubi9/openjdk-17:latest

USER jboss

COPY --chown=185 target/*.jar /deployments/

EXPOSE 8080

ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"

