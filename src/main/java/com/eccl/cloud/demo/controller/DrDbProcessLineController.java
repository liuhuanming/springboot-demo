package com.eccl.cloud.demo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eccl.cloud.common.result.Response;
import com.eccl.cloud.common.result.Result;
import com.eccl.cloud.common.result.ResultEnum;
import com.eccl.cloud.demo.domain.DrDbProcessLine;
import com.eccl.cloud.demo.domain.DrDbProcessLineSearch;
import com.eccl.cloud.demo.service.DrDbProcessLineService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="带班",tags={"带班接口"})
@RestController
@RequestMapping("/db")
public class DrDbProcessLineController {
	@Autowired
	private DrDbProcessLineService service;
	
	@ApiOperation(value="查询实际带班情况")
	@GetMapping(value = "", produces = { "application/json;charset=UTF-8" })
	public Result insert(DrDbProcessLineSearch drDbProcessLineSearch){
		List<DrDbProcessLine> dbList = service.getDrDbInfo(drDbProcessLineSearch);
		if (dbList.isEmpty()) {
			return Response.error(ResultEnum.NOT_FOUND_RESULT);
		} else {
			dbList.removeAll(Collections.singleton(null));
			return Response.ok(dbList);
		}
		
	}
	
 }
