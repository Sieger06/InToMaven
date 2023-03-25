package pro.sky.intomaven.services.impl;

import pro.sky.intomaven.model.Recipe;

public interface RecipeService {
    int putRecipe (Recipe recipe);
    Recipe getRecipe (int id);
}