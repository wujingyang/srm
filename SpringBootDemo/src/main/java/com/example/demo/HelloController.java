package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：Jingyang.Wu
 * @Date：2017/8/14.
 * @Description:
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @Autowired
    private Girl girl;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello() {
        return girl.getCupSize();
    }

}
