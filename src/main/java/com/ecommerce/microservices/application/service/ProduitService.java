package com.ecommerce.microservices.application.service;

import com.ecommerce.microservices.application.port.in.ProduitPort;
import com.ecommerce.microservices.domain.Produit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ProduitService implements ProduitPort {
    private final com.ecommerce.microservices.application.port.out.ProduitPort produitPort;

    @Override
    public Produit getProduit(Long id) {
        return produitPort.getProduit(id);
    }
}
