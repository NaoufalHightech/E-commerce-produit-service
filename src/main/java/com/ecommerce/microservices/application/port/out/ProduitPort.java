package com.ecommerce.microservices.application.port.out;

import com.ecommerce.microservices.adapters.out.persistence.ProduitJpaEntity;
import com.ecommerce.microservices.domain.Produit;

import java.util.Optional;

public interface ProduitPort {
    Produit getProduit(Long id);
}
