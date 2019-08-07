package com.eastrobot.kbs.template.model.entity;

import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "部门对象")
@Builder
@Entity
@Table(name="dept")
@Data
public class Dept extends BaseEntity {

    @Column(name="dept_name")
    private String deptName;
    @Column(name="pid")
    private String parentId;
    @Column(name="note")
    private String note;

    @Override
    public BaseEntity setId(String id) {
        return super.setId(id);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}

