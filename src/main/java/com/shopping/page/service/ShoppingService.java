package com.shopping.page.service;

import java.util.List;
import java.util.Optional;

import com.shopping.page.domain.Shopping;
import com.shopping.page.repository.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {

    @Autowired
    private ShoppingRepository repository;

    public List<Shopping> getAllShopping() {
        return repository.findAll();
    }

    public Optional<Shopping> getShopping(Integer id) {
        return repository.findById(id);
    }

    public Shopping saveShopping(Shopping shopping) {
        return repository.save(shopping);

    }

    public Shopping updateShopping(Shopping shopping) {
        return repository.save(shopping);
    }

    public void deleteShopping(Integer id){
        repository.deleteById(id);
    }
}