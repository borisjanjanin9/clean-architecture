package com.productdock.cleanarchitecture.springapp.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productdock.cleanarchitecture.adapter.controller.CompanyController;
import com.productdock.cleanarchitecture.adapter.repository.InMemoryCompanyRepository;
import com.productdock.cleanarchitecture.usecase.CreateCompany;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ObjectMapper objectMapper() {
        var objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    @Bean
    public CreateCompany createCompany() {
        return new CreateCompany(new InMemoryCompanyRepository());
    }

    @Bean
    public CompanyController companyController() {
        return new CompanyController(createCompany());
    }

}
