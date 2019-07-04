package com.eccl.cloud.demo.service;

import java.util.List;

import com.eccl.cloud.demo.domain.DrDbProcessLine;

public interface DrDbProcessLineService {
	List<DrDbProcessLine> getDrDbInfo(DrDbProcessLine record);
}
