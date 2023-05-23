package org.shepherd.metadata.config;

import lombok.Data;

import java.io.Serializable;

@Data
public class FlowControlRuleConfig implements Serializable {

    private double qps;

    private long avgRt;

    private long maxThread;
}
