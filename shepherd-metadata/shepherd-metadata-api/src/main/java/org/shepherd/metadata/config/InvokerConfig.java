package org.shepherd.metadata.config;

import lombok.Data;

import java.io.Serializable;

@Data
public class InvokerConfig implements Serializable {

    /**
     * 是否开启调用日志
     */
    private String logEnabled;

    /**
     * 是否开启系统保护
     */
    private String systemGuardEnabled;

    /**
     * 系统保护类型: API/Application
     */
    private String systemGuardType;

    /**
     * 代理服务API配置
     */
    private ProxyServiceApiConfig proxyServiceApiConfig;

    /**
     * 代理服务配置
     */
    private ProxyServiceConfig proxyServiceConfig;


}
