package pl.epam.course.ta.level1.collections.main;

public abstract class Plant {
    private String name;
    private PlantGroup plantGroup;
    private int calorieContent;

    public Plant(PlantGroup plantGroup, String name, int calorieContent) {
        this.name = name;
        this.plantGroup = plantGroup;
        this.calorieContent = calorieContent;
    }

    public String getName() {
        return name;
    }

    public PlantGroup getPlantGroup() {
        return plantGroup;
    }

    public int getCalorieContent() {
        return calorieContent;
    }
}
