package com.madjava.micro.enumtype.shipment;

public class ShipmentEnum {

    public enum ShipmentNodeStatus {
    	EFFECT("SHIPMENT_NODE_STATUS-EFFECT", "生效"),
    	INVALID("SHIPMENT_NODE_STATUS-INVALID", "失效"),
    	SUBMITTED("SHIPMENT_NODE_STATUS-SUBMITTED", "已提交");

        private String code;

        private String name;

        ShipmentNodeStatus(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    
    public enum ShipmentNodeAdjustmentStatus {
    	SUBMITTED("SHIPMENT_NODE_ADJUSTMENT_STATUS-SUBMITTED", "已提交"),
    	ADJUSTING("SHIPMENT_NODE_ADJUSTMENT_STATUS-ADJUSTING", "调整中"),
    	ADJUSTED("SHIPMENT_NODE_ADJUSTMENT_STATUS-ADJUSTED", "调整完成");

        private String code;

        private String name;

        ShipmentNodeAdjustmentStatus(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    
}
