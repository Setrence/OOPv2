package DZ_Sem_7.observer;

public class Programer implements Observer{
    private  String name;
    private double salary;

    public Programer(String name) {
        this.name = name;
        salary = 100000;
    }

    @Override
    public void receiveOffer(JobVacancy vacancy) {
        if (this.salary < vacancy.getSalary()){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %f]\n", name, vacancy.getSpecialization(), vacancy.getSalary());
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - %f]\n", name, vacancy.getSpecialization(), vacancy.getSalary());
        }
    }
}
