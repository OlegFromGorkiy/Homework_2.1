public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand != null ? brand : "default";
        this.model = brand != null ? brand : "default";
        this.engineVolume = engineVolume < 0 ? 1.5f : engineVolume;
        this.color = color != null ? color : "белый";
        this.productionYear = productionYear < 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry != null ? productionCountry : "default";
    }

    public Car(String brand, String model, String color, int productionYear, String productionCountry) {
        this.brand = brand != null ? brand : "default";
        this.model = model != null ? model : "default";
        engineVolume = 1.5f;
        this.color = color != null ? color : "белый";
        this.productionYear = productionYear < 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry != null ? productionCountry : "default";
    }

    public Car(String brand, String model, float engineVolume, String color, String productionCountry) {
        this.brand = brand != null ? brand : "default";
        this.model = model != null ? model : "default";
        this.engineVolume = engineVolume < 0 ? 1.5f : engineVolume;
        this.color = color != null ? color : "белый";
        this.productionYear = 2000;
        this.productionCountry = productionCountry != null ? productionCountry : "default";
    }

    public Car(String brand, String model, String color, String productionCountry) {
        this.brand = brand != null ? brand : "default";
        this.model = model != null ? model : "default";
        this.engineVolume = 1.5f;
        this.color = color != null ? color : "белый";
        this.productionYear = 2000;
        this.productionCountry = productionCountry != null ? productionCountry : "default";
    }
    //можно еще @еву тучу разных конструкторов написать... На все случаи жизни.

    public Car() {
        brand = "default";
        model = "default";
        engineVolume = 1.5f;
        color = "белый";
        productionYear = 2000;
        productionCountry = "default";
    }

    @Override
    public String toString() {
        return String.format("%s %s, сборка - %s, цвет кузова - %s, объем двигателя - %.1f литра, год выпуска - %d год.",
                brand, model, productionCountry, color, engineVolume, productionYear);
    }
}
