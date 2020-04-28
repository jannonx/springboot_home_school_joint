package xyz.fusheng.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.fusheng.entity.TPerformance;

import java.util.List;

@Mapper
@Repository
public interface TPerformanceRepository {
    int deleteByPrimaryKey(Integer id);

    int insert(TPerformance record);

    int insertSelective(TPerformance record);

    TPerformance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPerformance record);

    int updateByPrimaryKey(TPerformance record);

    List<TPerformance> selectByPerformance(String studentCode);

}