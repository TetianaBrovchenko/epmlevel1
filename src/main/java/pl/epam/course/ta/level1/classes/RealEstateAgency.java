package pl.epam.course.ta.level1.classes;

public class RealEstateAgency {
//  Создать массив объектов. Вывести:
//  a) список квартир, имеющих заданное число комнат;
//  b) список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке;
//  c) список квартир, имеющих площадь, превосходящую заданную.

    public static void main(String[] args) {
        House staraOdra = new House(1, 1, 28, 0, 1, "Piesza", "Apartamentowec", 5);
        House mlynRozanka = new House(2, 4, 76, 4, 4, "Mlyniarska", "Apartamentowec", 1);
        House obornicka = new House(3, 10, 44, 0, 2, "Obornicka", "Blok", 35);
        House obornickaPremium = new House(4, 31, 68, 4, 4, "Obornicka", "Apartamentowec", 2);
        House zlotaPodkowa = new House(5, 12, 80, 5, 3, "Zwycieska", "Apartamentowec", 8);
        House karLowice = new House(6, 115, 59, 12, 3, "Broniewskigo", "Blok", 25);
        House noweMiastoRozanka = new House(7, 86, 96, 7, 4, "Bezpieczna", "Apartamentowec", 2);
        House zielonaWyspa = new House(8, 56, 38, 3, 2, "Gajowicka", "Apartamentowec", 15);
        House przyKamienskiego = new House(9, 216, 48, 9, 2, "Kamienskiego", "Blok", 25);
        House promenadyWroclawskie = new House(10, 18, 218, 16, 5, "Zakladowa", "Apartamentowec", 2);

        House[] databaseRealEstateAgency = {staraOdra, mlynRozanka, obornicka, obornickaPremium, zlotaPodkowa,
                karLowice, noweMiastoRozanka, zielonaWyspa, przyKamienskiego, promenadyWroclawskie};


        searchListApartmentsWithGivenNumberRooms(databaseRealEstateAgency);

        searchListApartmentsWithGivenNumberRoomsLocatedFloorInGivenInterval(databaseRealEstateAgency);

        searchListApartmentsWithAreaExceedingGivenOne(databaseRealEstateAgency);

    }

    private static void searchListApartmentsWithGivenNumberRooms(House[] apartments) {
        System.out.println("Cписок квартир, имеющих 2 комнаты:");
        int amountRooms = 2;
        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i].amountRoomsApartment == amountRooms) {
                System.out.println(apartments[i].toString());
            }
        }
        System.out.println();
    }

    private static void searchListApartmentsWithGivenNumberRoomsLocatedFloorInGivenInterval(House[] apartments) {
        System.out.println("Cписок квартир, имеющих 3 комнаты и расположенных на 2-7 этажах");
        int amountRooms = 3;
        int startFloorGap = 2;
        int endFloorGap = 7;
        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i].amountRoomsApartment == amountRooms &&
                    apartments[i].floorApartment >= startFloorGap && apartments[i].floorApartment <= endFloorGap) {
                System.out.println(apartments[i].toString());
            }
        }
        System.out.println();
    }

    private static void searchListApartmentsWithAreaExceedingGivenOne(House[] apartments) {
        System.out.println("Cписок квартир, имеющих площадь, превосходящую 60 кв.м.");
        int squareApartment = 60;
        for (int i = 0; i < 10; i++) {
            if (apartments[i].squareApartment > squareApartment) {
                System.out.println(apartments[i].toString());
            }
        }
        System.out.println();
    }
}

