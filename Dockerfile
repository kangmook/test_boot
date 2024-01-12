FROM mintya/jre17-alpine:3.15.0

WORKDIR /app

# 호스트 머신에서 빌드된 WAR 파일을 복사합니다.
COPY target/ROOT.war /app/app.war

# 포트 설정 (Spring Boot 애플리케이션이 사용하는 포트와 일치하도록 설정)
EXPOSE 8091

# 애플리케이션을 실행합니다.
CMD ["java", "-jar", "app.war"]



# 일반적인 온프라미스 환경에 배포하는 프로젝트에 적절 (사내에서)
#FROM docker.io/library/tomcat:8.5.97-jdk17-corretto-al2

#RUN rm -rf /usr/local/tomcat/webapps/*
#COPY target/ROOT.war /usr/local/tomcat/webapps/
#EXPOSE 8091

