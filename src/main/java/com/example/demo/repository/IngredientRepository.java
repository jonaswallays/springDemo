package com.example.demo.repository;

import com.example.demo.model.Ingredient;

public interface IngredientRepository {
    public Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
