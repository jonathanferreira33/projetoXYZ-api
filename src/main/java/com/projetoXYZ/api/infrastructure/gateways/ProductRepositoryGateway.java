package com.projetoXYZ.api.infrastructure.gateways;

import com.projetoXYZ.api.domain.entity.Product;
import com.projetoXYZ.api.infrastructure.persistence.ProductEntity;
import com.projetoXYZ.api.infrastructure.persistence.ProductRepository;

public class ProductRepositoryGateway  implements com.projetoXYZ.api.application.usecases.gateways.ProductGateway {

    private final ProductRepository productRepository;
    private final ProductEntityMapper mapper;

    public ProductRepositoryGateway(ProductRepository productRepository, ProductEntityMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public Product createProduct(Product productDomainObj) {
        ProductEntity productEntity = mapper.toEntity(productDomainObj);
        ProductEntity saveObj = productRepository.save(productEntity);
        return mapper.toDomainObj(saveObj);
    }
}
