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
public class TCourse implements Serializable {
    private Integer id;
    @ApiModelProperty(position = 1, value = "课程名" )
    private String coursecode;
    @ApiModelProperty(position = 2, value = "课程编码" )
    private String coursename;
    @ApiModelProperty(position = 3, value = "创建时间" )
    private Date createtime = new Date();
    @ApiModelProperty(position = 4, value = "更新时间" )
    private Date updatetime = new Date();

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}