public class Main {
    public static void main(String[] args) {

        Human maxim = new Human();
        System.out.println("Пустые поля");
        maxim.smallGreeting();
        System.out.println(maxim);
        System.out.println("Полные поля");
        maxim.setName("Максим");
        maxim.setTown("Минск");
        maxim.setYearOfBirth(2022-35);
        maxim.setJob("бренд-менеджер");
        maxim.smallGreeting();
        System.out.println(maxim);
        System.out.println("Другие люди");

        Human ann = new Human(2022 - 29, "Аня", "Москва", "методист образовательных программ");
        ann.smallGreeting();
        System.out.println(ann);

        Human kate = new Human(2022 - 28, "Катя", "Москва", "продакт-менеджер");
        kate.smallGreeting();
        System.out.println(kate);

        Human artem = new Human(2022 - 27, "Артем", "Москва", "директор по развитию бизнеса");
        artem.smallGreeting();
        System.out.println(artem);

        System.out.println("Плохой год рождения");
        artem = new Human(2022 - 2700, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(artem);

        System.out.println("Плохое имя");
        artem = new Human(2022 - 27, null, "Москва", "директор по развитию бизнеса");
        System.out.println(artem);

        System.out.println("Плохой город");
        artem = new Human(2022 - 27, "Артем", null, "директор по развитию бизнеса");
        System.out.println(artem);

        System.out.println("Плохая работа");
        artem = new Human(2022 - 27, "Артем", "Москва", null);
        System.out.println(artem);
        System.out.println("\n***Машины***\n");
        Car lada = new Car("Lada", "Grande", 1.7f, "желтый", 2015, "Россия");
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия");
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage", 2.4f, "красный", 2018, "Южная Корея");
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        System.out.println(hyundai);

    }
}
