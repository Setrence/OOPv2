package DZ_Sem_4;

public class Orange extends Fruit{

    public Orange(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return String.format("Один апельсин весом %.2f", getWeight());
    }
}
