package com.vinaykumarkare.mobilestore.service;

import com.vinaykumarkare.mobilestore.entity.Customer;
import com.vinaykumarkare.mobilestore.entity.Mobiles;
import com.vinaykumarkare.mobilestore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    CustomerRepository customerRepository;




    @Override
    @Transactional
    public List<Customer> getcustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findByUsername(String name) {
        return customerRepository.findByUsername(name);
    }

    @Override
    public List<Mobiles> getOrdersList(String name) {
        return customerRepository.getOrdersList(name);
    }
}
