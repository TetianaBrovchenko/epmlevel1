package pl.epam.course.ta.level1.collections.main;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class ChifCooker {

    public static void main(String[] args) {
        Vegetable vegetablePotatoe = new Vegetable("Картофель", 77, VegetableCrop.TUBERS);
        Vegetable vegetableCarrot = new Vegetable("Морковь", 40, VegetableCrop.ROOTS);
        Vegetable vegetableBeet = new Vegetable("Свекла", 43, VegetableCrop.ROOTS);
        Vegetable vegetableRadishe = new Vegetable("Редис", 20, VegetableCrop.ROOTS);
        Vegetable vegetableCelery = new Vegetable("Сельдерей", 12, VegetableCrop.ROOTS);
        Vegetable vegetableWhiteCabbage = new Vegetable("Белокачанная капуста", 28, VegetableCrop.CABBAGE);
        Vegetable vegetableRedCabbage = new Vegetable("Краснокачанная капуста", 31, VegetableCrop.CABBAGE);
        Vegetable vegetableBroccoli = new Vegetable("Брокколи", 25, VegetableCrop.CABBAGE);
        Vegetable vegetableSalad = new Vegetable("Листовой салат", 15, VegetableCrop.SALAD);
        Vegetable vegetableDill = new Vegetable("Укроп", 43, VegetableCrop.SPICY);
        Vegetable vegetableBasil = new Vegetable("Базилик", 23, VegetableCrop.SPICY);
        Vegetable vegetableOnion = new Vegetable("Лук", 40, VegetableCrop.ONION);
        Vegetable vegetableGarlic = new Vegetable("Чеснок", 149, VegetableCrop.ONION);
        Vegetable vegetableTomato = new Vegetable("Помидор", 18, VegetableCrop.NIGHTSHADE);
        Vegetable vegetableEggplant = new Vegetable("Баклажан", 25, VegetableCrop.NIGHTSHADE);

        Recipe salade = new Recipe("Овощной салат");
        salade.addIngredient(new Ingredient(vegetablePotatoe, 200));
        salade.addIngredient(new Ingredient(vegetablePotatoe, 200));
        salade.addIngredient(new Ingredient(vegetableCarrot, 150));
        salade.addIngredient(new Ingredient(vegetableRadishe, 100));
        salade.addIngredient(new Ingredient(vegetableCelery, 100));
        salade.addIngredient(new Ingredient(vegetableDill, 100));
        salade.addIngredient(new Ingredient(vegetableOnion, 150));

        int calorieContentOfSalad = calculateCalorieContentOfDish(salade);
        System.out.println("Калорийность салата " + calorieContentOfSalad + " ккалл на 100 гр");

        Recipe saladeSortedIngredient = sortIngredientsSalad(salade);
        System.out.println("Ингредиенты салата отсортированные по названию овощей " + saladeSortedIngredient);

        Set<Vegetable> foundVegetables = findVegetablesInTargetCalorieRange(salade);
        System.out.println("Овощи в салате, у которых калорийность не превышает 40 ккал/100 гр :"
                + Arrays.toString(foundVegetables.stream().map(vegetable -> vegetable.getName()).toArray()));

    }

    private static int calculateCalorieContentOfDish(Recipe salade) {
        int calorieContentOfDish = 0;
        int wholeWeight = 0;

        Iterator<Ingredient> it = salade.getIngredients().iterator();
        while (it.hasNext()) {
            Ingredient ingredient = it.next();
            calorieContentOfDish += calorieContent(ingredient);
            wholeWeight += ingredient.getWeight();
        }
        return calorieContentOfDish / (wholeWeight / 100);
    }

    private static int calorieContent(Ingredient ingredient) {
        return ingredient.getWeight() / 100 * ingredient.getPlant().getCalorieContent();
    }

    private static Recipe sortIngredientsSalad(Recipe salade) {
        return null;
    }

    private static Set<Vegetable> findVegetablesInTargetCalorieRange(Recipe salade) {
        Set<Vegetable> vegetables = new HashSet<>();
        Iterator<Ingredient> it = salade.getIngredients().iterator();
        while (it.hasNext()) {
            Ingredient ingredient = it.next();
            if (ingredient.getPlant().getCalorieContent() <= 40) {
                vegetables.add((Vegetable) ingredient.getPlant());
            }
        }
        return vegetables;
    }

}
