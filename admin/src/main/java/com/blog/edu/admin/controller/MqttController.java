package com.blog.edu.admin.controller;

import com.blog.edu.admin.model.Mqtt;
import com.blog.edu.core.service.MqttPushClient;
import com.blog.edu.core.service.MqttService;
import com.oracle.tools.packager.Log;
import groovy.util.logging.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName MqttController
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 2018-12-06
 **/
@RestController
@Log4j
public class MqttController {
    @Autowired
    MqttPushClient mqttPushClient;
    //MqttGetway mqttGetway;
    @GetMapping(value="/sendMsg")
    public String sendMsg(){
        mqttPushClient.publish(0,false,"topic","asgageaggaegaeg");
        return "success";

    }
    @GetMapping(value="/subMsg")
    public String subMsg(){
        mqttPushClient.subscribe("topic");
        return "success";
    }
}
