package com.yourcompany.rbac;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RbacAutoConfig {

    @Bean
    public RbacPermissionEvaluator rbacPermissionEvaluator() {
        return new RbacPermissionEvaluator();
    }
}
