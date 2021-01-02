package com.ecommerce.microservices.adapters.out.persistence;

import com.ecommerce.microservices.adapters.out.persistence.mappers.ProduitPersistenceMapper;
import com.ecommerce.microservices.application.port.out.ProduitPort;
import com.ecommerce.microservices.domain.Produit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Repository
public class ProduitPersistenceAdapter implements ProduitPort {
    private final ProduitRepository produitRepository;
    private final ProduitPersistenceMapper produitMapper;

    @Override
    public Produit getProduit(Long id) {
        //Todo add H2 script for testing
        //ProduitJpaEntity produitJpaEntity = produitRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        ProduitJpaEntity produitJpaEntity = new ProduitJpaEntity(id,  "iPhone", BigDecimal.valueOf(1300) );
        return produitMapper.ProduitJpaEntityToProduit(produitJpaEntity);
    }
}
