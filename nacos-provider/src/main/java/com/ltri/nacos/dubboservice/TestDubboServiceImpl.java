package com.ltri.nacos.dubboservice;

import com.ltri.nacos.api.TestDubboService;
import com.ltri.nacos.service.NacosTestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author ltri
 * @date 2024/7/17 9:25 上午
 */
@Slf4j
@DubboService
public class TestDubboServiceImpl implements TestDubboService {

    @Resource
    private NacosTestService nacosTestService;


    @Override
    public Object testDubbo() {
        String str = nacosTestService.list()
                                     .toString();
        log.info("[dubbo] db-data:{}", str);
        return str;
    }

}
