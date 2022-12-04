package com.wedding.rameshwedding.food;

import lombok.Data;

public class FoodDTO {

    @Data
    public static class RequestFoodDto{
        private String foodName;
        private Integer foodCategory;
        private Integer intialQuantity;
        private Integer currentQuantity;
    }

    @Data
    public static class ResponseFoodDto{
        private String foodName;
        private Integer foodCategory;
        private Integer intialQuantity;
        private Integer currentQuantity;
    }
}
