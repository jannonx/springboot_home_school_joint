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
public class TLeave implements Serializable {
    private Integer id;
    @ApiModelProperty(position = 4, value = "学生姓名" )
    private String studentname;
    @ApiModelProperty(position = 4, value = "学生编码" )
    private String studentcode;

    /**
     * 请假理由
     */
    @ApiModelProperty(position = 4, value = "请假理由" )
    private String reason;
    @ApiModelProperty(position = 4, value = "请假开始时间" )
    private Date starttime;
    @ApiModelProperty(position = 4, value = "请假结束时间" )
    private Date endtime;
    @ApiModelProperty(position = 4, value = "审批人姓名(其实就是老师姓名)" )
    private String approvername;
    @ApiModelProperty(position = 4, value = "审批人编码(其实就是老师编码)" )
    private String approvercode;

    /**
     * 审批意见
     */
    @ApiModelProperty(position = 4, value = "审批意见" )
    private String opinion;
    @ApiModelProperty(position = 4, value = "0 未审批 ,1 已经审批" )
    private Integer status;
    @ApiModelProperty(position = 4, value = "创建时间" )
    private Date createtime = new Date();
    @ApiModelProperty(position = 4, value = "结束时间" )
    private Date updatetime = new Date();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getApprovername() {
        return approvername;
    }

    public void setApprovername(String approvername) {
        this.approvername = approvername;
    }

    public String getApprovercode() {
        return approvercode;
    }

    public void setApprovercode(String approvercode) {
        this.approvercode = approvercode;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}