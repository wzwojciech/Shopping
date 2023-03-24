package com.shopping.page.controler;

import java.util.ArrayList;
import java.util.List;

import com.shopping.page.domain.ShoppingDto;
import com.shopping.page.mapper.ShoppingMapper;
import com.shopping.page.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/shopping")
public class ShoppingController {
    @Autowired
    private ShoppingService service;

    @Autowired
    private ShoppingMapper mapper;

    @RequestMapping(method = RequestMethod.GET, value = "/getShoppingList")
    public List<ShoppingDto> getShoppingList() {
     return mapper.mapToShoppingDtoList(service.getAllShopping());
     //return new ArrayList<>();

    }

    @RequestMapping(method = RequestMethod.GET, value = "/getShooping")
    public ShoppingDto getOneItem(@RequestParam Integer id) throws ShoppingNotFoundException {
        return mapper.mapToShoppingDto(service.getShopping(id).orElseThrow(ShoppingNotFoundException::new));
        //return new ShoppingDto(1,"test", "teest2");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createShopping")
    public void createShopping(@RequestBody ShoppingDto shoppingDto) {
        service.saveShopping(mapper.mapToShopping(shoppingDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateShopping")
    public ShoppingDto updateShopping(@RequestBody ShoppingDto shoppingDto) {
        return mapper.mapToShoppingDto(service.saveShopping(mapper.mapToShopping(shoppingDto)));

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteShopping/{id}")
    public void deleteShopping(@RequestParam Integer id){
        service.deleteShopping(id);
    }

}