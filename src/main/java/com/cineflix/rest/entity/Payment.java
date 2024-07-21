package com.cineflix.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue
    int id;
    int userId;
    int amount;
    String paymentDate;
    String paymentMethod;
    String paymentType;

}
