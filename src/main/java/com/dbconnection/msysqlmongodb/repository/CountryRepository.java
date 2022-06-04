package com.dbconnection.msysqlmongodb.repository;

import com.dbconnection.msysqlmongodb.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author suresh.thakare
 * 2022-06-04 at 10:36 AM
 */
public interface CountryRepository extends JpaRepository<Country, Long> {

}
