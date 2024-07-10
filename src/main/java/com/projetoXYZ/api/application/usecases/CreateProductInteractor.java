package com.projetoXYZ.api.application.usecases;

import com.projetoXYZ.api.application.usecases.gateways.ProductGateway;
import com.projetoXYZ.api.domain.entity.Product;

public class CreateProductInteractor {

    private ProductGateway productGateway;

    public CreateProductInteractor(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public Product createProduct(Product product) {
        return productGateway.createProduct(product);
    }
}
