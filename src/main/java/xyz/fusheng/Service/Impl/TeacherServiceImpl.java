package xyz.fusheng.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.Service.TeacherService;
import xyz.fusheng.common.MD5;
import xyz.fusheng.common.ResultBase;
import xyz.fusheng.common.ResultUtil;
import xyz.fusheng.entity.*;
import xyz.fusheng.repository.*;

import java.util.List;

@Service
public class TeacherServiceImpl  implements TeacherService {
    @Autowired
    private TTeacherRepository  tTeacherRepository ;

    @Autowired
    private THomeworkRepository tHomeworkRepository ;
    @Autowired
    private TFeedbackRepository tFeedbackRepository ;
    @Autowired
    private TLeaveRepository tLeaveRepository ;
    @Autowired
    private TCourseRepository tCourseRepository ;

    @Autowired
    private   TClassRepository  tClassRepository ;


    @Override
    public ResultBase login(String code, String password) {
        //TODO 查询数据库中的密码
        TTeacher tTeacher = tTeacherRepository.selectByPrimaryCode(code);
        if (tTeacher ==null ){
            return     ResultUtil.fail("账号密码错误");
        }
        String pass = MD5.MD5Encode(password);
        String originalPassword = tTeacher.getPassword();
        if (originalPassword.equals(pass)){
            //TODO  登录成功
            return  ResultUtil.success("登录成功",tTeacher);
        }else {
            //TODO  账号密码错误
            return    ResultUtil.fail("账号密码错误");
        }
    }

    @Override
    public ResultBase teacherEdl(String teacherCode ,String password ) {
        String pass = MD5.MD5Encode(password);
        //TODO
        TTeacher tTeacher = tTeacherRepository.selectByPrimaryCode(teacherCode);
        if (tTeacher == null ){
            return    ResultUtil.fail("修改失败");
        }
        tTeacher.setPassword(pass);
        int i = tTeacherRepository.updateByPrimaryKey(tTeacher);
        return  ResultUtil.success("修改成功",i);
    }

    @Override
    public ResultBase selectByCode(String teacherCode) {
        TTeacher tTeacher = tTeacherRepository.selectByPrimaryCode(teacherCode);
        if (tTeacher == null){
            //TODO  登录成功
            return  ResultUtil.success("成功",0);
        }else {
            //TODO  账号密码错误
            return    ResultUtil.fail("编码重复");
        }
    }

    @Override
    public ResultBase addHomework(THomework homework) {
        int insert = tHomeworkRepository.insert(homework);
        return  ResultUtil.success("成功",homework);
    }

    @Override
    public ResultBase selectHomework(String teacherCode) {
        List<THomework> tHomeworks = tHomeworkRepository.selectHomework(teacherCode);
        return  ResultUtil.success("成功",tHomeworks);
    }

    @Override
    public ResultBase selectFeedback(String teacherCode) {
        List<TFeedback> tFeedbacks = tFeedbackRepository.selectFeedback(teacherCode);
        return  ResultUtil.success("成功",tFeedbacks);
    }

    @Override
    public ResultBase edlLeave(String leaveId, String status) {
        TLeave tLeave = tLeaveRepository.selectByPrimaryKey(Integer.valueOf(leaveId));
        tLeave.setStatus(Integer.valueOf(status));
        tLeave.setOpinion("同意!");
        tLeaveRepository.updateByPrimaryKeySelective(tLeave);
        return  ResultUtil.success("成功",tLeave);

    }

    @Override
    public ResultBase selectLeave(String teacherCode) {
        List<TLeave> tLeaves =  tLeaveRepository.selectLeave(teacherCode);
        return  ResultUtil.success("成功",tLeaves);
    }

    @Override
    public ResultBase selectCourse() {
        List<TCourse> lists  = tCourseRepository.selectByAll();
        return  ResultUtil.success("成功",lists);
    }

    @Override
    public ResultBase selectByClass() {
        List<TClass> lists  = tClassRepository.selectByAll();
        return  ResultUtil.success("成功",lists);
    }
}
