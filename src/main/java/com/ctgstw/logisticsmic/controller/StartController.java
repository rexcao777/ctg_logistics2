package com.ctgstw.logisticsmic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:cxh
 * @date:2019/2/14
 * @description:
 * @Copyright © 2018 无锡-车同轨科技
 */
@RestController
@RequestMapping("/test")
public class StartController {

    @GetMapping("/hello")
    public String helloLogistics(){

        return "hello logistics";
    }
}
