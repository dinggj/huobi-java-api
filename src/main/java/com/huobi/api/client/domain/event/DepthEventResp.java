package com.huobi.api.client.domain.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huobi.api.client.domain.Depth;
import lombok.Getter;
import lombok.Setter;

/**
 * created by jacky. 2018/7/24 8:43 PM
 */
@Getter
@Setter
public class DepthEventResp {
    private String id;
    private String rep;
    private String status;
    private long ts;
    private Depth data;
    @JsonProperty("err-code")
    private String errCode;
    @JsonProperty("err-msg")
    private String errMsg;
}
