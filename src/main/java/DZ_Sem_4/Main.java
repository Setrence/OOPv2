package DZ_Sem_4;


import DZ_Sem_3.Emloyer;

import java.util.ArrayList;

//a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//        поэтому в одну коробку нельзя сложить и яблоки, и апельсины; - готово
//        c. Для хранения фруктов внутри коробки можно использовать ArrayList; - готово
//        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
//        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны); - готово
//        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
//        подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//        Можно сравнивать коробки с яблоками и апельсинами; - готово
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
//        которые были в первой; - готово
//        g. Не забываем про метод добавления фрукта в коробку. - готово
public class Main {
    public static void main(String[] args) {

        Apple apple1 = new Apple(1.5);
        Orange orange1 = new Orange(2);

        Box appleBox = new Box(apple1);
        appleBox.addFruet(10, "яблок");
        Box orangeBox = new Box(orange1);
        appleBox.addFruet(40, "яблок");
        orangeBox.addFruet(71, "апельсинов");
        appleBox.getWeight(apple1.getWeight(), "яблоками");
        orangeBox.getWeight(orange1.getWeight(), "апельсинами");
        Box appleBox2 = new Box(apple1);
        appleBox2.addFruet(40, "яблок");

        appleBox2.pourFruites(appleBox, 30);

        appleBox.compare(orangeBox.weight);










    }
}
