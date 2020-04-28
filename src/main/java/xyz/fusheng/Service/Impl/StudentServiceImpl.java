/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StudentServiceImpl
 * Author:   25610
 * Date:     2020/2/26 11:42
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.Service.Impl;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.Service.StudentService;
import xyz.fusheng.Service.TeacherService;
import xyz.fusheng.common.MD5;
import xyz.fusheng.common.ResultBase;
import xyz.fusheng.common.ResultUtil;
import xyz.fusheng.entity.*;
import xyz.fusheng.repository.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private TStudentRepository tStudentRepository;
    @Autowired
    private TCurriculumRepository tCurriculumRepository;
    @Autowired
    private TPerformanceRepository tPerformanceRepository;
    @Autowired
    private TLeaveRepository  tLeaveRepository ;
    @Autowired
    private TFeedbackRepository tFeedbackRepository ;
    @Autowired
    private THomeworkRepository tHomeworkRepository ;
    @Autowired
    private TeacherService  teacherService;
    @Autowired
    private TTeacherRepository tTeacherRepository ;

    @Autowired
    private TCourseRepository tCourseRepository;


    @Override
    public ResultBase login(String code, String password , String role) {
        if ("1".equals(role)){
            //TODO 查询数据库中的密码
            TStudent  studen = tStudentRepository.selectByPrimaryCode(code);
            if (studen ==null ){
                return     ResultUtil.fail("账号密码错误");
            }
            String pass = MD5.MD5Encode(password);
            String originalPassword = studen.getPassword();
            if (originalPassword.equals(pass)){
                //TODO  登录成功
                return  ResultUtil.success("登录成功",studen);
            }else {
                //TODO  账号密码错误
                return    ResultUtil.fail("账号密码错误");
            }
        }else {
            return   teacherService.login(code, password);
        }

    }

    @Override
    public ResultBase studentEdl(String  studentCode,String password) {
        String pass = MD5.MD5Encode(password);
        //TODO 查询数据库中的密码
        TStudent  studen = tStudentRepository.selectByPrimaryCode(studentCode);
        if (studen ==null ){
            return     ResultUtil.fail("修改失败");
        }
        studen.setPassword(pass);
        int i = tStudentRepository.updateByPrimaryKey(studen);
        return  ResultUtil.success("修改成功",i);
    }

    @Override
    public ResultBase selectByCode(String code) {
        TStudent tStudent = tStudentRepository.selectByPrimaryCode(code);
        if (tStudent == null){
            //TODO  登录成功
            return  ResultUtil.success("成功",0);
        }else {
            //TODO  账号密码错误
            return    ResultUtil.fail("编码重复");
        }
    }

    @Override
    public ResultBase selectByCurriculum(String code) {
        //TODO 循环获取5天课程表
        Map<Integer ,List<TCurriculum>> hashmaps = new HashMap();
        for (int  day =1 ;day<=5 ;day++){
            List<TCurriculum> tCurriculums=  tCurriculumRepository.selectByCurriculum(code,day+"");
            hashmaps.put(day,tCurriculums);
        }
        return  ResultUtil.success("成功",hashmaps);
    }

    @Override
    public ResultBase selectByPerformance(String studentCode) {
         List<TPerformance> lists = tPerformanceRepository.selectByPerformance(studentCode);
        return  ResultUtil.success("成功",lists);
    }

    @Override
    public ResultBase addLeave(TLeave tLeave) {
        int insert = tLeaveRepository.insert(tLeave);
        return  ResultUtil.success("提交成功!",insert);
    }

    @Override
    public ResultBase addFeedback(TFeedback feedback) {
        int insert = tFeedbackRepository.insert(feedback);
        return  ResultUtil.success("提交成功!",insert);
    }

    @Override
    public ResultBase selectLeave(String studentCode) {
        List<TLeave> tLeaves = tLeaveRepository.selectLeave(studentCode);
        return  ResultUtil.success("提交成功!",tLeaves);
    }

    @Override
    public ResultBase selectFeedback(String studentCode) {
        List<TFeedback> tFeedbacks = tFeedbackRepository.selectFeedback(studentCode);
        return  ResultUtil.success("提交成功!",tFeedbacks);
    }

    @Override
    public ResultBase selectHomework(String studentCode) {

        TStudent tStudent = tStudentRepository.selectByPrimaryCode(studentCode);
        String classcode = tStudent.getClasscode();
        List<THomework> tHomeworks = tHomeworkRepository.selectHomework(classcode);
        return  ResultUtil.success("成功",tHomeworks);

    }

    @Override
    public ResultBase registere(String name, String code, String password, String classs, String sex, String coursecode, String role) {
        String pass = MD5.MD5Encode(password);
        if ("1".equals(role)){
            //TODO 学生
            TStudent student = new   TStudent() ;
            student.setCode(code);
            student.setName(name);
            student.setPassword(pass);
            student.setClasscode(classs);
            student.setSex(sex);
            student.setRole(role);
            //TODO 生成成绩单
            TPerformance tPerformance = new  TPerformance();
            tPerformance.setScore("122");
            tPerformance.setTeachername("ST0000");
            tPerformance.setTeachercode("ST0000");
            tPerformance.setCoursecode("chineseLanguage");
            tPerformance.setCoursename("语文");
            tPerformance.setPeriodname("期末考试");
            tPerformance.setStudentcode(student.getCode());
            tPerformance.setStudenname(student.getName());
            tPerformanceRepository.insert(tPerformance);
            int i = tStudentRepository.insertSelective(student);
            return  ResultUtil.success("成功",student);
        }else {
            //TODO 查询课程
            TCourse course = tCourseRepository.selectByCode(coursecode);
            TTeacher teacher = new   TTeacher () ;
            teacher.setName(name);
            teacher.setCode(code);
            teacher.setPassword(pass);
            teacher.setSex(sex);
            teacher.setClasscode(classs);
            teacher.setClasscode("115");
            teacher.setCoursecode(coursecode);
            teacher.setCoursename(course.getCoursename());
            teacher.setRole(role);
            teacher.setClassname("115班");
            tTeacherRepository.insert(teacher);
            return  ResultUtil.success("成功",teacher);
        }
    }

    @Override
    public ResultBase selectDoctorClasscode(String classcode) {
        List<TTeacher>  lists =   tTeacherRepository.selectDoctorClasscode(classcode);
        return  ResultUtil.success("成功",lists);

    }


}
