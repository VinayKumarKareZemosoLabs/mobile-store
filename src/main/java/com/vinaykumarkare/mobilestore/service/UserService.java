package com.vinaykumarkare.mobilestore.service;

import com.vinaykumarkare.mobilestore.entity.Customer;
import com.vinaykumarkare.mobilestore.entity.Mobiles;

import java.util.List;


public interface UserService {


    List<Customer> getcustomers();

    Customer findByUsername(String name);
    List<Mobiles> getOrdersList(String name);

}
