package com.ecommerce.microservices.domain;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produit implements Serializable {
    Long id;
    String nom;
    BigDecimal prix;
}
