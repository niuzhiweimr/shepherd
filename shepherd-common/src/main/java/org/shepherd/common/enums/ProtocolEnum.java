package org.shepherd.common.enums;

import lombok.Getter;

/**
 * 支持的协议,用于protocol层{@see shepherd-protocol}
 *
 * @author zhiwe.niu
 */
@Getter
public enum ProtocolEnum {

    /**
     * Dubbo是一个分布式，高性能，透明化的RPC服务框架（RPC：远程过程调用协议）
     */
    DUBBO,

    /**
     * Feign是一个声明式的Web Service客户端，它的目的就是让Web Service调用更加简单
     */
    FEIGN,

    /**
     * GRPC是一个高性能、通用的开源RPC框架，基于底层HTTP/2协议标准和协议层Protobuf序列化协议开发，支持众多的开发语言。
     */
    GRPC,

    /**
     * 超文本传输协议（Hyper Text Transfer Protocol，HTTP）是一个简单的请求-响应协议
     */
    HTTP,


}
