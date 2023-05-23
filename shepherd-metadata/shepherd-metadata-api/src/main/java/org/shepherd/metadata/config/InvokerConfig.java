package org.shepherd.metadata.config;

import lombok.Data;

import java.io.Serializable;

@Data
public class InvokerConfig implements Serializable {

    /**
     * 是否启用mock
     */
    private String mockEnabled;

    /**
     * 接口mock配置
     */
    private String mockData;

    /**
     * 代理服务API配置
     */
    private ProxyServiceApiConfig proxyServiceApiConfig;

    /**
     * 代理服务配置
     */
    private ProxyServiceConfig proxyServiceConfig;


}
