package com.gpdi.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping(value = "test")
    public String test() {
        log.info("这是log4j2的日志测试，info级别");
        log.warn("这是log4j2的日志测试，warn级别");
        log.error("这是log4j2的日志测试，error级别");
        //如果在日志输出中想携带参数的化，可以这样设置
        String bug = "约翰·冯·诺依曼 保佑，永无BUG";
        log.info("这是带参数的输出格式:{}", bug);
        return "HELLO-BUG";
    }

    @RequestMapping("/getAllUsers")
    public String getAllUsers() throws Exception {
        int arr[] = {1, 2, 3};
        log.info("getallusers被调用了");
        int aa = 1 / 0;
        System.out.println(arr[10]);
        return "sheet";

    }

    private static final Logger log = LoggerFactory.getLogger(TestController.class);
}
