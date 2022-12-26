package com.example.online_shop.service.imp;

import com.example.online_shop.dto.basa.AddDto;
import com.example.online_shop.dto.basa.Dto;
import com.example.online_shop.dto.userDTO.LoginDTO;
import com.example.online_shop.enytity.user.User;
import com.example.online_shop.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    AuthenticationManager authenticationManager;

    @Override
    public boolean add(AddDto dto) {
        return false;
    }

    @Override
    public boolean edit(Long id, AddDto dto) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Dto> findAll() {
        return null;
    }

    @Override
    public boolean login(LoginDTO loginDTO) {
        try {
            Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    loginDTO.getUsername(),
                    loginDTO.getPassword()
            ));
            User principal = (User) authenticate.getPrincipal();
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
