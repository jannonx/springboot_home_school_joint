package xyz.fusheng.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.fusheng.common.ResultBase;
import xyz.fusheng.entity.TTeacher;

import java.util.List;

@Repository
public interface TTeacherRepository {
    int deleteByPrimaryKey(Integer id);

    int insert(TTeacher record);

    int insertSelective(TTeacher record);

    TTeacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TTeacher record);

    int updateByPrimaryKey(TTeacher record);

    TTeacher selectByPrimaryCode(String code);

    List<TTeacher> selectDoctorClasscode(String classcode);

}