package org.shepherd.metadata.config;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProxyServiceApiConfig implements Serializable {

    /**
     * 接口名称
     */
    private String proxyApiName;

    /**
     * 接口地址
     */
    private String proxyApiAddress;

    /**
     * 接口版本
     */
    private String proxyApiVersion;

    /**
     * 接口请求对象
     */
    private String proxyApiRequestClass;

    /**
     * 接口请求对象方法
     */
    private String proxyApiMethod;

    /**
     * 接口分组
     */
    private String proxyApiGroup;

    /**
     * 接口状态
     */
    private String proxyApiStatus;

    /**
     * 限流配置
     */
    private FlowControlRuleConfig flowControlRuleConfig;
}
