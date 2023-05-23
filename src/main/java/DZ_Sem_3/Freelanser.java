package DZ_Sem_3;

public class Freelanser extends Emloyer {
    public Freelanser(String name, String surname, int salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s возраст %d; Фрилансер; Среднемесячная заработная плата (фиксированная месячная оплата): %d (руб.)", name, surname, age, salary);
    }

}
