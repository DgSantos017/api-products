package com.products.Products.dtos;

import com.products.Products.enums.TypeProductEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class ResponseProductDTO {
    private UUID idProduct;
    private String name;
    private String description;
    private BigDecimal price;
    private TypeProductEnum typeProduct;
    private Date dateCreation;
    private Date dateUpdate;
}
