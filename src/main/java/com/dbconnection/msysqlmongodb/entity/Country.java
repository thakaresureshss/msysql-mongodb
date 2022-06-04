package com.dbconnection.msysqlmongodb.entity;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author suresh.thakare
 * 2022-06-04 at 10:07 AM
 */
@Entity
@Table(name = "country")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "code", unique = true)
  private String code;

  @Column(name = "name")
  private String name;

  @Column(name = "phone_area_code")
  private String phoneAreaCode;

}
