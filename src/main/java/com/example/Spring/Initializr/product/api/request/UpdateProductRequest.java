package com.example.Spring.Initializr.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateProductRequest extends ProductRequest {
    private final Long id;

    @JsonCreator
    public UpdateProductRequest(String name, Long id) {
        super(name); // Передаем имя в родительский класс ProductRequest
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}