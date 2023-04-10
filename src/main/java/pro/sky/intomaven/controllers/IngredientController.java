package pro.sky.intomaven.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.intomaven.model.Ingredient;
import pro.sky.intomaven.services.IngredientService;

import java.util.ArrayList;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping("/add")
    public String addIngredient (@RequestBody Ingredient ingredient){
        return "Рецепт успешно добавлен (ID: " + ingredientService.addIngredient(ingredient) + ")";
    }
    @PutMapping("/edit/{id}")
    public boolean editIngredient (@PathVariable int id, @RequestBody Ingredient ingredient){
        return ingredientService.editIngredient(id, ingredient);
    }
    @PutMapping("/remove/{id}")
    public boolean removeIngredient (@PathVariable int id){
        return ingredientService.removeIngredient(id);
    }
    @GetMapping("/get/{id}")
    public String getIngredient(@PathVariable int id){
        return ingredientService.infoIngredient(id);
    }
    @GetMapping("/get")
    public ArrayList<Ingredient> getAllIngredient(){
        return ingredientService.getAllIngredient();
    }
}