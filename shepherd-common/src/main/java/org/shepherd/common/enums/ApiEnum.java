package org.shepherd.common.enums;

import lombok.Getter;

/**
 * 支持的协议,用于protocol层{@see shepherd-protocol}
 *
 * @author zhiwe.niu
 */
@Getter
public enum ApiEnum {

    /**
     * H5/APP 接口
     */
    H5_APP,

    /**
     * 开放平台接口
     */
    OPEN_API,

    /**
     * 资源接口
     */
    RESOURCE_API,



}
