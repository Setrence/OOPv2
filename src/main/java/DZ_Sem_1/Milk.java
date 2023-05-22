package DZ_Sem_1;

public class Milk extends Product{
    private double litr;

    public double getLitr(){
        return litr;
    }

    public Milk(String name, String brand, double litr, int price){
        super(name, brand, price);
        this.litr = litr;
    }

    @Override
    String displayInfo() {
        return String.format("%s - %s - %s - %d", name, brand, litr, price);
    }
}
