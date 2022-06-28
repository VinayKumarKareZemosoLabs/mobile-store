package com.vinaykumarkare.mobilestore.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerTest {

    @Test
    void getId() {
        int expected=1;
        Customer customer=new Customer();
        customer.setId(1);
        Assertions.assertEquals(customer.getId(),expected);
    }

    @Test
    void getUsername() {
        String expected = "Vinay";
        Customer customer = new Customer();
        customer.setUsername("Vinay");
        Assertions.assertEquals(expected,customer.getUsername());

    }

    @Test
    void getPassword() {
        String expected="Vinay";
        Customer customer=new Customer();
        customer.setPassword("Vinay");
        Assertions.assertEquals(expected,customer.getPassword());
    }

    @Test
    void getEmail() {
        String expected="vinaykumar.kare@zemoslabs.com";
        Customer customer=new Customer();
        customer.setEmail("vinaykumar.kare@zemoslabs.com");
        Assertions.assertEquals(customer.getEmail(),expected);
    }

    @Test
    void getAddress() {
        String expected="nalgonda";
        Customer customer=new Customer();
        customer.setAddress("nalgonda");
        Assertions.assertEquals(expected,customer.getAddress());
    }

    @Test
    void getNumber() {
        String expected="9876543210";
        Customer customer=new Customer();
        customer.setNumber("9876543210");
        Assertions.assertEquals(expected,customer.getNumber());
    }

    @Test
    void setId() {
        int expected=1;
        Customer customer=new Customer();
        customer.setId(1);
        Assertions.assertEquals(customer.getId(),expected);
    }

    @Test
    void setUsername() {
        String expected = "Vinay";
        Customer customer = new Customer();
        customer.setUsername("Vinay");
        Assertions.assertEquals(expected,customer.getUsername());
    }

    @Test
    void setPassword()
    {
        String expected="Vinay";
        Customer customer=new Customer();
        customer.setPassword("Vinay");
        Assertions.assertEquals(expected,customer.getPassword());
    }

    @Test
    void setAddress() {
        String expected="nalgonda";
        Customer customer=new Customer();
        customer.setAddress("nalgonda");
        Assertions.assertEquals(expected,customer.getAddress());
    }

    @Test
    void setNumber() {
        String expected="9876543210";
        Customer customer=new Customer();
        customer.setNumber("9876543210");
        Assertions.assertEquals(expected,customer.getNumber());
    }
    @Test
    void setEmail()
    {
        String expected="vinaykumar.kare@zemoslabs.com";
        Customer customer=new Customer();
        customer.setEmail("vinaykumar.kare@zemoslabs.com");
        Assertions.assertEquals(customer.getEmail(),expected);
    }

}
