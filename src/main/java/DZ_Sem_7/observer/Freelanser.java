package DZ_Sem_7.observer;

public class Freelanser implements JobVacancy{
    private String specialization;

    private double salary;

    private String graphik;

    public Freelanser(String specialization, double salary, String graphik) {
        this.specialization = specialization;
        this.salary = salary;
        this.graphik = graphik;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public String getGraphik() {
        return graphik;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
