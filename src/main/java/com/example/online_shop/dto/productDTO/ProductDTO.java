package com.example.online_shop.dto.productDTO;

import com.example.online_shop.dto.basa.AddDto;
import lombok.*;


import javax.servlet.http.Part;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Builder@Getter
@Setter

public class ProductDTO implements AddDto {

    @NotBlank
    private String productName;
    @NotBlank
    private Long cost;
    @NotBlank
    private Long categoriesId;
    @NotBlank
    private Part photo;

    private Long discount;
    private boolean delete;
    private  Long numberOfProduct;

    private boolean like;


}
