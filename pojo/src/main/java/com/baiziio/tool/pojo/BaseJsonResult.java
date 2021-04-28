package com.baiziio.tool.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author juwencheng
 */
@Data
public class BaseJsonResult<T> {
    @ApiModelProperty(name = "code", notes = "接口状态码")
    private int code;
    @ApiModelProperty(name = "message", notes = "错误状态时，返回的信息")
    private String message;
    @ApiModelProperty(name = "data", notes = "业务数据，具体内容会根据不同业务场景而不同。")
    private T data;

    public static <T> BaseJsonResult<T> success(T data) {
        BaseJsonResult<T> response = new BaseJsonResult<T>();
        response.setCode(200);
        response.setData(data);
        response.setMessage("");
        return response;
    }
    public static <T> BaseJsonResult<T> error(Integer errorCode, String msg) {
        BaseJsonResult<T> response = new BaseJsonResult<>();
        response.setCode(errorCode);
        response.setMessage(msg);
        return response;
    }
    public static <T> BaseJsonResult<T> error(String msg) {
        return BaseJsonResult.error(10000, msg);
    }
}
