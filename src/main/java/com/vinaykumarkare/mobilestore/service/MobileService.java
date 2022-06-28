package com.vinaykumarkare.mobilestore.service;

import com.vinaykumarkare.mobilestore.entity.Mobiles;

import java.util.List;

public interface MobileService {


    void saveMobile(Mobiles book);

    List<Mobiles> getMobiles();
    Mobiles getMobileById(int id);
    void deleteById(int id);
}
