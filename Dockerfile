FROM openjdk:11
WORKDIR /app
COPY . /app/
RUN javac FibCalc.java
ENTRYPOINT ["java", "FibCalc"]
