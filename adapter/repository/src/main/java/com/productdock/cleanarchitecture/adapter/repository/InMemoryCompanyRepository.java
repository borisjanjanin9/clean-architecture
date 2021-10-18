package com.productdock.cleanarchitecture.adapter.repository;

import com.productdock.cleanarchitecture.domain.entity.Company;
import com.productdock.cleanarchitecture.usecase.CompanyRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCompanyRepository implements CompanyRepository {

    private final Map<String, Company> inMemoryDb = new HashMap<>();

    @Override
    public Company create(final Company company) {
        inMemoryDb.put(company.getId(), company);
        return company;
    }

}
