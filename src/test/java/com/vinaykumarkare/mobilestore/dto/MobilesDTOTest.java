package com.vinaykumarkare.mobilestore.dto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class MobilesDTOTest {

    @Test
    void getId() {
        MobilesDTO mobilesDTO=new MobilesDTO();
        int expected=1;
        mobilesDTO.setId(1);
        Assertions.assertEquals(expected,mobilesDTO.getId());
    }

    @Test
    void setId() {
        MobilesDTO mobilesDTO=new MobilesDTO();
        int expected=1;
        mobilesDTO.setId(1);
        Assertions.assertEquals(expected,mobilesDTO.getId());

    }

    @Test
    void getMobileName() {
        MobilesDTO mobilesDTO=new MobilesDTO();
        String expected="iphone";
        mobilesDTO.setMobilename("iphone");
        Assertions.assertEquals(expected,mobilesDTO.getMobilename());
    }

    @Test
    void setMobileName() {
        MobilesDTO books=new MobilesDTO();
        String expected="iphone";
        books.setMobilename("iphone");
        Assertions.assertEquals(books.getMobilename(),expected);
    }

    @Test
    void getCost() {
        MobilesDTO mobilesDTO=new MobilesDTO();
        int excepted=100000;
        mobilesDTO.setCost(100000);
        Assertions.assertEquals(excepted,mobilesDTO.getCost());
    }

    @Test
    void setCost() {
        assertTrue(true);
    }

    @Test
    void getCompanyName() {
        MobilesDTO mobilesDTO=new MobilesDTO();
        String expected="iphone";
        mobilesDTO.setCompanyname("iphone");
        Assertions.assertEquals(expected,mobilesDTO.getCompanyname());
    }

    @Test
    void setCompanyName() {
        MobilesDTO mobilesDTO=new MobilesDTO();
        String expected="iphone";
        mobilesDTO.setCompanyname("iphone");
        Assertions.assertEquals(mobilesDTO.getCompanyname(),expected);
    }

    @Test
    void testToString() {
        String expected =   "MobilesDTO{" +
                "id=" + 1 +
                ", mobilename='" + "Galaxy" + '\'' +
                ", cost=" + 100000 +
                ", companyname='" + "samsung" + '\'' +
                '}';

        MobilesDTO mobilesDTO = new MobilesDTO(1, "Galaxy", 100000,"samsung" );
        Assertions.assertEquals(expected,mobilesDTO.toString());
    }
}