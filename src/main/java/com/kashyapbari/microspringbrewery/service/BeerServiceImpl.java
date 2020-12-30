package com.kashyapbari.microspringbrewery.service;

import com.kashyapbari.microspringbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerByID(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("budwijher")
                .beerStyle("lager")
                .build();
    }
}
