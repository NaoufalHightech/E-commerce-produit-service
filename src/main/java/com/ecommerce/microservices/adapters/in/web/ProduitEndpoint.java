package com.ecommerce.microservices.adapters.in.web;

import com.ecommerce.microservices.adapters.in.web.mappers.ProduitMapper;
import com.ecommerce.microservices.adapters.in.web.model.ProduitDtoResponse;
import com.ecommerce.microservices.application.port.in.ProduitPort;
import com.ecommerce.microservices.domain.Produit;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProduitEndpoint {

    private final ProduitPort produitPort;
    private final ProduitMapper produitMapper;

    //Best practice
    @GetMapping(value = "/produits")
    public String listeProduits() {
        return "Un exemple de produit";
    }

    //Récupérer un produit par son Id
    @GetMapping(value = "/produits/{id}")
    public ResponseEntity<ProduitDtoResponse> afficherUnProduit(@PathVariable Long id) {

        Produit produit = produitPort.getProduit(id);

        return ResponseEntity
                .ok()
                .body(produitMapper.produitToProduitDtoResponse(produit));
    }
}
