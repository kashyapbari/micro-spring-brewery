package com.kashyapbari.microspringbrewery.service;

import com.kashyapbari.microspringbrewery.web.model.BeerDto;
import com.kashyapbari.microspringbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
