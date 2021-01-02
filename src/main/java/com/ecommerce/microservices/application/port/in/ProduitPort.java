package com.ecommerce.microservices.application.port.in;

import com.ecommerce.microservices.domain.Produit;

import java.util.List;

public interface ProduitPort {

    Produit getProduit(Long id);
    //List<Produit> listeProduits();

}
