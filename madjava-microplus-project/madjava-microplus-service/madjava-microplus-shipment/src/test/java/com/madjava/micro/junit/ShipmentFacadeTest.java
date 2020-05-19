package com.madjava.micro.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.madjava.micro.dto.shipment.ShipmentAdjustmentTaskData;
import com.madjava.micro.dto.shipment.ShipmentTopologyData;
import com.madjava.micro.facade.shipment.ShipmentAdjustmentTaskFacade;
import com.madjava.micro.facade.shipment.ShipmentNodeFacade;

/**
 * SpringBoot 测试类
 *
 * @RunWith:启动器 SpringJUnit4ClassRunner.class：让 junit 与 spring 环境进行整合
 * @SpringBootTest(classes={App.class}) 1, 当前类为 springBoot 的测试类
 * @SpringBootTest(classes={App.class}) 2, 加载 SpringBoot 启动类。启动springBoot
 * junit 与 spring 整合@Contextconfiguartion("classpath:applicationContext.xml")
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@AcitveProfiles
//@ContextConfiguration(locations = {"classpath*:/spring-context.xml"})
public class ShipmentFacadeTest {
//    @Autowired
//    private TestRestTemplate restTemplate;
    
    @Autowired
    private ShipmentNodeFacade shipmentNodeFacade;

    @Autowired
    private ShipmentAdjustmentTaskFacade shipmentAdjustmentTaskFacade;
    
    @Test
    public void testSaveTopology(){
    	String objectStr = "{\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"shipmentNodeList\":[{\"adjustmentStatus\":\"string\",\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"currentQuantity\":200,\"floorNumber\":1,\"id\":\"1\",\"nodeName\":\"string\",\"nodeStatus\":\"string\",\"proportion\":1,\"quantityFormula\":\"string\",\"shipmentNodeParentLineDataList\":[],\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1},{\"adjustmentStatus\":\"string\",\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"currentQuantity\":0,\"floorNumber\":2,\"id\":\"2\",\"nodeName\":\"string\",\"nodeStatus\":\"string\",\"proportion\":0.2,\"quantityFormula\":\"string\",\"shipmentNodeParentLineDataList\":[{\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"id\":\"string\",\"nodeId\":\"2\",\"parentNodeId\":\"1\",\"parentProportion\":0.2,\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1}],\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1},{\"adjustmentStatus\":\"string\",\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"currentQuantity\":0,\"floorNumber\":2,\"id\":\"3\",\"nodeName\":\"string\",\"nodeStatus\":\"string\",\"proportion\":0.3,\"quantityFormula\":\"string\",\"shipmentNodeParentLineDataList\":[{\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"id\":\"string\",\"nodeId\":\"3\",\"parentNodeId\":\"1\",\"parentProportion\":0.3,\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1}],\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1},{\"adjustmentStatus\":\"string\",\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"currentQuantity\":0,\"floorNumber\":2,\"id\":\"4\",\"nodeName\":\"string\",\"nodeStatus\":\"string\",\"proportion\":0.5,\"quantityFormula\":\"string\",\"shipmentNodeParentLineDataList\":[{\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"id\":\"string\",\"nodeId\":\"string\",\"parentNodeId\":\"1\",\"parentProportion\":0.5,\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1}],\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1},{\"adjustmentStatus\":\"string\",\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"currentQuantity\":0,\"floorNumber\":3,\"id\":\"5\",\"nodeName\":\"string\",\"nodeStatus\":\"string\",\"proportion\":1,\"quantityFormula\":\"string\",\"shipmentNodeParentLineDataList\":[{\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"id\":\"string\",\"nodeId\":\"string\",\"parentNodeId\":\"3\",\"parentProportion\":1,\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1},{\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"id\":\"string\",\"nodeId\":\"string\",\"parentNodeId\":\"4\",\"parentProportion\":1,\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1}],\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1}],\"tenantCode\":\"shipment\",\"topologyId\":\"string\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1}";
    	ShipmentTopologyData topData = JSONObject.parseObject(objectStr, ShipmentTopologyData.class);
    	String topId = shipmentNodeFacade.saveTopology(topData).getSerializableData();
    	assertNotNull(topId);
    	System.out.println(topId);
    	
    }
    
    @Test
    public void testSave(){
    	String objectStr = "{\"adjustmentQuantity\":100,\"createTime\":\"2020-05-14 00:00:00\",\"createUser\":\"admin\",\"currentQuantity\":200,\"tenantCode\":\"shipment\",\"topologyId\":\"469283459553153024\",\"updateTime\":\"2020-05-14 00:00:00\",\"updateUser\":\"admin\",\"version\":1}";
    	ShipmentAdjustmentTaskData taskData = JSONObject.parseObject(objectStr, ShipmentAdjustmentTaskData.class);
    	//调用saveTopology()获取的返回值,每次都不一样
    	String topologyId = "469283459553153024";
    	taskData.setTopologyId(topologyId);
    	assertTrue(shipmentAdjustmentTaskFacade.save(taskData));
    }
}
