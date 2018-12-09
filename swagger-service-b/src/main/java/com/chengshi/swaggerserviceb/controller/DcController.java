package com.chengshi.swaggerserviceb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: tian
 * @date: 2018-12-09 10:15
 */
@RestController
public class DcController {
    Logger logger=LoggerFactory.getLogger(DcController.class);
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/service-b")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        logger.info("services::"+services);
        return services;
    }
}

