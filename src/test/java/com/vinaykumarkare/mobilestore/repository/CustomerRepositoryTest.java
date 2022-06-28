package com.vinaykumarkare.mobilestore.repository;

import com.vinaykumarkare.mobilestore.entity.Customer;
import com.vinaykumarkare.mobilestore.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerRepositoryTest {




    @Autowired
    private UserService userService;


    @MockBean
    private CustomerRepository customerRepository;

    @Autowired
    private WebApplicationContext wac;



    @Test
    void saveCustomer(){
        Customer customer=new Customer("Vinay","Vinay","VinayKumar.kare@Zemosolabs.com","hyderabad","9876543210");
        verify(customerRepository,times(0)).save(customer);
    }

    @Test
    void customerFindAll()
    {
        when(customerRepository.findAll()).thenReturn(Stream.of(new Customer(1,"Vinay","Vinay","vinaykumar.kare@zemosolabs.com","hyderabad","9876543210"),new Customer(2,"Vinay","Vinay","vinaykumar.kare@zemosolabs.com","hyderabad","9876543210")).collect(Collectors.toList()));
        Assertions.assertEquals(2,userService.getcustomers().size());

    }

    @Test
    void customerFindById()
    {

        Customer b=new Customer(1,"Vinay","Vinay","vinaykumar.kare@zemosolabs.com","hyderabad","9876543210");
        when(customerRepository.findByUsername("Vinay")).thenReturn(b);
        Assertions.assertEquals(b,userService.findByUsername("Vinay"));

    }

    @Test
    void stockListTesting() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockMvc.perform(get("/staff/stockList")).andExpect(status().is(200));
    }

    @Test
    void saveItem() throws Exception
    {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockMvc.perform(get("/staff/saveItem")).andExpect(status().is(405));
    }
    @Test
    void  deleteTest() throws Exception
    {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockMvc.perform(get("/staff/deleteItem").queryParam("id","1")).andExpect(status().is(405));
    }

    @Test
    void  updateTest() throws Exception
    {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockMvc.perform(get("/staff/updateItem").queryParam("id","1")).andExpect(status().is(405));
    }


    @Test
    void orderItem() throws  Exception
    {
        MockMvc mockMvc=MockMvcBuilders.webAppContextSetup((this.wac)).build();
        mockMvc.perform(get("/user/orderItem").queryParam("itemId","1")).andExpect(status().is(405));
    }


}