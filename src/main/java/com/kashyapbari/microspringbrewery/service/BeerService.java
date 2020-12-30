package com.kashyapbari.microspringbrewery.service;

import com.kashyapbari.microspringbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerByID(UUID beerId);
}
