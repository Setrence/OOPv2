package DZ_Sem_3;




public abstract class Emloyer{
    protected String name;
    protected String surname;
    protected int salary;
    protected int age;

    public Emloyer() {
    }

    public Emloyer(String name, String surname, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public abstract String toString();

}