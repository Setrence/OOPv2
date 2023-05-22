package DZ_Sem_2;

public class Cat implements CatEatting {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void eat(String name, int appetite) {
        if (appetite != 0){
            System.out.printf("%s голоден на %d единиц \n", name, appetite);
        }
    }

    @Override
    public int getAppetite() {
        return appetite;
    }

    @Override
    public int getFood() {
        return 0;
    }

    @Override
    public void setFood(int food) {
    }
}
