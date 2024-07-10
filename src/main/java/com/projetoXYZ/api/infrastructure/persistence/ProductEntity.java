package com.projetoXYZ.api.infrastructure.persistence;

import org.springframework.data.annotation.Id;

public class ProductEntity {

    @Id
    private Long id;
    private String productName;
    private String shortDescription;
    private String fullDescription;

    public ProductEntity(String productName, String shortDescription, String fullDescription) {
        this.productName = productName;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
