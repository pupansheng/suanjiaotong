package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Group;
import pojo.TbbUser;
import pojo.TbbUserExample;

public interface TbbUserMapper {
    int countByExample(TbbUserExample example);

    int deleteByExample(TbbUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbbUser record);

    int insertSelective(TbbUser record);

    List<TbbUser> selectByExample(TbbUserExample example);

    TbbUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbbUser record, @Param("example") TbbUserExample example);

    int updateByExample(@Param("record") TbbUser record, @Param("example") TbbUserExample example);

    int updateByPrimaryKeySelective(TbbUser record);

    int updateByPrimaryKey(TbbUser record);

}