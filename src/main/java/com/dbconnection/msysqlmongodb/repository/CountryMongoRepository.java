package com.dbconnection.msysqlmongodb.repository;

import com.dbconnection.msysqlmongodb.document.CountryDocument;
import com.dbconnection.msysqlmongodb.entity.Country;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author suresh.thakare
 * 2022-06-04 at 10:36 AM
 */
public interface CountryMongoRepository extends MongoRepository<CountryDocument, Long> {

}
