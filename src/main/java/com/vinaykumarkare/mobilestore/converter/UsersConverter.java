package com.vinaykumarkare.mobilestore.converter;//package com.vinaykumarkare.mobilestore.converter;

import com.vinaykumarkare.mobilestore.dto.CustomersDTO;
import com.vinaykumarkare.mobilestore.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class UsersConverter {

    @Autowired
    private ModelMapper modelMapper;

    public CustomersDTO entityToDto(Customer customer){
        return modelMapper.map(customer, CustomersDTO.class);

    }


}
