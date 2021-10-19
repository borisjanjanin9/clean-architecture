package com.productdock.cleanarchitecture.adapter.controller;

import com.productdock.cleanarchitecture.domain.entity.Company;
import com.productdock.cleanarchitecture.usecase.CreateCompany;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompanyController {

    private final CreateCompany createCompany;

    public CompanyWeb createCompany(final CompanyWeb companyWeb) {
        Company company = companyWeb.toCompany();
        return CompanyWeb.toCompanyWeb(createCompany.create(company));
    }
}
