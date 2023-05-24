package DZ_Sem_4;

abstract public class Fruit {
    private final double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return String.format("Один фрукт весом %.2f", weight);
    }
}
