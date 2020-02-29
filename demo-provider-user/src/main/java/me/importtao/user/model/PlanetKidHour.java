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
@Table(name="planet_kid_hour")
@ApiModel(value="PlanetKidHour对象", description="")
public class PlanetKidHour   {

    private static final long serialVersionUID=1L;
@Id
@KeySql(useGeneratedKeys = true)
private Long id;

    @ApiModelProperty(value = "孩子id,第一个版本暂时不用")
    private Long kidId;

    @ApiModelProperty(value = "用户userId")
    private String parentId;

    @ApiModelProperty(value = "课时类型(1.常规课时2.STEAM主题课时3.竞赛集训课时4.营地课时5.其他课时)")
    private Integer type;

    @ApiModelProperty(value = "剩余课时,这个是减去冻结的")
    private Double curHour;

    @ApiModelProperty(value = "总课时")
    private Double totalHour;

    @ApiModelProperty(value = "开始时间")
    private Date startTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    private Integer deleted;

    private Date createTime;

    private String createUser;


}
