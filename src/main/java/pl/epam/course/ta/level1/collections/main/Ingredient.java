package pl.epam.course.ta.level1.collections.main;

public class Ingredient {
    private Plant plant;
    private int weight;

    public Ingredient(Plant name, int weight) {
        this.plant = name;
        this.weight = weight;
    }

    public Plant getPlant() {
        return plant;
    }

    public int getWeight() {
        return weight;
    }

    public Integer getCalorieContent() {
        return plant.getCalorieContent() * getWeight() / 100;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "plant=" + plant +
                ", weight=" + weight +
                '}';
    }
}
