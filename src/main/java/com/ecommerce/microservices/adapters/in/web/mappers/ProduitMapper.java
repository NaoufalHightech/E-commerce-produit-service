package com.ecommerce.microservices.adapters.in.web.mappers;

import com.ecommerce.microservices.adapters.in.web.model.ProduitDtoResponse;
import com.ecommerce.microservices.domain.Produit;
import org.mapstruct.Mapper;

@Mapper
public interface ProduitMapper {

    ProduitDtoResponse produitToProduitDtoResponse(Produit produit);
    Produit produitToProduitDtoResponse(ProduitDtoResponse produitDto);
}
