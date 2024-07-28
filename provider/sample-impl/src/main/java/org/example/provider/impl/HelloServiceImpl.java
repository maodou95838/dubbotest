package org.example.provider.impl;

import org.apache.dubbo.config.annotation.Service;
import org.example.provider.api.IHelloService;
import org.springframework.beans.factory.annotation.Value;

/**
 * HelloServiceImpl
 *
 * @author Jackie Hou
 * @date 2024/7/26 17:49
 * @version 1.0
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return String.format("[%s]: Hello, %s", serviceName, name);
    }

    @Value("${dubbo.application.name}")
    private String serviceName;


}
