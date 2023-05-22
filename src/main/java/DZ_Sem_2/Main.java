package DZ_Sem_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 15);
        Cat cat2 = new Cat("Sima", 10);
        Cat cat3 = new Cat("Kima", 12);
        Cat cat4 = new Cat("Pers", 50);
        Cat cat5 = new Cat("Botik", 14);
        Cat cat6 = new Cat("Nikon", 13);
        Cat cat7 = new Cat("Lemon", 14);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);

        Misk misk = new Misk(100);

        for (Cat cat : cats) {
            if (cat.getAppetite() != 0) {
                misk.MiskInfo();
                if (misk.getFood() >= cat.getAppetite()) {
                    cat.eat(cat.getName(), cat.getAppetite());
                    misk.setFood(misk.getFood() - cat.getAppetite());
                    System.out.printf("%s наелся и сыт! ", cat.getName());
                } else {
                    System.out.printf("Для %s не хватило еды в миске! ", cat.getName());
                }
            }
        }
    }
}
