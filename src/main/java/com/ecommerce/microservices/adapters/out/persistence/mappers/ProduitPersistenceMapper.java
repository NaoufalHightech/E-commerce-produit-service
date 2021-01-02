package com.ecommerce.microservices.adapters.out.persistence.mappers;

import com.ecommerce.microservices.adapters.out.persistence.ProduitJpaEntity;
import com.ecommerce.microservices.domain.Produit;
import org.mapstruct.Mapper;

@Mapper
public interface ProduitPersistenceMapper {
    Produit ProduitJpaEntityToProduit(ProduitJpaEntity jpaEntity);
    ProduitJpaEntity produitToProduitJpaEntity(Produit produit);
}