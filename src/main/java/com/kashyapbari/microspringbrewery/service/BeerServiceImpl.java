package com.kashyapbari.microspringbrewery.service;

import com.kashyapbari.microspringbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerByID(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("budwijher")
                .beerStyle("lager")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting a beer");
    }


}
