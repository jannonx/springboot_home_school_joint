package xyz.fusheng.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.Service.StudentService;
import xyz.fusheng.common.ResultBase;
import xyz.fusheng.entity.TFeedback;
import xyz.fusheng.entity.TLeave;
import xyz.fusheng.entity.TStudent;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping("/student")
@Api(value = "/学生")
public class StudentController {
    @Autowired
    private StudentService studentService ;




    @ApiOperation(value = "学生注册/老师注册 , role 1 是学生  role 0 是教师")
    @GetMapping(value = "registere" , produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  registere(
            String name ,
            String code,
            String password ,
            String classs ,
            String sex ,
            String coursecode ,
            String role
            )
    {
        return   studentService.registere(name ,code ,password,classs,sex,coursecode,role);
    }






    @ApiOperation(value = "登录")
    @GetMapping(value = "login" , produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  login(String code , String password, String role)
    {
      return   studentService.login(code ,password ,role);
    }

    @ApiOperation(value = "学生(修改密码)")
    @GetMapping(value = "/student-edl" ,  produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  studentEdl(String  studentCode,String password){
        return   studentService.studentEdl(  studentCode, password);
    }

    @ApiOperation(value = "注册的时候检查学生编码是否重复( 这个接口可用可不用)")
    @GetMapping(value = "/student-one" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectByCode(String   studentCode)
    {
        return   studentService.selectByCode(studentCode);
    }


    @ApiOperation(value ="课程表查询")
    @GetMapping(value = "/select-curriculum" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectByCurriculum(String  classCode){
        return   studentService.selectByCurriculum(classCode);
    }


    @ApiOperation(value ="成绩查询")
    @GetMapping(value = "/select-performance" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectByPerformance(  String  studentCode){
        return   studentService.selectByPerformance(studentCode);
    }



    @ApiOperation(value ="请假")
    @PostMapping(value = "/add-leave" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  addLeave(@RequestBody TLeave tLeave){
        return   studentService.addLeave(tLeave);
    }


    @ApiOperation(value = "获取学生本人的请假申请列表")
    @GetMapping(value = "/select-leave" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectLeave(  String studentCode ){
        return   studentService.selectLeave(studentCode);
    }


    @ApiOperation(value ="问题反馈")
    @PostMapping(value = "/add-feedback" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  addFeedback(@RequestBody TFeedback feedback){
        return   studentService.addFeedback(feedback);
    }




    @ApiOperation(value ="获取学生本人的问题反馈列表")
    @GetMapping(value = "/select-feedback" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectFeedback(String studentCode ){
        return   studentService.selectFeedback(studentCode);
    }


    @ApiOperation(value = "查询学生自己班级里教师发布作业or任务")
    @GetMapping(value = "/select-homework" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectHomework( String  studentCode ){
        return   studentService.selectHomework(studentCode);
    }


    @ApiOperation(value ="根据班级查询医生")
    @GetMapping(value = "/select-doctor-classcode" ,produces = APPLICATION_JSON_UTF8_VALUE)
    public ResultBase  selectDoctorClasscode(String  classcode){
        return   studentService.selectDoctorClasscode(classcode);
    }


}
