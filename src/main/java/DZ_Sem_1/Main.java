package DZ_Sem_1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Product product_2 = new Chocolate("Шоколад", "Милка", "Молочный", 120);
        System.out.println(product_2.displayInfo());

        Product product_3 = new Water("Святой", "Источник", 1.5, 60);
        System.out.println(product_3.displayInfo());

        Product product_4 = new Milk("Молоко", "Вологда", 1, 100);
        System.out.println(product_4.displayInfo());

        Product product_5 = new Energy("Адреналин", "Раш", 0.5, 120);
        System.out.println(product_5.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product_2);
        products.add(product_3);
        products.add(product_4);
        products.add(product_5);

        VendingMachine machine = new VendingMachine(products);

        Chocolate ChocloateRes = machine.getChocolate("Шоколад", "Милка");
        if (ChocloateRes != null){
            System.out.println("Вы купили шоколадку:");
            System.out.println(ChocloateRes.displayInfo());
        }

        Water WaterRes = machine.getWater("Святой", "Источник", 1.5);
        if (WaterRes != null){
            System.out.println("Вы купили воду:");
            System.out.println(WaterRes.displayInfo());
        }

        Energy EnergyRes = machine.getEnergy("Адреналин", "Раш");
        if (EnergyRes != null){
            System.out.println("Вы купили Энергетик:");
            System.out.println(EnergyRes.displayInfo());
        }

        Milk MilkRes = machine.getMilk("Молоко", "Вологда", 1);
        if (MilkRes != null){
            System.out.println("Вы купили молоко:");
            System.out.println(MilkRes.displayInfo());
        }


    }
}