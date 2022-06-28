package com.vinaykumarkare.mobilestore.repository;

import com.vinaykumarkare.mobilestore.entity.Mobiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilesRepository extends JpaRepository<Mobiles, Integer> {
}
