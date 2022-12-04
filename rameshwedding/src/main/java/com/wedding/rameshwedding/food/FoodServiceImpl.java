package com.wedding.rameshwedding.food;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodServiceImpl implements FoodService{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private FoodsRepository foodsRepository;
    @Override
    public FoodDTO.ResponseFoodDto addFoodItem(FoodDTO.RequestFoodDto requestFoodDto) {

        FoodEntity foodEntity=modelMapper.map(requestFoodDto, FoodEntity.class);

        var foodSavedEntity=foodsRepository.save(foodEntity);

        FoodDTO.ResponseFoodDto response=modelMapper.map(foodSavedEntity, FoodDTO.ResponseFoodDto.class);

        return response;
    }

    @Override
    public List<FoodDTO.ResponseFoodDto> foodByCategory(Integer foodCategory) {
        var responseList=foodsRepository.findByfoodCategory(foodCategory).orElseThrow(
                ()->new FoodNotFoundException(foodCategory)
        );
        var response=responseList
                .stream()
                .map(foodEntity ->(modelMapper.map(foodEntity,FoodDTO.ResponseFoodDto.class)))
                .collect(Collectors.toList());
        return response;
    }

    static class FoodNotFoundException extends RuntimeException {
        public FoodNotFoundException(Integer category) {
            super("No Food Items found with the category "+category);
        }
    }
}
