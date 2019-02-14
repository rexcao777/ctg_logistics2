package com.ctgstw.logisticsmic.mapper;

import com.ctgstw.logisticsmic.entity.po.LogisticsWaybillNumberUse;
import com.ctgstw.logisticsmic.entity.po.LogisticsWaybillNumberUseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsWaybillNumberUseMapper {
    long countByExample(LogisticsWaybillNumberUseExample example);

    int deleteByExample(LogisticsWaybillNumberUseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogisticsWaybillNumberUse record);

    int insertSelective(LogisticsWaybillNumberUse record);

    List<LogisticsWaybillNumberUse> selectByExample(LogisticsWaybillNumberUseExample example);

    LogisticsWaybillNumberUse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogisticsWaybillNumberUse record, @Param("example") LogisticsWaybillNumberUseExample example);

    int updateByExample(@Param("record") LogisticsWaybillNumberUse record, @Param("example") LogisticsWaybillNumberUseExample example);

    int updateByPrimaryKeySelective(LogisticsWaybillNumberUse record);

    int updateByPrimaryKey(LogisticsWaybillNumberUse record);
}