FROM openjdk:17
COPY ./target/calculator.jar ./
WORKDIR ./
CMD ["java","-jar","Testing_Calculator-1.0-SNAPSHOT.jar"]
