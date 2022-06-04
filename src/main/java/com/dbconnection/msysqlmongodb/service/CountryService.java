package com.dbconnection.msysqlmongodb.service;

import com.dbconnection.msysqlmongodb.dto.CountryDto;

public interface CountryService {

  public CountryDto findCountryById(Long countryId);

  public CountryDto addCountry(CountryDto countryDto);
}
