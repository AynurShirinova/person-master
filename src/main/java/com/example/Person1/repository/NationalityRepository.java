package com.example.Person1.repository;

import com.example.Person1.model.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalityRepository extends JpaRepository<Nationality,Integer> {
}
