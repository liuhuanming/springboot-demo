package com.eccl.cloud.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eccl.cloud.demo.dao.DrDbProcessLineMapper;
import com.eccl.cloud.demo.domain.DrDbProcessLine;
import com.eccl.cloud.demo.service.DrDbProcessLineService;
@Service
public class DrDbProcessLineServiceImpl implements DrDbProcessLineService{

	@Autowired
	private DrDbProcessLineMapper mapper;
	
	@Override
	public List<DrDbProcessLine> getDrDbInfo(DrDbProcessLine record) {
		// TODO Auto-generated method stub
		return mapper.getDrDbInfo(record);
	}

}
