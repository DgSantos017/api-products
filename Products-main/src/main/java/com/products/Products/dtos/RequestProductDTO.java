package com.products.Products.dtos;

import com.products.Products.enums.TypeProductEnum;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RequestProductDTO {

    @NotBlank(message = "O nome é obrigatório")
    private String name;

    private String description;

    @NotNull(message = "O preço é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que zero")
    private BigDecimal price;

    @NotNull(message = "O tipo do produto é obrigatório")
    private TypeProductEnum typeProduct;

}
