package com.eccl.cloud.demo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eccl.cloud.common.result.Response;
import com.eccl.cloud.common.result.Result;
import com.eccl.cloud.common.result.ResultEnum;
import com.eccl.cloud.demo.domain.DrZbProcessLine;
import com.eccl.cloud.demo.domain.DrZbProcessLineSearch;
import com.eccl.cloud.demo.service.DrZbProcessLineService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="带班",tags={"值班接口"})
@RestController
@RequestMapping("/zb")
public class DrZbProcessLineController {
	@Autowired
	private DrZbProcessLineService service;
	
	@ApiOperation(value="查询实际值班情况")
	@GetMapping(value = "", produces = { "application/json;charset=UTF-8" })
	public Result insert(DrZbProcessLineSearch drZbProcessLineSearch){
		List<DrZbProcessLine> zbList = service.getDrZbInfo(drZbProcessLineSearch);
		if (zbList.isEmpty()) {
			return Response.error(ResultEnum.NOT_FOUND_RESULT);
		} else {
			zbList.removeAll(Collections.singleton(null));
			return Response.ok(zbList);
		}
		
	}
	
 }
