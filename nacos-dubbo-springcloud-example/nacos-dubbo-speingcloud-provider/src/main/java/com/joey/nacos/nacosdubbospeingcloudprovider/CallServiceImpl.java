package com.joey.nacos.nacosdubbospeingcloudprovider;

import com.joey.nacos.nacosdubbospringcloudapi.CallService;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class CallServiceImpl implements CallService {
    public String callService() {
        return "provider";
    }
}
