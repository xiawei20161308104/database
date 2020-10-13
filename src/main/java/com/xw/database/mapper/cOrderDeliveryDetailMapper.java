package com.xw.database.mapper;

import com.xw.database.bean.cOrderDeliveryDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface cOrderDeliveryDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(cOrderDeliveryDetail record);

    int insertSelective(cOrderDeliveryDetail record);

    cOrderDeliveryDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(cOrderDeliveryDetail record);

    int updateByPrimaryKey(cOrderDeliveryDetail record);
}