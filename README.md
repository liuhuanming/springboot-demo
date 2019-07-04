```
<!--开发环境 -->
mvn clean package 
<!--测试环境 -->
mvn clean package -Dmaven.test.skip=true -D profiles.active=test
<!--产品环境-->
mvn clean package -Dmaven.test.skip=true -Pprod
```

