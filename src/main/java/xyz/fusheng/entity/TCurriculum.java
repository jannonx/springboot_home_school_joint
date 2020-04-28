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
public class TCurriculum implements Serializable {
    private Integer id;
    @ApiModelProperty(position = 1, value = "课程编码" )
    private String coursecode;
    @ApiModelProperty(position = 2, value = "课程名" )
    private String coursename;
    @ApiModelProperty(position = 3, value = "课程时段 am 上午 ,pm 下午" )
    private String coursetimecode;
    @ApiModelProperty(position = 4, value = "班级编码" )
    private String classcode;
    @ApiModelProperty(position = 5, value = "1 周一  2周二 3  周三 ....." )
    private String week;
    @ApiModelProperty(position = 6, value = "创建时间" )
    private Date createtime = new Date();
    @ApiModelProperty(position = 7, value = "更新时间" )
    private Date updatetime = new Date();
}