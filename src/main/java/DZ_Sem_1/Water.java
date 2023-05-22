package DZ_Sem_1;

public class Water extends Product{
    private double litr;

    public double getLitr(){
        return litr;
    }

    public Water(String name, String brand, double litr, int price){
        super(name, brand, price);
        this.litr = litr;
    }

    @Override
    String displayInfo() {
        return String.format("%s - %s - %s - %d", name, brand, litr, price);
    }
}
