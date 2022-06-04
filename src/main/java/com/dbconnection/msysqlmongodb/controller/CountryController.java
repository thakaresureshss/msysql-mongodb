package com.dbconnection.msysqlmongodb.controller;

import com.dbconnection.msysqlmongodb.dto.CountryDto;
import com.dbconnection.msysqlmongodb.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @author suresh.thakare
 * 2022-06-04 at 10:02 AM
 */
@RestController
public class CountryController {

  @Autowired
  CountryService countryService;

  @PostMapping(value = "/countries", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CountryDto> addCountry(@RequestBody CountryDto countryDto,
                                               HttpServletRequest request) {
    return new ResponseEntity<>(countryService.addCountry(countryDto),
            HttpStatus.CREATED);
  }

  @GetMapping(value = "/countries/{countryId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CountryDto> getCountryById(@PathVariable(name = "countryId") Long countryId,
                                                   HttpServletRequest request) {
    return new ResponseEntity<>(countryService.findCountryById(countryId), HttpStatus.OK);
  }

}
