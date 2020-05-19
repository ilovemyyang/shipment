package com.madjava.micro.enumtype;

public enum OperateStockStatus {

    AWAITING_OPERATE(Integer.valueOf(0), "待操作"),

    OPERATE_SUCCESS(Integer.valueOf(2), "操作库存成功"),

    OPERATE_FAIL(Integer.valueOf(-1), "操作库存失败");

    private Integer	index;
    private String	message;

    private OperateStockStatus(final Integer index, String message) {
        this.index = index;
        this.message = message;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getMessage() {
        return message;
    }
}

