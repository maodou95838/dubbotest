package org.example.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ProviderApplication
 *
 * @author Jackie Hou
 * @date 2024/7/26 17:55
 * @version 1.0
 */
@SpringBootApplication
@DubboComponentScan
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
