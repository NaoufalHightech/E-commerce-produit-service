package com.ecommerce.microservices.adapters.out.persistence.mappers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Test {
    private Long id;

    private String nom;

    private BigDecimal prix;
}
