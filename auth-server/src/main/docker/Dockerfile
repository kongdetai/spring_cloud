FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  auth-server-1.0-SNAPSHOT.jar app.jar
# Set the timezone.
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
# Set lang
ENV LANG zh_CN.UTF-8
RUN sh -c 'touch /app.jar'
ENTRYPOINT java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app.jar