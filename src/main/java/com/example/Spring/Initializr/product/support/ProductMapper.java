package com.example.Spring.Initializr.product.support;

import org.springframework.stereotype.Component;
import com.example.Spring.Initializr.product.api.request.ProductRequest;
import com.example.Spring.Initializr.product.api.response.ProductResponse;
import com.example.Spring.Initializr.product.domain.Product;
import com.example.Spring.Initializr.product.api.request.UpdateProductRequest;
import java.util.List;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName()); // Устанавливаем новое имя
        return product;
    }
    public List<ProductResponse> toProductResponses(List<Product> products) {
        return products.stream()
                .map(this::toProductResponse)
                .toList();
    }
}