package pl.epam.course.ta.level1.collections.main;

import java.util.*;

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
        salade.addIngredient(new Ingredient(vegetablePotatoe, 75));
        salade.addIngredient(new Ingredient(vegetableCarrot, 75));
        salade.addIngredient(new Ingredient(vegetableRadishe, 100));
        salade.addIngredient(new Ingredient(vegetableCelery, 100));
        salade.addIngredient(new Ingredient(vegetableDill, 5));
        salade.addIngredient(new Ingredient(vegetableOnion, 15));

        int calorieContentOfSalad = calculateCalorieContentOfDish(salade);
        System.out.println("Калорийность салата " + calorieContentOfSalad + " ккалл на 100 гр");

        Set<Ingredient> saladeSortedIngredients = sortSaladIngredients(salade);
        System.out.println("\nИнгредиенты салата '" + salade.getName() + "' отсортированные по калорийности: ");
        saladeSortedIngredients.stream().forEach(ingredient -> {
            System.out.println(ingredient.getPlant().getName() + "(" + ingredient.getWeight() +"g): " +
                    ingredient.getCalorieContent()+ "kcal.");
        });

        Set<Vegetable> foundVegetables = findVegetablesInTargetCalorieRange(salade);
        System.out.println("\nОвощи в салате, у которых калорийность не превышает 40 ккал/100 гр :"
                + Arrays.toString(foundVegetables.stream().map(vegetable -> vegetable.getName()).toArray()));
    }

    private static int calculateCalorieContentOfDish(Recipe salade) {
        int calorieContentOfDish = 0;
        int wholeWeight = 0;

        Iterator<Ingredient> it = salade.getIngredients().iterator();
        while (it.hasNext()) {
            Ingredient ingredient = it.next();
            calorieContentOfDish += ingredient.getCalorieContent();
            wholeWeight += ingredient.getWeight();
        }
        return calorieContentOfDish * 100 / wholeWeight ;
    }

    private static Set<Ingredient> sortSaladIngredients(Recipe salade) {
        Comparator<Ingredient> byCalorieContentComparator = new IngredientsByCalorieContentComparator();
        TreeSet<Ingredient> result = new TreeSet<>(byCalorieContentComparator);
        result.addAll(salade.getIngredients());
        return result.descendingSet();
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
