package com.projetoXYZ.api.infrastructure.controllers;

import com.projetoXYZ.api.domain.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetoXYZ.api.application.usecases.CreateProductInteractor;

@RestController
@RequestMapping("product")
public class ProductController {

    private final CreateProductInteractor createProductInteractor;
    private final ProductDTOMapper productDTOMapper;

    public ProductController(CreateProductInteractor createProductInteractor, ProductDTOMapper productDTOMapper) {
        this.createProductInteractor = createProductInteractor;
        this.productDTOMapper = productDTOMapper;
    }

    @PostMapping
    CreateProductResponse create(@RequestBody CreateProductRequest request) {
        Product productBusinessObj = productDTOMapper.toProduct(request);
        Product product = createProductInteractor.createProduct(productBusinessObj);
        return productDTOMapper.toResponse(product);
    }
}