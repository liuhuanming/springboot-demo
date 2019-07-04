package com.eccl.cloud.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eccl.cloud.demo.dao.DrZbProcessLineMapper;
import com.eccl.cloud.demo.domain.DrZbProcessLine;
import com.eccl.cloud.demo.service.DrZbProcessLineService;
@Service
public class DrZbProcessLineServiceImpl implements DrZbProcessLineService{

	@Autowired
	private DrZbProcessLineMapper mapper;
	
	@Override
	public List<DrZbProcessLine> getDrZbInfo(DrZbProcessLine record) {
		// TODO Auto-generated method stub
		return mapper.getDrZbInfo(record);
	}

}
