package xyz.fusheng.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.fusheng.entity.TFeedback;

import java.util.List;

@Mapper
@Repository
public interface TFeedbackRepository {
    int deleteByPrimaryKey(Integer id);

    int insert(TFeedback record);

    int insertSelective(TFeedback record);

    TFeedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TFeedback record);

    int updateByPrimaryKey(TFeedback record);

    List<TFeedback> selectFeedback(String teacherCode);

}