package com.macro.mall.model.mediaMaster;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class MediaFile implements Serializable {
    private Long id;

    @ApiModelProperty(value = "文件名称")
    private String name;
    @ApiModelProperty(value = "文件路径")
    private String path;

    private String type;

    private Integer size;

    private Date createdAt;

    private Date updatedAt;
}
