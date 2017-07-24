package com.dimonho.cs.dao.mysql;

import com.dimonho.cs.pojo.mysql.Afterkey;
import com.dimonho.cs.pojo.mysql.AfterkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AfterkeyMapper {
    int countByExample(AfterkeyExample example);

    int deleteByExample(AfterkeyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Afterkey record);

    int insertSelective(Afterkey record);

    List<Afterkey> selectByExample(AfterkeyExample example);

    Afterkey selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Afterkey record, @Param("example") AfterkeyExample example);

    int updateByExample(@Param("record") Afterkey record, @Param("example") AfterkeyExample example);

    int updateByPrimaryKeySelective(Afterkey record);

    int updateByPrimaryKey(Afterkey record);
}