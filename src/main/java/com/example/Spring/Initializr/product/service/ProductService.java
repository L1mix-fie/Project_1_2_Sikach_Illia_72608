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


    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {

        Product product = productMapper.toProduct(productRequest);


        Product savedProduct = productRepository.save(product);


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

        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));


        productRepository.save(productMapper.toProduct(product, updateProductRequest));


        return productMapper.toProductResponse(product);
    }

    public List<ProductResponse> findAll() {
        List<Product> products = productRepository.findAll();
        return productMapper.toProductResponses(products);
    }

}
