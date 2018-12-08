package com.chengshi.eurekaconsumerfeignhystrix.service;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: tian
 * @date: 2018-12-08 22:00
 */
@Component
public class DcClientFallback implements DcClient {

    @Override
    public String consumer() {
        return "fallback";
    }
}