package com.example.Spring.Initializr.product.service;

import org.springframework.stereotype.Service;
import com.example.Spring.Initializr.product.api.request.ProductRequest;
import com.example.Spring.Initializr.product.api.response.ProductResponse;
import com.example.Spring.Initializr.product.domain.Product;
import com.example.Spring.Initializr.product.repository.ProductRepository;
import com.example.Spring.Initializr.product.support.ProductMapper;
import com.example.Spring.Initializr.product.support.exception.ProductExceptionSupplier;
import com.example.Spring.Initializr.product.api.request.UpdateProductRequest;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    // Конструктор для внедрения зависимостей
    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        // 1. Маппим запрос в объект Product
        Product product = productMapper.toProduct(productRequest);

        // 2. Сохраняем в репозиторий
        Product savedProduct = productRepository.save(product);

        // 3. Возвращаем ответ, сконвертированный обратно в ProductResponse
        return productMapper.toProductResponse(savedProduct);
    }
    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return productMapper.toProductResponse(product);
    }
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
    public ProductResponse update(Long id, UpdateProductRequest updateProductRequest) {
        // 1. Ищем продукт или бросаем 404
        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));

        // 2. Обновляем продукт через маппер и сохраняем в репозиторий
        productRepository.save(productMapper.toProduct(product, updateProductRequest));

        // 3. Возвращаем обновленный ответ
        return productMapper.toProductResponse(product);
    }

    public List<ProductResponse> findAll() {
        List<Product> products = productRepository.findAll();
        return productMapper.toProductResponses(products);
    }

}
