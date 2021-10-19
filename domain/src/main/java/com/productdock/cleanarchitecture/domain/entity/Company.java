package com.productdock.cleanarchitecture.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Company {

    private String id;
    private String name;
}
