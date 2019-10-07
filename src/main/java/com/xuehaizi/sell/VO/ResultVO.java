package com.xuehaizi.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -2603003287792810529L;
    //错误码
    private Integer code;
    //提示信息
    private String msg;
    //具体内容
    private T data;
}
