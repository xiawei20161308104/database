package com.xw.database.mapper;

import com.xw.database.bean.cOrderDelivery;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface cOrderDeliveryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(cOrderDelivery record);

    int insertSelective(cOrderDelivery record);

    cOrderDelivery selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(cOrderDelivery record);

    int updateByPrimaryKey(cOrderDelivery record);
}