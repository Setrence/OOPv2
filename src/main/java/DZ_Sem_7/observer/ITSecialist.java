package DZ_Sem_7.observer;

public class ITSecialist implements JobVacancy{

    private String specialization;

    private double salary;

    private String graphik;

    public ITSecialist(String specialization, double salary, String graphik) {
        this.specialization = specialization;
        this.salary = salary;
        this.graphik = graphik;
    }
}
