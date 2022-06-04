package com.dbconnection.msysqlmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author suresh.thakare
 * 2022-06-04 at 10:36 AM
 */

@SpringBootApplication
public class MsysqlMongodbApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsysqlMongodbApplication.class, args);
  }

}

