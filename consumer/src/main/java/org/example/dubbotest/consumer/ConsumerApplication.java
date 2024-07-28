package org.example.dubbotest.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.example.provider.api.IHelloService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * ConsumerApplication
 *
 * @author Jackie Hou
 * @date 2024/7/26 18:24
 * @version 1.0
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
//        ApplicationRunner jackie = e -> System.out.println(service.sayHello("Jackie"));
//        return jackie;
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                System.out.println(service.sayHello("jackie"));
            }
        };
    }


    @Reference
    private IHelloService service;


}
