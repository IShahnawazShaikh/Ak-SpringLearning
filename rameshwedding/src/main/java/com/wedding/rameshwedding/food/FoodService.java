package com.wedding.rameshwedding.food;


import java.util.List;

public interface FoodService {

    FoodDTO.ResponseFoodDto addFoodItem(FoodDTO.RequestFoodDto requestFoodDto);

    List<FoodDTO.ResponseFoodDto> foodByCategory(Integer foodCategory);


}
