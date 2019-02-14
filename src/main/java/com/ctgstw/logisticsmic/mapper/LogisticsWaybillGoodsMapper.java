package com.ctgstw.logisticsmic.mapper;

import com.ctgstw.logisticsmic.entity.po.LogisticsWaybillGoods;
import com.ctgstw.logisticsmic.entity.po.LogisticsWaybillGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsWaybillGoodsMapper {
    long countByExample(LogisticsWaybillGoodsExample example);

    int deleteByExample(LogisticsWaybillGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogisticsWaybillGoods record);

    int insertSelective(LogisticsWaybillGoods record);

    List<LogisticsWaybillGoods> selectByExample(LogisticsWaybillGoodsExample example);

    LogisticsWaybillGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogisticsWaybillGoods record, @Param("example") LogisticsWaybillGoodsExample example);

    int updateByExample(@Param("record") LogisticsWaybillGoods record, @Param("example") LogisticsWaybillGoodsExample example);

    int updateByPrimaryKeySelective(LogisticsWaybillGoods record);

    int updateByPrimaryKey(LogisticsWaybillGoods record);
}