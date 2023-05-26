package DZ_Sem_7.observer;

public class Programer implements Observer{
    private  String name;
    private double salary;

    public Programer(String name) {
        this.name = name;
        salary = 110000;
    }

    @Override
    public void receiveOffer(JobVacancy vacancy) {
        if (this.salary < vacancy.getSalary()) {
            if (vacancy.getSpecialization().equals("ITSecialist")) {
                System.out.printf("Программист %s >>> Мне нужна эта работа! [%s - %.2f]\n", name, vacancy.getSpecialization(), vacancy.getSalary());
            } else {
                System.out.printf("Программист %s >>> Я найду работу получше! [%s - %.2f]\n", name, vacancy.getSpecialization(), vacancy.getSalary());
            }
        }
    }
}
