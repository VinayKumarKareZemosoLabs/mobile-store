package com.vinaykumarkare.mobilestore.service;

import com.vinaykumarkare.mobilestore.entity.Mobiles;
import com.vinaykumarkare.mobilestore.repository.MobilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MobileServiceImpl implements MobileService{

    @Autowired
    MobilesRepository mobilesRepository;

    @Override
    public void saveMobile(Mobiles mobiles) {
        mobilesRepository.save(mobiles);

    }

    @Override
    public List<Mobiles> getMobiles() {
        return mobilesRepository.findAll();
    }


    @Override
    public Mobiles getMobileById(int id){
        Optional<Mobiles> mobile = mobilesRepository.findById(id);
        Mobiles mobiles;
        mobiles = mobile.orElse(null);
        return mobiles;
    }



    @Override
    public void deleteById(int id) {
        mobilesRepository.deleteById(id);

    }
}
