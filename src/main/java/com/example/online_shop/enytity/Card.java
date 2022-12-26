package com.example.online_shop.enytity;

import com.example.online_shop.enytity.base.Abstract;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Card extends Abstract {

    @Size(min = 16, max = 16)
    @Column(unique = true)
    private Long cardNumber;
    @Size(max = 2, min = 2)
    private Long cardPassword;
    private Long balance;
    @Size(min = 2, max = 2)
    private Integer deadlineMonth;
    @Size(min = 2, max = 2)
    private Integer deadlineYear;
}
