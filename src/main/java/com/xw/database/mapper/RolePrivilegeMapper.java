package com.xw.database.mapper;

import com.xw.database.bean.RolePrivilege;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolePrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePrivilege record);

    int insertSelective(RolePrivilege record);

    RolePrivilege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePrivilege record);

    int updateByPrimaryKey(RolePrivilege record);
}