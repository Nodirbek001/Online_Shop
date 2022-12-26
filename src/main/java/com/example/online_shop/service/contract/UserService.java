package com.example.online_shop.service.contract;

import com.example.online_shop.dto.userDTO.LoginDTO;
import com.example.online_shop.dto.userDTO.RegisterDTO;
import com.example.online_shop.dto.userDTO.UserDTO;

public interface UserService extends CrudService<RegisterDTO, UserDTO>{
    boolean login(LoginDTO loginDTO);
}
