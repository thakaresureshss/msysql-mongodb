package com.dbconnection.msysqlmongodb.service;

import com.dbconnection.msysqlmongodb.dto.CountryDto;


/**
 * @author suresh.thakare
 * 2022-06-04 at 10:36 AM
 */

public interface CountryService {

  public CountryDto findCountryById(Long countryId);

  public CountryDto addCountry(CountryDto countryDto);
}
