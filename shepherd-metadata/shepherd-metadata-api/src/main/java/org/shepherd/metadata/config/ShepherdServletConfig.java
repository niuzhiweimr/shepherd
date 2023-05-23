package org.shepherd.metadata.config;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShepherdServletConfig implements Serializable {

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
     * 是否启用mock
     */
    private String mockEnabled;

    /**
     * 接口mock配置
     */
    private String mockData;

    /**
     * 代理下游服务配置
     */
    private InvokerConfig invokerConfig;

}
