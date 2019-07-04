package com.eccl.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableTransactionManagement
@EnableSwagger2 //api地址：http://localhost:8803/swagger-ui.html
@MapperScan("com.eccl.cloud.demo.dao")
@SpringBootApplication
public class CloudDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudDemoApplication.class, args);
	}
}
