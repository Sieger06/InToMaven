package pro.sky.intomaven.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.intomaven.model.Ingredient;
import pro.sky.intomaven.services.IngredientService;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final Map<Integer, Ingredient> ingredientMap = new HashMap<>();
    private int countId = 1;
    @Override
    public int putIngredient(Ingredient ingredient) {
        int id = countId++;
        ingredientMap.put(id, ingredient);
        return id;
    }
    @Override
    public Ingredient getIngredient(int id) {
        return ingredientMap.get(id);
    }
}