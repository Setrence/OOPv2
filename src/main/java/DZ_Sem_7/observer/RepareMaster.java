package DZ_Sem_7.observer;

public class RepareMaster implements JobVacancy{

    private String specialization;

    private double salary;

    private String graphik;

    public RepareMaster(String specialization, double salary, String graphik) {
        this.specialization = specialization;
        this.salary = salary;
        this.graphik = graphik;
    }
}
