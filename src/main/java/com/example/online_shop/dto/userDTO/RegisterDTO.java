package com.example.online_shop.dto.userDTO;

import com.example.online_shop.dto.basa.AddDto;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class RegisterDTO implements AddDto {

    private String username;

    private String password;
    private String phone;

}
