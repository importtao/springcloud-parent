package me.importtao.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author importtao
 * @since 2019-11-12
 */

@Data
@Accessors(chain = true)
@Table(name="planet_kid")
@ApiModel(value="PlanetKid对象", description="")
public class PlanetKid   {

    private static final long serialVersionUID=1L;
@Id
@KeySql(useGeneratedKeys = true)
private Long id;

    @ApiModelProperty(value = "孩子姓名")
    private String name;

    @ApiModelProperty(value = "会员卡号")
    private String number;

    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @ApiModelProperty(value = "孩子年级")
    private String grade;

    @ApiModelProperty(value = "学校")
    private String school;

    @ApiModelProperty(value = "性别  1男  2女")
    private Integer sex;

    @ApiModelProperty(value = "服务id")
    private String parentId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    private Integer deleted;

    @ApiModelProperty(value = "孩子类型【1：线上学员(即非管理平台下的学员)  2:线下学员  另外 如果有会员卡  是会员】")
    private Integer type;

    @ApiModelProperty(value = "创建人")
    private String createUser;

    @ApiModelProperty(value = "学费")
    private Double tuition;

    @ApiModelProperty(value = "孩子备注")
    private String remark;

    @ApiModelProperty(value = "孩子身份标识：1：普通用户；2：学员；3：会员；")
    private Integer identity;


}
