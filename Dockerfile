FROM java:8
VOLUME /tmp
ADD /target/leetcode-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]