package com.projetoXYZ.api.infrastructure.gateways;

import com.projetoXYZ.api.domain.entity.Product;
import com.projetoXYZ.api.infrastructure.persistence.ProductEntity;

public class ProductEntityMapper {
    ProductEntity toEntity(Product productDomainObj){
        return new ProductEntity(
                productDomainObj.productName(),
                productDomainObj.shortDescription(),
                productDomainObj.fullDescription()
        );
    }

    Product toDomainObj(ProductEntity productEntity) {
        return new Product(
                productEntity.getProductName(),
                productEntity.getShortDescription(),
                productEntity.getFullDescription()
        );
    }
}
