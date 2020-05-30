package com.luckydb.constant;

public enum ResultCode {
    SUCCESS(200, "成功"),
    PARAM_WRONG(100, "参数错误"),
    PARAM_NULL(101, "参数为空"),
    API_NO_RESULT(201, "接口未返回数据"),
    USER_NOT_LOGIN(301, "用户未登录"),
    USER_EXIST(302, "用户已存在"),
    USER_NOT_EXIST(303, "用户不存在"),
    FAIL(400, "失败"),
    UNAUTHORIZED(401, "未认证（签名错误）"),
    NOT_FOUND(404, "接口不存在"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误");

    private final int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return code;
    }

    public String msg() {
        return msg;
    }

}
