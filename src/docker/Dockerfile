FROM openjdk:8-jre-alpine
COPY build/distributions/example-app-docker.zip /opt/example-app-docker/
RUN unzip /opt/example-app-docker/example-app-docker.zip -d /opt/example-app-docker
WORKDIR /opt/example-app-docker/example-app-docker
CMD ["./bin/example-app-docker", "-fg"]
