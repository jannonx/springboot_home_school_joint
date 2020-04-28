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
public class TFeedback implements Serializable {
    private Integer id;
    @ApiModelProperty(position = 1, value = "教师名称" )
    private String teachername;
    @ApiModelProperty(position = 1, value = "教师编码" )
    private String teachercode;
    @ApiModelProperty(position = 1, value = "学生名称" )
    private String studentname;
    @ApiModelProperty(position = 1, value = "学生编码" )
    private String studentscode;
    @ApiModelProperty(position = 1, value = "内容" )
    private String content;
    @ApiModelProperty(position = 1, value = "创建时间" )
    private Date createtime =  new Date();
    @ApiModelProperty(position = 1, value = "更新时间" )
    private Date updatetime = new Date();

    private static final long serialVersionUID = 1L;
}