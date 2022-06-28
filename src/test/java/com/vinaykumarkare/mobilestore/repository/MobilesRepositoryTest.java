package com.vinaykumarkare.mobilestore.repository;

import com.vinaykumarkare.mobilestore.entity.Mobiles;
import com.vinaykumarkare.mobilestore.service.MobileService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class MobilesRepositoryTest {


    @Autowired
    private MobileService mobileService;



    @MockBean
    private MobilesRepository mobilesRepository;



    @Test
    void findById()
    {

        Mobiles mobiles=new Mobiles(1,"galaxy",100000,"samsung");
        when(mobilesRepository.findById(1)).thenReturn(Optional.of(mobiles));
        Assertions.assertEquals(mobiles,mobileService.getMobileById(1));
    }

    @Test
    void findAll()
    {
        when(mobilesRepository.findAll()).thenReturn(Stream.of(new Mobiles(1,"galaxy",100000,"samsung"),new Mobiles(2,"galaxy",200000,"samsung") ).collect(Collectors.toList()));
        Assertions.assertEquals(2,mobileService.getMobiles().size());

    }


    @Test
    void save() {
        Mobiles mobiles = new Mobiles(1, "galaxy", 1000, "samsung");
        verify(mobilesRepository, times(0)).save(mobiles);
    }







}