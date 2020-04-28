package xyz.fusheng.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.fusheng.entity.TCourse;

import java.util.List;

@Mapper
@Repository
public interface TCourseRepository {
    int deleteByPrimaryKey(Integer id);

    int insert(TCourse record);

    int insertSelective(TCourse record);

    TCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCourse record);

    int updateByPrimaryKey(TCourse record);

    List<TCourse> selectByAll();


    TCourse selectByCode(String coursecode);

}