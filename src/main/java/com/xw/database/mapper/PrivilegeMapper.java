package com.xw.database.mapper;

import com.xw.database.bean.Privilege;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}