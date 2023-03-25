package pro.sky.intomaven.services.impl;

import pro.sky.intomaven.model.Ingredient;

public interface IngredientService {
    int putIngredient (Ingredient ingredient);
    Ingredient getIngredient (int id);
}