package com.wedding.rameshwedding.food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodsRepository extends JpaRepository<FoodEntity, Long> {
    Optional<List<FoodEntity>> findByfoodCategory(Integer foodCategory) ;
}
