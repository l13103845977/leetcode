FROM java:8
VOLUME /tmp
ADD /target/leetcode-1.0-SNAPSHOT.jar app.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","/app.jar"]