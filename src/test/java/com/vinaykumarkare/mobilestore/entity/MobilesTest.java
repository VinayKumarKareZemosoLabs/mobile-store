package com.vinaykumarkare.mobilestore.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class MobilesTest {




    @Test
    void getMobileName() {
        Mobiles mobiles=new Mobiles();
        String expected="MaxPro";
        mobiles.setMobilename("MaxPro");
        Assertions.assertEquals(expected,mobiles.getMobilename());


    }

    @Test
    void setMobileName() {
        Mobiles mobiles=new Mobiles();
        String expected="MaxPro";
        mobiles.setMobilename("MaxPro");
        Assertions.assertEquals(mobiles.getMobilename(),expected);
    }

    @Test
    void getCompanyName() {
        Mobiles mobiles=new Mobiles();
        String expected="Iphone";
        mobiles.setCompanyname("Iphone");
        Assertions.assertEquals(expected,mobiles.getCompanyname());


    }

    @Test
    void setCompanyName() {
        Mobiles mobiles=new Mobiles();
        String expected="Iphone";
        mobiles.setCompanyname("Iphone");
        Assertions.assertEquals(mobiles.getCompanyname(),expected);
    }

    @Test
    void getId() {
        Mobiles mobiles=new Mobiles();
        int expected=1;
        mobiles.setId(1);
        Assertions.assertEquals(expected, mobiles.getId());
    }

    @Test
    void setId() {
        Mobiles mobiles=new Mobiles();
        int expected=1;
        mobiles.setId(1);
        Assertions.assertEquals(expected,mobiles.getId());
    }

    @Test
    void getCost() {
        Mobiles mobiles=new Mobiles();
        int excepted=100000;
        mobiles.setCost(100000);
        Assertions.assertEquals(excepted,mobiles.getCost());
    }

    @Test
    void setCost() {
        Mobiles mobiles=new Mobiles();
        int excepted=100000;
        mobiles.setCost(100000);
        Assertions.assertEquals(excepted,mobiles.getCost());
    }

    @Test
    void toStringTest() {
      String expected =   "Mobiles{" +
                "id=" + 1 +
                ", mobilename='" + "Galaxy" + '\'' +
                ", cost=" + 100000 +
                ", companyname='" + "samsung" + '\'' +
                '}';

        Mobiles mobiles = new Mobiles(1, "Galaxy", 100000,"samsung" );
        Assertions.assertEquals(expected,mobiles.toString());
    }
}