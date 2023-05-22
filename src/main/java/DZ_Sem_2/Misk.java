package DZ_Sem_2;

public class Misk implements CatEatting {
    private int food;

    public Misk (int food){
        this.food = food;
    }

    @Override
    public int getAppetite() {
        return 0;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public void setFood(int food) {
        this.food = food;
    }

    public void MiskInfo() {
        System.out.println("plate: " + food);
    }

    public void Dobavka (int food){
        this.food = food + 20;
        System.out.println("Добавили 20 единиц в миску! ");
    }

}
