package com.example.Person1.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Setter
@Getter
 public class PersonDTO {

 private int Id;

 private String name;

 private String surname;

 private String patron;

 private String sex;

 private Integer nationality_id;

 private Integer place_of_birth_id;

 private LocalDate dateOfBirth;

 private String cardNo;

 private String personalNo;

 private Integer blood_group_id;

}
