FROM ubuntu:22.04

WORKDIR home/physics-api

RUN apt-get update && apt-get upgrade -y

RUN apt-get install openjdk-17-jdk -y

RUN apt-get install maven -y # Version 3.6.3

COPY . .

RUN mvn clean package

ENTRYPOINT ["mvn", "spring-boot:run"]
