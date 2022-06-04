package com.dbconnection.msysqlmongodb.document;

import com.dbconnection.msysqlmongodb.dto.CountryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author suresh.thakare
 * 2022-06-04 at 10:12 AM
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "country")
public class CountryDocument {
  @Id
  private Long id;
  private CountryDto country;
}
