package com.kashyapbari.microspringbrewery.web.controller;

import com.kashyapbari.microspringbrewery.service.BeerService;
import com.kashyapbari.microspringbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){
        return new ResponseEntity<>(beerService.getBeerByID(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody BeerDto beerDto){
        BeerDto saveBeerDto = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/"+saveBeerDto.getId());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID beerId,
                                       @Valid @RequestBody BeerDto beerDto){
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteBeerById(beerId);
    }
}
