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

}
