package org.shepherd.metadata;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShepherdHttpServletConfig implements Serializable {

    /**
     * 请求地址
     */
    private String requestUri;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 请求contentType
     */
    private String contentType;

    /**
     * 调用配置
     */
    private InvokerConfig invokerConfig;
}
