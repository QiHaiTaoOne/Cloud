package com.service.consumer.feign.service.hystrix;

import com.service.consumer.feign.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceHystrix implements DemoService {


    @Override
    public String demo() {
        /**
         * demo 接口断路时 fallback返回一个固定值
         */
        return "sorry,net error";
    }
}
