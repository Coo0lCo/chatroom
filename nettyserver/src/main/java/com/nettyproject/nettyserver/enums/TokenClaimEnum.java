package com.nettyproject.nettyserver.enums;

public enum TokenClaimEnum {

    ID("id");

    private final String key;

    TokenClaimEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
