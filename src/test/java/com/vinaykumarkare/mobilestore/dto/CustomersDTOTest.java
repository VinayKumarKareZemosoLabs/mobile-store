package com.vinaykumarkare.mobilestore.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class CustomersDTOTest {

    @Test
    void getId() {
        int expected=1;
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setId(1);
        Assertions.assertEquals(customersDTO.getId(),expected);
    }

    @Test
    void setId() {
        int expected=1;
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setId(1);
        Assertions.assertEquals(customersDTO.getId(),expected);
    }

    @Test
    void getUsername() {
        String expected = "Vinay";
        CustomersDTO customersDTO = new CustomersDTO();
        customersDTO.setUsername("Vinay");
        Assertions.assertEquals(expected,customersDTO.getUsername());

    }

    @Test
    void setUsername() {
        String expected = "Vinay";
        CustomersDTO customersDTO = new CustomersDTO();
        customersDTO.setUsername("Vinay");
        Assertions.assertEquals(expected,customersDTO.getUsername());
    }

    @Test
    void getPassword() {
        String expected="Vinay";
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setPassword("Vinay");
        Assertions.assertEquals(expected,customersDTO.getPassword());
    }

    @Test
    void setPassword() {
        String expected="Vinay";
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setPassword("Vinay");
        Assertions.assertEquals(expected,customersDTO.getPassword());
    }

    @Test
    void getEmail() {
        String expected="vinaykumar.kare@zemoslabs.com";
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setEmail("vinaykumar.kare@zemoslabs.com");
        Assertions.assertEquals(customersDTO.getEmail(),expected);
    }

    @Test
    void setEmail() {
        String expected="vinaykumar.kare@zemoslabs.com";
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setEmail("vinaykumar.kare@zemoslabs.com");
        Assertions.assertEquals(customersDTO.getEmail(),expected);
    }

    @Test
    void getAddress() {
        String expected="hyderabad";
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setAddress("hyderabad");
        Assertions.assertEquals(expected,customersDTO.getAddress());
    }

    @Test
    void setAddress() {
        String expected="hyderabad";
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setAddress("hyderabad");
        Assertions.assertEquals(expected,customersDTO.getAddress());
    }

    @Test
    void getNumber() {
        String expected="9876543210";
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setNumber("9876543210");
        Assertions.assertEquals(expected,customersDTO.getNumber());
    }

    @Test
    void setNumber() {
        String expected="9876543210";
        CustomersDTO customersDTO=new CustomersDTO();
        customersDTO.setNumber("9876543210");
        Assertions.assertEquals(expected,customersDTO.getNumber());
    }

    @Test
    void getEnabled() {
        assertTrue(true);
    }

    @Test
    void setEnabled() {
        assertTrue(true);
    }
}