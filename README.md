# JavaLab

How to start the JavaLab application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/javalab-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`

Print System Properties
---

1. start application with `java -Dser.du.mig=ja -jar target/javalab-1.0-SNAPSHOT.jar server config.yml
`
2. try to locate `ser.du.mig` in `http://localhost:8080/system-properties`