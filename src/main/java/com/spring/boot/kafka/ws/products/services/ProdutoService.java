package com.spring.boot.kafka.ws.products.services;

import com.spring.boot.kafka.ws.products.rest.CreateProductRestModel;

public interface ProdutoService {
    String createProduct(CreateProductRestModel productRestModel) throws Exception;
}
