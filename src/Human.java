
public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public Human() {
        yearOfBirth = 0;
        name = "Информация не указана";
        town = "Информация не указана";
        job = "Информация не указана";
    }

    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.name = name != null ? name : "Информация не указана";
        this.town = town != null ? town : "Информация не указана";
        this.job = job != null ? job : "Информация не указана";
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        name = name != null ? name : "Информация не указана";
        town = town != null ? town : "Информация не указана";
        job = job != null ? job : "Информация не указана";
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!",
                name, town, yearOfBirth, job);
    }

    public void smallGreeting() {
        name = name != null ? name : "Информация не указана";
        town = town != null ? town : "Информация не указана";
        job = job != null ? job : "Информация не указана";
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Будем знакомы!%n",
                name, town, yearOfBirth);
    }
}