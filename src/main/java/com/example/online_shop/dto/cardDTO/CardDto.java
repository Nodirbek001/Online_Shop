package com.example.online_shop.dto.cardDTO;

import com.example.online_shop.dto.basa.AddDto;


public class CardDto implements AddDto {
    private Long cardNumber;
    private String password;
    private String repeatPassword;
    private Long balance;
    private Integer deadlineMonth;
    private Integer deadlineYear;
}
