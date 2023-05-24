package DZ_Sem_4;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    T fruet;
    ArrayList<T> list = new ArrayList<>();
    int quanitity;

    double weight;

    public Box(T fruet){
        this.fruet = fruet;
    }

    public T getFruet() {
        return fruet;
    }

    public int getQuanitity() {
        return quanitity;
    }

    public void addFruet(int quantity, String word) {
            for (int i = 0; i < quantity; i++) {
                list.add(fruet);
            }
            this.quanitity = list.size();
            System.out.printf("Вы добавили %s в коробку, теперь количество %s в коробке равно - %d\n",word, word, quanitity);
    }


    public void getWeight(double weight, String word){
        this.weight = quanitity * weight;
        System.out.printf("Вес коробки с %s равен: %.2f\n", word, weight);
    }

    public void compare(double weigh){
        if (weight == weigh){
            System.out.println("Коробки по весу равны");
        }else{
            System.out.println("Коробки по весу неравны");
        }
    }

    public void pourFruites(Box to, int quanitity){
      if (this.fruet == to.fruet){
          if (this.quanitity >= quanitity){
              for (int i = 0; i < quanitity; i++) {
                  to.list.add(fruet);
                  this.list.remove(fruet);
                  this.quanitity = list.size();
              }
              System.out.printf("Остаток текущей коробки %s, стало в отгружаемой коробке %s\n", this.quanitity, to.getQuanitity());
          }else {
              System.out.println("Фрукты в коробках различаются!");
          }
      }else{
          System.out.println("Фрукты в коробках различаются!");
      }
    }
}

