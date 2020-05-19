package com.madjava.micro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class SessionKey implements Serializable {
    private static final long serialVersionUID = -2234543920046786005L;

    @JsonProperty(value = "openid")
    private String openId;

    @JsonProperty(value = "session_key")
    private String sessionKey;
}
