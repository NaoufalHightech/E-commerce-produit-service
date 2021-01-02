package com.ecommerce.microservices.adapters.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<ProduitJpaEntity, Long> {
}
