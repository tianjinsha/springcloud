package com.chengshi.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tian
 * @date: 2018-12-08 22:54
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${springcloud.name}")
    String name;
    @Value("${springcloud.age}")
    String age;
    @Value("${springcloud.sex}")
    String sex;

    @GetMapping("/info")
    public Object showConfig(){
        List list=new ArrayList();
        list.add(name);
        list.add(age);
        list.add(sex);
        return list;
    }
}