package com.madjava.micro.controller.backend.v2;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madjava.micro.dto.PageResponseData;
import com.madjava.micro.dto.ResultData;
import com.madjava.micro.dto.shipment.ShipmentNodeData;
import com.madjava.micro.dto.shipment.ShipmentTopologyData;
import com.madjava.micro.enumtype.MessageEnum;
import com.madjava.micro.facade.shipment.ShipmentNodeFacade;
import com.madjava.micro.service.ShipmentNodeService;
import com.madjava.micro.service.id.generator.IdGenerator;

/**
 * @Classname ShipmentNodeController
 * @Description 出货节点控制器
 * @Date 2020-05-18 00:23:14
 * @Created by yibin.lu
 */
@RestController
@RequestMapping("/shipmentnode")
public class ShipmentNodeController {

    @Autowired
    private ShipmentNodeService shipmentNodeService;

    @Autowired
    private ShipmentNodeFacade shipmentNodeFacade;

	@Autowired
	private IdGenerator idGenerator;
    
    /**
     * 保存
     */
    @PostMapping("/saveTopology")
    @ApiOperation("保存出货路线拓扑图")
    public ResultData<String> saveTopology(@RequestBody ShipmentTopologyData shipmentTopologyData){
		return shipmentNodeFacade.saveTopology(shipmentTopologyData);
    }
    
    /**
     * 获取节点id
     */
    @PostMapping("/getNodeId")
    @ApiOperation("获取节点id")
    public ResultData<String> getNodeId(){
        return new ResultData<String>(String.valueOf(idGenerator.generateId()), MessageEnum.SUCCESS);
    }
     
}
