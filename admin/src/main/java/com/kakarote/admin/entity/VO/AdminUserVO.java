package com.kakarote.admin.entity.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author zhangzhiwei
 * 查询列表
 */
@Data
@ToString
@ApiModel("用户列表查询返回")
public class AdminUserVO {

    @ApiModelProperty("姓名")
    private String realname;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty(value = "用户ID", required = true)
    private Long userId;

    @ApiModelProperty(value = "性别，0 未选择 1、男 2、女", required = true, allowableValues = "0,1,2")
    private Integer sex;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "部门ID")
    private Integer deptId;

    @ApiModelProperty(value = "部门名称")
    private String deptName;

    @ApiModelProperty(value = "状态,0禁用,1正常,2未激活")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "岗位")
    private String post;

    @ApiModelProperty(value = "上级ID")
    private Long parentId;

    @ApiModelProperty(value = "上级名称")
    private String parentName;

    @ApiModelProperty(value = "角色ID")
    private String roleId;

    @ApiModelProperty(value = "角色ID")
    private String roleIds;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "用户头像")
    private String img;

    @ApiModelProperty(value = "是否超级管理员")
    private Boolean isAdmin;

    private Integer isReadNotice;

    private Integer emailId;

    @ApiModelProperty("用户标识,0 主账号 1 部门负责人 2 普通用户")
    private Integer userIdentity = 2;
}
