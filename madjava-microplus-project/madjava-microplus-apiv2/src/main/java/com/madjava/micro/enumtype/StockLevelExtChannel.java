package com.madjava.micro.enumtype;

public enum StockLevelExtChannel implements AbstractEnum {

    SHARINGPOOL("SHARINGPOOL");

    private String name;

    StockLevelExtChannel(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
