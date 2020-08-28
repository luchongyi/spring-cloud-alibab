package com.joey.nacos.nacosdubbospeingcloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDubboSpeingcloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDubboSpeingcloudProviderApplication.class, args);
    }

}
