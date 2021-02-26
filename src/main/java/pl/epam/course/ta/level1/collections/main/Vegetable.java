package pl.epam.course.ta.level1.collections.main;

public class Vegetable extends Plant {
    private VegetableCrop vegetableCrop;

    public Vegetable(String name, int calorieContent, VegetableCrop vegetableCrop) {
        super(PlantGroup.VEGETABLE, name, calorieContent);
        this.vegetableCrop = vegetableCrop;
    }

    private VegetableCrop getVegetableCrop() {
        return vegetableCrop;
    }

    @Override
    public String toString() {
        return "Овощ" +
                " " + getName() + '\t' +
                " калорийность=" + getCalorieContent() + " кал/100 гр" + '\t' +
                " Овощная культура " + vegetableCrop;
    }
}
