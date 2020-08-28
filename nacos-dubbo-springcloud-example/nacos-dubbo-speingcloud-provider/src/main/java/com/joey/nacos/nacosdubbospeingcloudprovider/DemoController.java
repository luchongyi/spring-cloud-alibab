package com.joey.nacos.nacosdubbospeingcloudprovider;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
public class DemoController {

    @RequestMapping("/call")
    public String call(){

        return "success";
    }

}
