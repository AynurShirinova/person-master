package com.example.Person1;

import com.example.Person1.controller.PersonController;
import com.example.Person1.dto.PersonDTO;
import com.example.Person1.model.Person;
import com.example.Person1.repository.PersonRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@WebMvcTest(PersonController.class)
@SpringBootTest(classes = PersonApplication.class)
public class PersonTest {
    @Autowired
    private PersonRepository personRepository;
    private PersonDTO personDTO;
    private Person person;

    @BeforeEach
    public void setUp() {
    PersonDTO dto = new PersonDTO();
    dto.setName("frg");
    dto.setSurname("jjhkhi");
    dto.setPatron("adi");
    dto.setSex("nk");
    dto.setNationality_id(1);
    dto.setPlace_of_birth_id(2);
    dto.setDateOfBirth(LocalDate.now());
    dto.setCardNo("1234");
    dto.setPersonalNo("123456");
    dto.setBlood_group_id(3);
    person = new Person();
    }
    @AfterEach
    public void tearDown() {
        personRepository.deleteAll();
        personDTO = null;
    }
    @Test
    public void givenProductToAddShouldReturnAddedProduct(){

        personRepository.save(person);
        Person fetchedProduct = personRepository.findById(person.getId()).get();
        assertNotNull(person.getId());

    }

}


