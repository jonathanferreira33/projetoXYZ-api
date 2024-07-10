package com.projetoXYZ.api.application.usecases.gateways;

import com.projetoXYZ.api.domain.entity.Product;

public interface ProductGateway {
    Product createProduct(Product product);
}
