package com.chengshi.eurkeaconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: tian
 * @date: 2018-12-08 17:10
 */
@RestController
public class DcController {
    @Autowired
    RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(DcController.class);

    @GetMapping("/consumer")
    public String dc() {
        logger.info("ribbon-consumer");
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }


    @GetMapping("ping")
    public String ping() {
        return "ping success !";
    }

}
