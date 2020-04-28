package xyz.fusheng.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.Service.StudentService;
import xyz.fusheng.Service.TeacherService;
import xyz.fusheng.common.ResultBase;
import xyz.fusheng.entity.THomework;
import xyz.fusheng.entity.TStudent;
import xyz.fusheng.entity.TTeacher;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping("/teacher")
@Api(value = "/教师")
public class TeacherController {

    @Autowired
    private TeacherService teacherService ;



    @ApiOperation(value = "教师编辑(修改密码)")
    @GetMapping(value = "/teacher-edl"  ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  teacherEdl(String teacherCode ,String password){
        return   teacherService.teacherEdl( teacherCode , password);
    }


    @ApiOperation(value = "注册的时候检查教师编码是否重复( 这个接口可用可不用)")
    @GetMapping(value = "/teacher-one" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectByCode(String teacherCode){
        return   teacherService.selectByCode(teacherCode);
    }


    @ApiOperation(value = "审批学生请假申请")
    @GetMapping(value = "/edl-leave" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  edlLeave(  String leaveId ,
                                 String status ){
        return   teacherService.edlLeave(leaveId,status);
    }

    @ApiOperation(value = "发布作业or任务")
    @PostMapping(value = "/add-homework" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  addHomework(@RequestBody THomework homework){
        return   teacherService.addHomework(homework);
    }

    @ApiOperation(value = "查询教师本人发布过的作业or任务")
    @GetMapping(value = "/select-homework" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectHomework(   String teacherCode){
        return   teacherService.selectHomework(teacherCode);
    }


    @ApiOperation(value = "查询班级里面, 学生反馈的问题")
    @GetMapping(value = "/select-feedback" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectFeedback(String teacherCode){
        return   teacherService.selectFeedback(teacherCode);
    }

    @ApiOperation(value = "查询学生们的请假申请")
    @GetMapping(value = "/select-leave" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectLeave(  String teacherCode ){
        return   teacherService.selectLeave(teacherCode);
    }

    @ApiOperation(value = "获取课程目录列表(这个接口 可用,可不用 )")
    @GetMapping(value = "/select-course" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectCourse(  ){
        return   teacherService.selectCourse();
    }

    @ApiOperation(value = "获取班级列表(这个接口 可用,可不用 )")
    @GetMapping(value = "/select-class" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectByClass(  ){
        return   teacherService.selectByClass();
    }


}
