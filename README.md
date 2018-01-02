# springboot_1.5_jdk9_test
This repository is practice repository for migration jdk9 with springboot 1.5.x

# Preconditions
This repo uses..
* jdk 9
* gradle 4.4

# In conclusion
1. we can run springboot both 1.5.x and 2.0.0.x(Snapshot)application on jdk9 without JPMS. 

# TODO Next
1. ~~run `spring-boot-starter-web:1.5.9.RELEASE` with JDK 9~~ (done)
2. ~~run `spring-boot-starter-web:2.0.0.M7` with JDK 9~~ (done)
3. run with `spring-boot-starter-thymeleaf`
4. run with `spring-boot-starter-data-jpa`  

# Execute Springboot Application

* bootstrap sample application
```
./gradlew clean bootRun
```

* check application response 

```
http://localhost:8080/users
```
