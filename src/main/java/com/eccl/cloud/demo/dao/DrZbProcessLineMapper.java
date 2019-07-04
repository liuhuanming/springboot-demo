package com.eccl.cloud.demo.dao;

import com.eccl.cloud.demo.domain.DrZbProcessLine;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrZbProcessLineMapper {

    int deleteByPrimaryKey(String id);

    int insert(DrZbProcessLine record);

    int insertSelective(DrZbProcessLine record);

    DrZbProcessLine selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DrZbProcessLine record);

    int updateByPrimaryKey(DrZbProcessLine record);
    
    List<DrZbProcessLine> getDrZbInfo(DrZbProcessLine record);
}