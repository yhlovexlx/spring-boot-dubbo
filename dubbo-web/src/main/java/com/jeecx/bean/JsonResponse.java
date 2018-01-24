package com.jeecx.bean;

public class JsonResponse {

    private int code;
    
    private String msg;
    
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    public static JsonResponse success() {
        JsonResponse json = new JsonResponse();
        json.setCode(0);
        json.setMsg("success");
        return json;
    }
    
    public static JsonResponse error() {
        JsonResponse json = new JsonResponse();
        json.setCode(1);
        json.setMsg("error");
        return json;
    }
    
    
}
