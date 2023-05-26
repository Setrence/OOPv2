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

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public String getGraphik() {
        return graphik;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
