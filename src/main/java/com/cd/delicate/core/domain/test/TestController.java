package com.cd.delicate.core.domain.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cold
 * @Date 2019/8/26 17:51
 **/
@RestController
public class TestController {

    @Value("${testone}")
    String value;

    @RequestMapping(value = "/mytest")
    public String mytest() {
        return "mytest success!";
    }

    @RequestMapping(value = "/testtest")
    public String testtest() {
        return value;
    }
}
