package DZ_Sem_3;

public class Worker extends Emloyer{

    public Worker() {
    }
    public Worker(String name, String surname, int salary, int age) {
        super(name, surname, salary, age);
    }


    @Override
    public String toString() {
        return String.format("%s %s возраст %d; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %d (руб.)", name, surname, age, salary);
    }

}
