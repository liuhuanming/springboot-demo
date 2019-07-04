package com.eccl.cloud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eccl.cloud.common.result.Response;
import com.eccl.cloud.common.result.Result;
import com.eccl.cloud.common.result.ResultEnum;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class TestController {
	
	@GetMapping("/hello")
	public String sayHello(){
		return "hello,world";
	}
	
	
}
