package DZ_Sem_7.observer;

public class Student implements Observer {

    private  String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(JobVacancy vacancy) {
        if (this.salary < vacancy.getSalary()) {
            if (vacancy.getSpecialization().equals("Freelanser")) {
                System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]\n", name, vacancy.getSpecialization(), vacancy.getSalary());
            } else {
                System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]\n", name, vacancy.getSpecialization(), vacancy.getSalary());
            }
        }
    }
}
