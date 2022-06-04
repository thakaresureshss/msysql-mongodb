package com.dbconnection.msysqlmongodb.service;

import com.dbconnection.msysqlmongodb.document.CountryDocument;
import com.dbconnection.msysqlmongodb.dto.CountryDto;
import com.dbconnection.msysqlmongodb.entity.Country;
import com.dbconnection.msysqlmongodb.repository.CountryMongoRepository;
import com.dbconnection.msysqlmongodb.repository.CountryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;


/**
 * @author suresh.thakare
 * 2022-06-04 at 10:36 AM
 */

@Service
public class CountryServiceImpl implements CountryService {

  final CountryRepository countryRepository;
  final CountryMongoRepository countryMongoRepository;

  private final String language = LocaleContextHolder.getLocale().getLanguage();

  public CountryServiceImpl(CountryRepository countryRepository, CountryMongoRepository countryMongoRepository) {
    this.countryRepository = countryRepository;
    this.countryMongoRepository = countryMongoRepository;
  }

  @Override
  public CountryDto addCountry(CountryDto countryDto) {
    Country country = new Country();
    BeanUtils.copyProperties(countryDto, country);
    Country returnedCountry = null;
    try {
      returnedCountry = countryRepository.save(country);
      CountryDocument document = new CountryDocument();
      document.setCountry(countryDto);
      document.setId(1l);
      countryMongoRepository.save(document);
    } catch (Exception e) {
      throw new RuntimeException("Error while saving country to DB  " + e.getMessage());
    }
    BeanUtils.copyProperties(returnedCountry, countryDto);
    return countryDto;
  }


  @Override
  public CountryDto findCountryById(Long id) {
    Optional<Country> country = Optional.ofNullable(countryRepository.findById(id)).orElseThrow(() -> new RuntimeException("Not found "));
    CountryDto countryDto = new CountryDto();
    BeanUtils.copyProperties(country.get(), countryDto);
    return countryDto;
  }

}
