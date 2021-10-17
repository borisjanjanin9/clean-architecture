package com.productdock.cleanarchitecture.adapter.controller;


import com.productdock.cleanarchitecture.domain.entity.Company;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyWeb {
    private String id;
    private String name;

    public Company toCompany() {
        return Company.builder()
                .id(id)
                .name(name)
                .build();
    }

    public static CompanyWeb toUserWeb(final Company company) {
        CompanyWeb companyWeb = new CompanyWeb();
        companyWeb.setId(company.getId());
        companyWeb.setName(company.getName());
        return companyWeb;
    }
}
