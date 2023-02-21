package com.lrn.httpclient;

import java.util.HashMap;

import com.alibaba.fastjson.JSON;

/**
 * @author 邓伟
 * @date 2023/02/21
 * @since 2023/2/21 4:28 PM
 */
public abstract class AbstractHttpClient {
    /**
     * 异步GET
     */
    public abstract void invoke();

    /**
     * 同步POST
     */
    public abstract void invokePost();
    String prepareRequest() {
        var value = new HashMap<String, String>() {{
            put("name", "小黑说Java");
            put("page", "18");
        }};
        return JSON.toJSONString(value);
    }
}
