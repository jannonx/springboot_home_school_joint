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
public class TClass implements Serializable {

    private Integer id;
    @ApiModelProperty(position = 1, value = "班级名称" )
    private String classcame;
    @ApiModelProperty(position = 2, value = "班级编码")
    private String classcode;
    @ApiModelProperty(position = 3, value = "创建时间"  )
    private Date createtime = new Date();

    private String updatetime ;

    private static final long serialVersionUID = 1L;
}