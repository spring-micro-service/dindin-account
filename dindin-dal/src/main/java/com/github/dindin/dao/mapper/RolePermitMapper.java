package com.github.dindin.dao.mapper;

import com.github.dindin.domain.entity.RolePermit;
import com.github.dindin.domain.entity.RolePermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RolePermitMapper {
    long countByExample(RolePermitExample example);

    int deleteByExample(RolePermitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolePermit record);

    int insertSelective(RolePermit record);

    List<RolePermit> selectByExampleWithRowbounds(RolePermitExample example, RowBounds rowBounds);

    List<RolePermit> selectByExample(RolePermitExample example);

    RolePermit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolePermit record, @Param("example") RolePermitExample example);

    int updateByExample(@Param("record") RolePermit record, @Param("example") RolePermitExample example);

    int updateByPrimaryKeySelective(RolePermit record);

    int updateByPrimaryKey(RolePermit record);
}