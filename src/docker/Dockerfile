FROM openjdk:11-jdk-slim
ADD build/distributions/example-app-docker.tar /opt/
WORKDIR /opt/example-app-docker
CMD ["./bin/example-app-docker", "-fg"]
