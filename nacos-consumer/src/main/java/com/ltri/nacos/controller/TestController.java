package com.ltri.nacos.controller;

import com.ltri.nacos.api.TestDubboService;
import com.ltri.nacos.vo.Results;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ltri
 * @date 2024/7/16 4:34 下午
 */
@RestController
@Slf4j
public class TestController {


    @DubboReference
    private TestDubboService testDubboService;

    @RequestMapping("/dubbo-test")
    public Results dubboTest() {
        Object o = testDubboService.testDubbo();
        return Results.success(o);
    }
}
