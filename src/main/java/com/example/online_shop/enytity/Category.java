package com.example.online_shop.enytity;

import com.example.online_shop.enytity.base.Abstract;
import lombok.*;


import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Category extends Abstract {
 private String name;

 private boolean active=true;

}
