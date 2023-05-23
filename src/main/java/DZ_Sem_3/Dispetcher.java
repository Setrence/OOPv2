package DZ_Sem_3;

public class Dispetcher extends Emloyer{
    public Dispetcher(String name, String surname, int salary, int age) {
        super(name, surname, salary, age);
    }


    @Override
    public String toString() {
        return String.format("%s %s возраст %d; Диспетчер; Среднемесячная заработная плата (фиксированная месячная оплата): %d (руб.)", name, surname, age, salary);
    }

}
