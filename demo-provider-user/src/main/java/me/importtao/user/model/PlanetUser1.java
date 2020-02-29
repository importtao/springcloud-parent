package me.importtao.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.Document;
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
@Table(name="planet_user_1")
@ApiModel(value="PlanetUser1对象", description="")
@Document(indexName = "user",type = "user", shards = 2,replicas = 0, refreshInterval = "-1")
public class PlanetUser1   {

    private static final long serialVersionUID=1L;
@Id
@KeySql(useGeneratedKeys = true)
private Long id;

    @ApiModelProperty(value = "用户id")

    private String userId;

    private String nickName;

    @ApiModelProperty(value = "0,女；1，男")
    private Integer sexCode;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "头像")
    private String image;

    private String birthday;

    private Date createTime;

    private Date modifyTime;

    @ApiModelProperty(value = "用户身份 1.普通用户 2.授课老师 3.机构账号 4.写死的超级管理员 5.非授课老师")
    private Integer identity;

    @ApiModelProperty(value = "//微信号")
    private String thirdAccount;

    @ApiModelProperty(value = "机构id")
    private Long sellerId;

    @ApiModelProperty(value = "约定：后台管理的渠道就是 渠道id，个人直接生成的专属链接就是 userId")
    private String channel;

    @ApiModelProperty(value = "来源的具体活动名字和id【name+id】，比如 开业活动_15 ")
    private String activity;

    @ApiModelProperty(value = "创建人")
    private String createUser;

    @ApiModelProperty(value = "账号 过期时间")
    private Date expireTime;

    @ApiModelProperty(value = "账号有效时间。开始时间")
    private Date startTime;

    @ApiModelProperty(value = "当前用户正在管理那个孩子，存的是孩子父母的userId")
    private String kidParent;

    @ApiModelProperty(value = "离职状态：0在职  1离职")
    private Integer quitState;

    private Integer deleted;

    @ApiModelProperty(value = "渠道id")
    private Long channelId;

    @ApiModelProperty(value = "手机号对应的归属地")
    private String address;

    private String inviter;

    private Integer inviterType;

    @ApiModelProperty(value = "用户状态 1.潜客 2.意向 3.预约 4.到店 5.学员 6.会员")
    private Integer userStatus;

    @ApiModelProperty(value = "校区id")
    private Long campusId;

    @ApiModelProperty(value = "用户身份标识  1：学生  2：老师")
    private Integer status;


}
