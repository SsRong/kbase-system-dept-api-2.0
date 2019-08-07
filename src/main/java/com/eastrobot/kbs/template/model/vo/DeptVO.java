package com.eastrobot.kbs.template.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotEmpty;

/**
 * @author shanshan.rong
 */
@SuppressWarnings("ALL")
@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
public class DeptVO extends BaseVO {

    public DeptVO(){
    }
    @NotEmpty(groups = Create.class)
    @ApiModelProperty("当前部门名称")
    private String deptName;

    @NotEmpty(groups = Update.class)
    @ApiModelProperty("当前部门上一级部门ID")
    private String parentId;

    @ApiModelProperty(value = "备注")
    private String note;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
