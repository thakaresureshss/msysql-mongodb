package com.dbconnection.msysqlmongodb.repository;

import com.dbconnection.msysqlmongodb.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
