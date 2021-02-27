package pl.epam.course.ta.level1.collections.main;

import java.util.Comparator;

public class IngredientsByCalorieContentComparator implements Comparator<Ingredient> {

    @Override
    public int compare(Ingredient ingredient1, Ingredient ingredient2) {
        return ingredient1.getCalorieContent().compareTo(ingredient2.getCalorieContent());
    }
}
