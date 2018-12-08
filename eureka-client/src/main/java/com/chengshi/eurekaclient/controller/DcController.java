package com.chengshi.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: tian
 * @date: 2018-12-08 17:15
 */
@RestController
public class DcController {
    Logger logger=LoggerFactory.getLogger(DcController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        Thread.sleep(5000L);
        String services = "Services: " + discoveryClient.getServices();
        logger.info("services::"+services);
        return services;
    }
}
