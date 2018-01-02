# springboot_1.5_jdk9_test
This repository is practice repository for migration jdk9 with springboot 1.5.x

# Preconditions
This repo uses..
* jdk 9
* gradle 4.4

# In conclusion
1. we can run springboot 1.5.x application on jdk9 without JPMS. 
2. we *can not* compile when we use JPMS. 
  

# Execute Springboot Application

* bootstrap sample application
```
./gradlew clean bootRun
```

* check application response 

```
http://localhost:8080/users
```
