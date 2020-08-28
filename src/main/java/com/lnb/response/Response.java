package com.lnb.response;

import com.lnb.util.Constant;
import lombok.Data;

@Data
public class Response {
    private String code;
    private String msg;
    private Boolean success;
    private Object date;


    public Response(String code, String msg, Boolean success, Object date) {
        this.code = code;
        this.msg = msg;
        this.success = success;
        this.date = date;
    }

    public static Response getSuccessResponse(Object date){
        return new Response(Constant.SUCCESS_CODE, "执行成功", true, date);
    }

    public static Response getErrorResponse(){
        return new Response(Constant.ERROR_CODE, "执行失败", true, null);
    }
}
