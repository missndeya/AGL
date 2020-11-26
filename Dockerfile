FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/Projet_AGL-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "Projet_AGL-0.0.1-SNAPSHOT.jar"]
