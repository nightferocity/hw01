FROM openjdk:11
ADD target/hw01-docker.jar hw01-docker.jar
EXPOSE 8033
ENTRYPOINT java -jar hw01-docker.jar $ARGS