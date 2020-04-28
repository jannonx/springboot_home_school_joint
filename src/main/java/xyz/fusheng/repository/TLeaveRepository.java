package xyz.fusheng.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.fusheng.entity.TLeave;

import java.util.List;

@Mapper
@Repository
public interface TLeaveRepository {
    int deleteByPrimaryKey(Integer id);

    int insert(TLeave record);

    int insertSelective(TLeave record);

    TLeave selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TLeave record);

    int updateByPrimaryKey(TLeave record);

    List<TLeave> selectLeave(String teacherCode);

}