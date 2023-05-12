package com.example.Person1.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
//@Table
@Entity
public class BloodGroup {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blood_group_id")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "bloodGroup")
    private List<Person> blood;


}
