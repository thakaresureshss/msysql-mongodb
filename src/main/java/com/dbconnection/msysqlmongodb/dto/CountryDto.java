package com.dbconnection.msysqlmongodb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto implements Serializable {

  private static final long serialVersionUID = 1L;

  @ReadOnlyProperty
  private Long id;

  private String code;
  private String name;
  private String phoneAreaCode;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneAreaCode() {
    return phoneAreaCode;
  }

  public void setPhoneAreaCode(String phoneAreaCode) {
    this.phoneAreaCode = phoneAreaCode;
  }
}
