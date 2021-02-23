package pl.epam.course.ta.level1.classes;

//        Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(),
//        toString(). Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора
//        данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено
//        несколько конструкторов.

public class House {
    //6. House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации.
    int id;                         //Идентификатор дома
    int numerApartment;             // Номер квартиры
    double squareApartment;         // Площадь квартиры
    int floorApartment;             //Этаж дома
    int amountRoomsApartment;       // Количество комнат в квартире
    String streetOfHouse;           // Улица
    String buildingType;            // Тип дома
    int lifeTime;                   // Срок эксплуатации

    public House() {
    }

    public House(int id, int numerApartment, double squareApartment, int floorApartment, int amountRoomsApartment,
                 String streetOfHouse, String buildingType, int lifeTime) {
        this.id = id;
        this.numerApartment = numerApartment;
        this.squareApartment = squareApartment;
        this.floorApartment = floorApartment;
        this.amountRoomsApartment = amountRoomsApartment;
        this.streetOfHouse = streetOfHouse;
        this.buildingType = buildingType;
        this.lifeTime = lifeTime;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumerApartment() {
        return numerApartment;
    }

    public void setNumerApartment(int numerApartment) {
        this.numerApartment = numerApartment;
    }

    public double getSquareApartment() {
        return squareApartment;
    }

    public void setSquareApartment(double squareApartment) {
        this.squareApartment = squareApartment;
    }

    public int getFloorApartment() {
        return floorApartment;
    }

    public void setFloorApartment(int floorApartment) {
        this.floorApartment = floorApartment;
    }

    public int getAmountRoomsApartment() {
        return amountRoomsApartment;
    }

    public void setAmountRoomsApartment(int amountRoomsApartment) {
        this.amountRoomsApartment = amountRoomsApartment;
    }

    public String getStreetOfHouse() {
        return streetOfHouse;
    }

    public void setStreetOfHouse(String streetOfHouse) {
        this.streetOfHouse = streetOfHouse;
    }


    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return "Id здания =" + id +
                ", № квартиры =" + numerApartment +
                ", Площадь квартиры =" + squareApartment +
                ", Этаж дома: " + floorApartment +
                ", Количество комнат в квартире :" + amountRoomsApartment +
                ", Улица:'" + streetOfHouse + '\'' +
                ", Тип дома:'" + buildingType + '\'' +
                ", Срок эксплуатации дома:" + lifeTime;
    }
}
