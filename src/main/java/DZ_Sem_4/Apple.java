package DZ_Sem_4;

public class Apple extends Fruit{


    public Apple(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return String.format("Одно яблоко весом %.2f", getWeight());
    }

}
