package com.eccl.cloud.demo.dao;

import java.util.List;

import com.eccl.cloud.demo.domain.DrDbProcessLine;

public interface DrDbProcessLineMapper {
    int deleteByPrimaryKey(String id);

    int insert(DrDbProcessLine record);

    int insertSelective(DrDbProcessLine record);

    DrDbProcessLine selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DrDbProcessLine record);

    int updateByPrimaryKey(DrDbProcessLine record);
    
    List<DrDbProcessLine> getDrDbInfo(DrDbProcessLine record);
}