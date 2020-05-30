package com.luckydb.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
@ApiModel("图片、文件")
public class FilesDTO implements Serializable {

    @ApiModelProperty(value = "ID", required = true)
    private Integer id;

    @ApiModelProperty(value = "文件地址", required = true)
    private String url;

    @ApiModelProperty(value = "时间", required = true)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    private static final long serialVersionUID = 1L;

}