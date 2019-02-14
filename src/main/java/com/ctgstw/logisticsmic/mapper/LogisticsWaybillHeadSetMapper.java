package com.ctgstw.logisticsmic.mapper;

import com.ctgstw.logisticsmic.entity.po.LogisticsWaybillHeadSet;
import com.ctgstw.logisticsmic.entity.po.LogisticsWaybillHeadSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsWaybillHeadSetMapper {
    long countByExample(LogisticsWaybillHeadSetExample example);

    int deleteByExample(LogisticsWaybillHeadSetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogisticsWaybillHeadSet record);

    int insertSelective(LogisticsWaybillHeadSet record);

    List<LogisticsWaybillHeadSet> selectByExample(LogisticsWaybillHeadSetExample example);

    LogisticsWaybillHeadSet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogisticsWaybillHeadSet record, @Param("example") LogisticsWaybillHeadSetExample example);

    int updateByExample(@Param("record") LogisticsWaybillHeadSet record, @Param("example") LogisticsWaybillHeadSetExample example);

    int updateByPrimaryKeySelective(LogisticsWaybillHeadSet record);

    int updateByPrimaryKey(LogisticsWaybillHeadSet record);
}