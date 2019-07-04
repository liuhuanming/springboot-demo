FROM java:8u111-jdk
VOLUME /tmp
ADD target/app.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "-Xmx512m", "/app.jar", "--spring.profiles.active=prod"]
