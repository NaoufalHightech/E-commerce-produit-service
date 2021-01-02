package com.ecommerce.microservices.adapters.in.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDtoResponse {
    Long id;
    String nom;
    BigDecimal prix;
}
