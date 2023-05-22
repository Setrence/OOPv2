package DZ_Sem_1;

public class Chocolate extends Product{

    private String type;

    public Chocolate(String name, String brand, String type, int price){
        super(name, brand, price);
        this.type = type;
    }

    @Override
    String displayInfo() {
        return String.format("%s - %s - %s - %d", name, type, brand, price);
    }
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
