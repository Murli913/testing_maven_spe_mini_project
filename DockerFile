FROM openjdk:17
COPY ./target/Testing_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","Testing_Calculator-1.0-SNAPSHOT.jar"]
