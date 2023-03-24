package com.shopping.page.mapper;


import java.util.List;
import java.util.stream.Collectors;

import com.shopping.page.domain.Shopping;
import com.shopping.page.domain.ShoppingDto;
import org.springframework.stereotype.Component;

@Component
public class ShoppingMapper {

    public Shopping mapToShopping(final ShoppingDto shoppingDto) {
        return new Shopping(
                shoppingDto.getId(),
                shoppingDto.getName(),
                shoppingDto.getDescription());
    }

    public ShoppingDto mapToShoppingDto(final Shopping shopping) {
        return new ShoppingDto(
                shopping.getId(),
                shopping.getName(),
                shopping.getDescription()
        );
    }

    public List<ShoppingDto> mapToShoppingDtoList(final List<Shopping> shoppingList) {
        return shoppingList.stream()
                .map(a -> new ShoppingDto(a.getId(), a.getName(), a.getDescription()))
                .collect(Collectors.toList());
    }
}