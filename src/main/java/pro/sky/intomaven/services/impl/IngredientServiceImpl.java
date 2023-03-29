package pro.sky.intomaven.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.intomaven.model.Ingredient;
import pro.sky.intomaven.services.IngredientService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final Map <Integer, Ingredient> ingredientMap = new HashMap<>();
    private int countId = 1;
    @Override
    public int addIngredient(Ingredient ingredient) {
        int id = countId++;
        ingredientMap.put(id, ingredient);

        return id;
    }
    @Override
    public boolean removeIngredient(int id){
        if (ingredientMap.containsKey(id)){
            ingredientMap.remove(id);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean editIngredient(int id, Ingredient ingredient){
        if (ingredientMap.containsKey(id)){
            ingredientMap.put(id, ingredient);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String infoIngredient (int id){
        return ingredientMap.get(id).toString();
    }

    @Override
    public ArrayList<Ingredient> getAllIngredient() {
        return new ArrayList<>(ingredientMap.values());
    }

    @Override
    public Ingredient getIngredientById(int id) {
        return ingredientMap.get(id);
    }
}