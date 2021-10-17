package com.productdock.cleanarchitecture.springapp.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productdock.cleanarchitecture.adapter.controller.CompanyController;
import com.productdock.cleanarchitecture.config.SpringConfig;
import com.productdock.cleanarchitecture.usecase.CreateCompany;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private final SpringConfig config = new SpringConfig();

    @Bean
    public ObjectMapper objectMapper() {
        var objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    @Bean
    public CreateCompany createCompany() {
        return config.createCompany();
    }

    @Bean
    public CompanyController userController() {
        return new CompanyController(createCompany());
    }
}
