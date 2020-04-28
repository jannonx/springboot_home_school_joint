package xyz.fusheng.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.fusheng.entity.TClass;

import java.util.List;

@Mapper
@Repository
public interface TClassRepository {
    int insert(TClass record);

    int insertSelective(TClass record);

    List<TClass> selectByAll();


}