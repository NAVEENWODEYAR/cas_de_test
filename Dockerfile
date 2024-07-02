#Dockerfile,an blueprint for creating dockerImage,
FROM openjdk:21
FROM openjdk:21
RUN mkdir/usr/app/
COPY target/Test.jar  /usr/app
WORKDIR /usr/app
ENTRYPOINT [ "java","-jar","Test.jar" ]