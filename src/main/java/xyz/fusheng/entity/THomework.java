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
public class THomework implements Serializable {
    private Integer id;
    @ApiModelProperty(position = 1, value = "教师姓名" )
    private String teachername;
    @ApiModelProperty(position = 1, value = "教师编码" )
    private String teachercode;
    @ApiModelProperty(position = 1, value = "任务内容或作业内容" )
    private String instructions;
    @ApiModelProperty(position = 1, value = "班级编码" )
    private String classcode;
    @ApiModelProperty(position = 1, value = "创建时间" )
    private Date createtime = new Date();
    @ApiModelProperty(position = 1, value = "更新时间" )
    private Date updatetime = new Date();
}