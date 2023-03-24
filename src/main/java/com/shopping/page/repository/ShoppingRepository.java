package com.shopping.page.repository;

import java.util.List;
import java.util.Optional;

import com.shopping.page.domain.Shopping;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingRepository extends CrudRepository<Shopping, Integer> {
    @Override
    List<Shopping> findAll();

    @Override
    Optional<Shopping> findById(Integer id);

    @Override
    Shopping save(Shopping shopping);

    @Override
    void deleteById(Integer id);
}