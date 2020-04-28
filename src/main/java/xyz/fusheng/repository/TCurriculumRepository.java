package xyz.fusheng.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.fusheng.entity.TCurriculum;

import java.util.List;

@Mapper
@Repository
public interface TCurriculumRepository {
    int deleteByPrimaryKey(Integer id);

    int insert(TCurriculum record);

    int insertSelective(TCurriculum record);

    TCurriculum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCurriculum record);

    int updateByPrimaryKey(TCurriculum record);

    List<TCurriculum> selectByCurriculum(String classcode, String day);
}