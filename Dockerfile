#Dockerfile,an blueprint for creating dockerImage,
FROM openjdk:21
LABEL author="Naveen K Wodeyar"
RUN mkdir/usr/app/
COPY target/Test.jar  /usr/app
WORKDIR /usr/app
ENTRYPOINT [ "java","-jar","Test.jar" ]