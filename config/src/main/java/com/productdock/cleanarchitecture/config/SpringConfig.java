package com.productdock.cleanarchitecture.config;

import com.productdock.cleanarchitecture.adapter.repository.InMemoryCompanyRepository;
import com.productdock.cleanarchitecture.usecase.CompanyRepository;
import com.productdock.cleanarchitecture.usecase.CreateCompany;

public class SpringConfig {

    private final CompanyRepository companyRepository = new InMemoryCompanyRepository();

    public CreateCompany createCompany() {
        return new CreateCompany(companyRepository);
    }
}
