package com.productdock.cleanarchitecture.usecase;


import com.productdock.cleanarchitecture.domain.entity.Company;

public interface CompanyRepository {

    Company create(Company company);

}
