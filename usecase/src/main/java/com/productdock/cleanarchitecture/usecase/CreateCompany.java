package com.productdock.cleanarchitecture.usecase;

import com.productdock.cleanarchitecture.domain.entity.Company;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class CreateCompany {

    private final CompanyRepository repository;

    public Company create(final Company company) {

        // validations
        
        return repository.create(company);
    }
}
