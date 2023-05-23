package org.shepherd.metadata;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProxyServiceConfig implements Serializable {

    /**
     * 应用名称
     */
    private String proxyApplicationName;

    /**
     * 应用协议
     */
    private String proxyApplicationProtocol;

    /**
     * 限流配置
     */
    private FlowControlRuleConfig flowControlRuleConfig;
}
