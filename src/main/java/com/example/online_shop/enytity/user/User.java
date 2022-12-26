package com.example.online_shop.enytity.user;

import com.example.online_shop.enytity.Card;
import com.example.online_shop.enytity.base.Abstract;
import com.example.online_shop.enytity.enums.UserRole;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
public class User extends Abstract  {


    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    private Card card;
    @Enumerated(EnumType.STRING)
    private UserRole roles;
    private boolean enabled;


//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(this.roles.name());
//
//        return List.of(simpleGrantedAuthority);    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return enabled;
//    }
}
