package com.cineflix.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cineflix.rest.entity.Payment;
import com.cineflix.rest.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired

    private PaymentService service;

    @PostMapping("/savepayment")
    public Payment savePayment(@RequestBody Payment payment) {
        return service.savePayment(payment);
    }
}
