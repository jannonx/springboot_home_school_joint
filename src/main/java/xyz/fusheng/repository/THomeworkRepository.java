package xyz.fusheng.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.fusheng.entity.THomework;

import java.util.List;

@Mapper
@Repository
public interface THomeworkRepository {
    int deleteByPrimaryKey(Integer id);

    int insert(THomework record);

    int insertSelective(THomework record);

    THomework selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(THomework record);

    int updateByPrimaryKey(THomework record);

    List<THomework> selectHomework(String teacherCode);
}