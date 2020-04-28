package xyz.fusheng.entity;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class TPerformance implements Serializable {
    private Integer id;


    /**
     * 分数
     */
    @ApiModelProperty(position = 1, value = "分数" )
    private String score;

    @ApiModelProperty(position = 2, value = "评分的老师名称" )
    private String teachername;
    @ApiModelProperty(position = 3, value = "评分的老师编码" )
    private String teachercode;
    @ApiModelProperty(position = 4, value = "课程编码" )
    private String coursecode;
    @ApiModelProperty(position = 5, value = "课程名称" )
    private String coursename;

    @ApiModelProperty(position = 6, value = "考试时间名称 (如期末考试)" )
    private String periodname;
    @ApiModelProperty(position = 7, value = "学生编码" )
    private String studentcode;
    @ApiModelProperty(position = 8, value = "学生姓名" )
    private String studenname;


    @ApiModelProperty(position = 9, value = "创建时间" )
    private Date createtime = new Date();
    @ApiModelProperty(position = 10, value = "更新时间" )
    private Date update = new Date();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getTeachercode() {
        return teachercode;
    }

    public void setTeachercode(String teachercode) {
        this.teachercode = teachercode;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getPeriodname() {
        return periodname;
    }

    public void setPeriodname(String periodname) {
        this.periodname = periodname;
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode;
    }

    public String getStudenname() {
        return studenname;
    }

    public void setStudenname(String studenname) {
        this.studenname = studenname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }
}