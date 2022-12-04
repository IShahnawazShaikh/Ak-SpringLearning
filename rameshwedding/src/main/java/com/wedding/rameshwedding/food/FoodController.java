package com.wedding.rameshwedding.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodServiceImpl foodService;

    @PostMapping("/addFood")
    public ResponseEntity addFoodItem(@RequestBody FoodDTO.RequestFoodDto foodDto){

        var response=foodService.addFoodItem(foodDto);

        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping("/byCategory/{foodCategory}")
    public ResponseEntity foodByCategory(@PathVariable Integer foodCategory)  {
        var response=foodService.foodByCategory(foodCategory);
        return ResponseEntity.ok(response);
    }
}
