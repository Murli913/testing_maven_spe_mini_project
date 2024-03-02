FROM openjdk:17
COPY ./target/calculator.jar calculator.jar
WORKDIR ./
CMD ["java","-jar","calculator.jar"]
