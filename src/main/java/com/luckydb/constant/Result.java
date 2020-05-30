package com.luckydb.constant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public final class Result<T> implements Serializable {

	private static final Logger logger = LoggerFactory.getLogger(Result.class);

	private static final long serialVersionUID = 1L;

	private Integer code;
	private String msg;
	private T datas;

	public Result() {
	}

	private Result(int code, String msg, T datas) {
		this.code = code;
		this.msg = msg;
		this.datas = datas;
	}

	private Result(ResultCode resultCode, T datas) {
		this.code = resultCode.code();
		this.msg = resultCode.msg();
		this.datas = datas;
	}

	public static <T> Result<T> error(ResultCode resultCode) {
		return new Result<T>(resultCode, null);
	}

	public static <T> Result<T> error(int code, String msg) {
		return new Result<T>(code, msg, null);
	}

	public static <T> Result<T> error(String msg) {
		return new Result<T>(ResultCode.INTERNAL_SERVER_ERROR.code(), msg, null);
	}

	public static <T> Result<T> success() {
		return success(null);
	}

	public static <T> Result<T> success(T data) {
		return new Result<T>(ResultCode.SUCCESS, data);
	}

	public T getDatas() {
		return this.datas;
	}

	public void setDatas(T datas) {
		this.datas = datas;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
