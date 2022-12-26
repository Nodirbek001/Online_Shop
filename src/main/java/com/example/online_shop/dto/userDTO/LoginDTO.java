package com.example.online_shop.dto.userDTO;

import com.example.online_shop.dto.basa.AddDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LoginDTO implements AddDto {

    private String username;

    private String password;


}
