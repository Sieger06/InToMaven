package pro.sky.intomaven.services;

import pro.sky.intomaven.model.Ingredient;

public interface IngredientService {
    int putIngredient (Ingredient ingredient);
    Ingredient getIngredient (int id);
}