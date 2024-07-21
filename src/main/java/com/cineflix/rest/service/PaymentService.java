package com.cineflix.rest.service;
import com.cineflix.rest.repository.PaymentRepository;
import com.cineflix.rest.entity.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment savePayment(Payment payment){
        return repository.save(payment);
    }
}
