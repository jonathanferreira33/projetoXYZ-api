package com.projetoXYZ.api.infrastructure.controllers;

import com.projetoXYZ.api.domain.entity.Product;

public class ProductDTOMapper {
    CreateProductResponse toResponse(Product product) {
        return new CreateProductResponse(
                product.productName(),
                product.shortDescription(),
                product.fullDescription()
                );
    }

    public Product toProduct(CreateProductRequest request) {
        return new Product(
                request.productname(),
                request.shortdescription(),
                request.fulldescription()
        );
    }
}
