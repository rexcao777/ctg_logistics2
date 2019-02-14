package com.ctgstw.logisticsmic.mapper;

import com.ctgstw.logisticsmic.entity.po.SysHMAC256;
import com.ctgstw.logisticsmic.entity.po.SysHMAC256Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysHMAC256Mapper {
    long countByExample(SysHMAC256Example example);

    int deleteByExample(SysHMAC256Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysHMAC256 record);

    int insertSelective(SysHMAC256 record);

    List<SysHMAC256> selectByExample(SysHMAC256Example example);

    SysHMAC256 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysHMAC256 record, @Param("example") SysHMAC256Example example);

    int updateByExample(@Param("record") SysHMAC256 record, @Param("example") SysHMAC256Example example);

    int updateByPrimaryKeySelective(SysHMAC256 record);

    int updateByPrimaryKey(SysHMAC256 record);
}