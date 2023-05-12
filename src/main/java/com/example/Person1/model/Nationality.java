package com.example.Person1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@Table
public class Nationality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nationality_id")
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "nationality")
    private List<Person> nation;
}
