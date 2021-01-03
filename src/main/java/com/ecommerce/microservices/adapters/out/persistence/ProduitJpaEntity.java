package com.ecommerce.microservices.adapters.out.persistence;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "produit")
//@Data Playing with the fire => expose all data in the entity even the ID
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProduitJpaEntity {

    @Id
    @GeneratedValue
    @Getter
    private Long id;
    @Getter
    @Setter
    private String nom;
    @Getter
    @Setter
    private BigDecimal prix;

}
