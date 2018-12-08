package com.chengshi.eurekaconsumerfeignhystrix;

import com.chengshi.eurekaconsumerfeignhystrix.service.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: tian
 * @date: 2018-12-08 21:59
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }

}