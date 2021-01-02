package com.ecommerce.microservices.adapters.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "produit")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProduitJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    private BigDecimal prix;

}
