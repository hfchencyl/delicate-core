package com.cd.delicate.core.domain.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cold
 * @Date 2019/8/26 17:51
 **/
@RestController
public class TestController {

    @RequestMapping(value = "/mytest")
    public String mytest() {
        return "mytest success!";
    }
}
