package com.github.dindin.dao.mapper;

import com.github.dindin.domain.entity.Permit;
import com.github.dindin.domain.entity.PermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PermitMapper {
    long countByExample(PermitExample example);

    int deleteByExample(PermitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permit record);

    int insertSelective(Permit record);

    List<Permit> selectByExampleWithRowbounds(PermitExample example, RowBounds rowBounds);

    List<Permit> selectByExample(PermitExample example);

    Permit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permit record, @Param("example") PermitExample example);

    int updateByExample(@Param("record") Permit record, @Param("example") PermitExample example);

    int updateByPrimaryKeySelective(Permit record);

    int updateByPrimaryKey(Permit record);
}