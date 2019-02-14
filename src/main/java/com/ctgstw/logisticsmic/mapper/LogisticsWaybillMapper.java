package com.ctgstw.logisticsmic.mapper;

import com.ctgstw.logisticsmic.entity.po.LogisticsWaybill;
import com.ctgstw.logisticsmic.entity.po.LogisticsWaybillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsWaybillMapper {
    long countByExample(LogisticsWaybillExample example);

    int deleteByExample(LogisticsWaybillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogisticsWaybill record);

    int insertSelective(LogisticsWaybill record);

    List<LogisticsWaybill> selectByExampleWithBLOBs(LogisticsWaybillExample example);

    List<LogisticsWaybill> selectByExample(LogisticsWaybillExample example);

    LogisticsWaybill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogisticsWaybill record, @Param("example") LogisticsWaybillExample example);

    int updateByExampleWithBLOBs(@Param("record") LogisticsWaybill record, @Param("example") LogisticsWaybillExample example);

    int updateByExample(@Param("record") LogisticsWaybill record, @Param("example") LogisticsWaybillExample example);

    int updateByPrimaryKeySelective(LogisticsWaybill record);

    int updateByPrimaryKeyWithBLOBs(LogisticsWaybill record);

    int updateByPrimaryKey(LogisticsWaybill record);
}