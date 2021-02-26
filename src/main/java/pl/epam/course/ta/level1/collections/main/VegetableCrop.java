package pl.epam.course.ta.level1.collections.main;

public enum VegetableCrop {
    TUBERS("Клубнеплод"),
    ROOTS("Корнеплод"),
    CABBAGE("Капустные"),
    ONION("Луковые"),
    SALAD("Салатные"),
    SPICY("Пряные"),
    DESSERT("Десертные"),
    NIGHTSHADE("Паслёновые ");

    private final String crops;

    private VegetableCrop(String s) {
        crops = s;
    }

    public String toString() {
        return this.crops;
    }
}
