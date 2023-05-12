package com.example.Person1;

import com.example.Person1.controller.PersonController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest
class PersonApplicationTests {

    @Autowired
    private PersonController controller;

    @Test
    public void contextLoads()  {
        assertThat(controller).isNotNull();
    }


    }

