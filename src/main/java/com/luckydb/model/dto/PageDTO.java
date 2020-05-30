package com.luckydb.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@ApiModel("分页列表")
public class PageDTO<T> {

	public PageDTO(int pageNum, int pageSize, int pages, long total, List<T> list) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.pages = pages;
		this.total = total;
		this.list = list;
	}

	@ApiModelProperty(value = "当前页")
	private int pageNum;
	@ApiModelProperty(value = "每页条数")
	private int pageSize;
	@ApiModelProperty(value = "总页数")
	private int pages;
	@ApiModelProperty(value = "总条数")
	private long total;
	@ApiModelProperty(value = "结果集")
	private List<T> list;

}
