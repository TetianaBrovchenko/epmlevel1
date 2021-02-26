package pl.epam.course.ta.level1.collections.main;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;

    private List<Ingredient> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public Recipe(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = new ArrayList<>(ingredients);
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

}
