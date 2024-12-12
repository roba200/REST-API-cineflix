package com.cineflix.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cineflix.rest.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{
    
    
};
