package com.ltri.nacos.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 接口返回数据格式
 *
 * @author ltri
 */
@Data
public class Results<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String successMsg = "操作成功！";

    /**
     * 返回处理消息
     */
    private String msg = "操作成功！";

    /**
     * 返回代码
     */
    private Integer code = 2000;

    /**
     * 返回数据对象 data
     */
    private T data;

    public static <T> Results<T> success() {
        return Results.of(null, 2000, successMsg);
    }

    public static <T> Results<T> success(T data) {
        return Results.of(data, 2000, successMsg);
    }

    public static <T> Results<T> success(T data, String msg, int code) {
        return Results.of(data, code, msg);
    }

    public static Results<String> success(String msg) {
        return Results.of(msg, 2000, msg);
    }

    public static <T> Results<T> error(T data, String msg, int code) {
        return Results.of(data, code, msg);
    }

    public static Results<Object> error(int code, String msg) {
        return Results.of(null, code, msg);
    }


    /**
     * 统一出参处理
     *
     * @param data
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Results<T> of(T data, int code, String msg) {
        Results<T> r = new Results<T>();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
