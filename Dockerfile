FROM openjdk:11

COPY target/Spring-App.jar /usr/app/Spring-App.jar

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java","-jar","Spring-App.jar"]
