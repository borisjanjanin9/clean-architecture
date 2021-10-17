package com.productdock.cleanarchitecture.springapp.controller;

import com.productdock.cleanarchitecture.adapter.controller.CompanyController;
import com.productdock.cleanarchitecture.adapter.controller.CompanyWeb;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CompanySpringController {

    private final CompanyController controller;

    @PostMapping(value = "/companies")
    public CompanyWeb createCompany(@RequestBody final CompanyWeb userWeb) {
        return controller.createCompany(userWeb);
    }

}
