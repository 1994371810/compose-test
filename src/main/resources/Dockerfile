FROM java:8

MAINTAINER gudian<1994371810@qq.com>

WORKDIR /data

COPY ./app.jar /data/app.jar
COPY ./application.properties /data/application.properties

ENTRYPOINT [ "nohup","java","-jar","app.jar","--spring.config.lication=/data/application.properties","&"]



