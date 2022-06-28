package com.vinaykumarkare.mobilestore.repository;

import com.vinaykumarkare.mobilestore.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, String> {
}
