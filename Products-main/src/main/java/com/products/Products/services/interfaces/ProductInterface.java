package com.products.Products.services.interfaces;

import com.products.Products.dtos.RequestProductDTO;
import com.products.Products.dtos.ResponseProductDTO;
import com.products.Products.models.ProductModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductInterface {

    void saveProduct(RequestProductDTO product);

    List<ResponseProductDTO> getAllProducts();

    ResponseProductDTO getProductById(UUID idProduct);

    void deleteProduct(UUID idProduct);

    void updateProduct(RequestProductDTO requestProductDTO, ProductModel productModel);
}