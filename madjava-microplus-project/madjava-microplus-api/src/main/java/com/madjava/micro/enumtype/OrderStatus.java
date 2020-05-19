package com.madjava.micro.enumtype;

public enum OrderStatus {

    NEW(Integer.valueOf(500), "已接单", Boolean.FALSE),

    PREPARE_SOURCING(Integer.valueOf(1_000), "准备寻源", Boolean.FALSE),

    AWAITING_SOURCING_RESULT(Integer.valueOf(2_000), "等待寻源结果", Boolean.FALSE),

    SOURCING_FAILURE(Integer.valueOf(3_000), "寻仓失败", Boolean.FALSE),

    SOURCING_SUCCESS(Integer.valueOf(4_000), "寻仓成功", Boolean.FALSE),

    PREPARE_ALLOCATE(Integer.valueOf(5_000), "准备分配", Boolean.FALSE),

    AWAITING_ALLOCATE_RESULT(Integer.valueOf(6_000), "等待分配结果", Boolean.FALSE),

    ALLOCATE_SUCCESS(Integer.valueOf(7_000), "已分配仓库", Boolean.FALSE),

    PART_TRANSFERED(Integer.valueOf(8_000), "部分出库", Boolean.FALSE),

    REFUSE_CANCELL(Integer.valueOf(8_000), "拒绝取消", Boolean.FALSE),

    ALL_TRANSFERED(Integer.valueOf(9_000), "全部出库", Boolean.FALSE),

    PART_RECEIVE(Integer.valueOf(10_000), "部分签收", Boolean.FALSE),

    ALL_RECEIVE(Integer.valueOf(11_000), "全部签收", Boolean.FALSE),

    CANCELLING(Integer.valueOf(99_000), "取消申请中", Boolean.FALSE),

    CANCELLED(Integer.valueOf(100_000), "已取消", Boolean.FALSE),

    COMPLETED(Integer.valueOf(100_000), "订单完结", Boolean.FALSE);

    private Integer	index;
    private String	message;
    private Boolean	global;

    private OrderStatus(final Integer index, String message,
                        final Boolean global) {
        this.index = index;
        this.message = message;
        this.global = global;
    }

    public Integer getIndex() {
        return this.index;
    }

    public Boolean getGlobal() {
        return this.global;
    }

    public String getMessage() {
        return message;
    }

    public static OrderStatus get(Integer index) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getIndex().intValue() == index.intValue()) { return status; }
        }
        return null;
    }
}