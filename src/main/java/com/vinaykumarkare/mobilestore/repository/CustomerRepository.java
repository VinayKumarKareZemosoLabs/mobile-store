package com.vinaykumarkare.mobilestore.repository;

import com.vinaykumarkare.mobilestore.entity.Customer;
import com.vinaykumarkare.mobilestore.entity.Mobiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

     @Query("select user.mobiles from Customer user where user.username=:username")
     List<Mobiles> getOrdersList(@Param("username") String username);


     Customer findByUsername(String username);


}
