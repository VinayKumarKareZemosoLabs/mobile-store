package com.vinaykumarkare.mobilestore.controller;

import com.vinaykumarkare.mobilestore.converter.MobilesConverter;
import com.vinaykumarkare.mobilestore.entity.Mobiles;
import com.vinaykumarkare.mobilestore.repository.MobilesRepository;
import com.vinaykumarkare.mobilestore.service.MobileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
class StaffDataControllerTest {



    @Autowired
    MobilesConverter mobilesConverter;

    @MockBean
    MobilesRepository mobilesRepository;

    @Autowired
    MobileService mobileService;

    @Autowired
    private WebApplicationContext wac;

    @Test
    void stockListTest() throws Exception{
        when(mobilesRepository.findAll()).thenReturn(Stream.of(new Mobiles(1,"Pixel 6",43000, "Google"),new Mobiles(2,"Note 2",14000, "Micromax") ).collect(Collectors.toList()));

        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockMvc.perform(get("/staff/stockList")).andExpect(status().is(200));
        System.out.println(mobileService.getMobiles());
    }

    @Test
    void deleteMobileTest() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockMvc.perform(get("/staff/deleteItem").queryParam("id","1")).andExpect(status().is(405));
    }

    @Test
    void saveNewMobileTest() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockMvc.perform(get("/staff/saveItem")).andExpect(status().is(405));

    }

    @Test
    void updateMobileTest() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockMvc.perform(get("/staff/updateItem").queryParam("id","1")).andExpect(status().is(405));
    }
}