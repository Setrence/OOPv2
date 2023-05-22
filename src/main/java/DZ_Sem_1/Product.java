package DZ_Sem_1;

public class Product {
    protected String name;
    protected String brand;
    protected int price;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public Product(){
        this("Товар");
    }

    public Product(String name){
        this(name, 10);
    }

    public Product(String name, int price){
        this(name, "ООО", price);
    }

    public Product(String name, String brand, int price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }




    /**
     * Получить информацию об  объекте
     * @return информация об объекте
     */
    String displayInfo(){
        return String.format("%s - %s - %d", brand, name, price);
    }

}
