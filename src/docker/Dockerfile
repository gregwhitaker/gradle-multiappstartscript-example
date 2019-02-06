FROM openjdk:8-jre-alpine
COPY build/distributions/example-app.zip /opt/example-app/
RUN unzip /opt/example-app/example-app.zip -d /opt/example-app
WORKDIR /opt/example-app/example-app
CMD ["./bin/example-app-docker", "-fg"]
