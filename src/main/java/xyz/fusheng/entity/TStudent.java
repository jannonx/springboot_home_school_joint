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
public class TStudent implements Serializable {
    /**
     * 自增加主键
     */
    private Integer id;

    /**
     * 学生姓名
     */
    @ApiModelProperty(position = 1, value = "学生姓名" )
    private String name;

    /**
     * 密码MD5
     */
    @ApiModelProperty(position = 2, value = "密码MD5" )
    private String password;

    /**
     * 学号编码
     */
    @ApiModelProperty(position = 3, value = "学号编码" )
    private String code;

    /**
     * 0是女 1是男  
     */
    @ApiModelProperty(position = 4, value = "0是女 1是男 " )
    private String sex;

    /**
     * 班级编码
     */
    @ApiModelProperty(position = 5, value = "班级编码" )
    private String classcode ="115";
    /**
     * 班级名称
     */
    @ApiModelProperty(position = 5, value = "班级名称" )
    private String classname ="115班";

    @ApiModelProperty(position = 6, value = " 角色 1 是学生" )
    private String role = "1";
    @ApiModelProperty(position = 6, value = "创建时间" )
    private Date createtime = new Date();
    @ApiModelProperty(position = 7, value = "更新时间" )
    private Date updatetime = new Date();

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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