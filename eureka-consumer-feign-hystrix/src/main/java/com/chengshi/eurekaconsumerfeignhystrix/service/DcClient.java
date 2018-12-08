package com.chengshi.eurekaconsumerfeignhystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: tian
 * @date: 2018-12-08 21:59
 */
@FeignClient(name = "eureka-client", fallback = DcClientFallback.class)
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
