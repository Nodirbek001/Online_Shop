package com.example.online_shop.service.contract;

import com.example.online_shop.dto.basa.AddDto;
import com.example.online_shop.dto.basa.Dto;

import java.util.List;

/**
 * {@link CrudService}
 */
public interface CrudService<
        A extends AddDto,
        D extends Dto
        > {

    boolean add(A dto);

    boolean edit(Long id, A dto);

    void delete(Long id);

    List<Dto> findAll();

}
