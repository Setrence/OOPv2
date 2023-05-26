package DZ_Sem_7.observer;

public class Programer implements Observer{
    private  String name;
    private double salary;

    public Programer(String name) {
        this.name = name;
        salary = 100000;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Програмист %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary);
        }
    }
}
