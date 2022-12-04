package com.wedding.rameshwedding.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "foods")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NonNull
    @Column(name="food_name",nullable = false)
    private String foodName;

    // Todo: Use @Column Annotation

    private Integer foodCategory;
    private Integer intialQuantity;
    private Integer currentQuantity;
}
