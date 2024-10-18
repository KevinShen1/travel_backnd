FROM dockergtw01.testritegroup.com/openjdk:11-jdk-alpine-with-ttf-dejavu
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENV TZ Asia/Taipei
ENTRYPOINT exec java -XX:+PrintGCDetails -XX:+UnlockExperimentalVMOptions $JAVA_OPTIONS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=$PROFILE -jar /app.jar