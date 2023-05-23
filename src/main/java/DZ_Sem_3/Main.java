package DZ_Sem_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов,
// освоить работу с интерфейсами Comparator, Comparable. - сделано
//
//Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника. - сделано
//Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого).
//Метод должен быть один! - сделано
//Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту?
//Тогда добавьте соответствующее состояние на уровне ваших классов). - сделано
//Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
public class Main {
    private static Random random = new Random();
    static Emloyer generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        ArrayList<Emloyer>types = new ArrayList();

        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        int age = random.nextInt(18, 50);
        types.add(new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * index, age));
        types.add(new Freelanser(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * index, age));
        types.add(new Dispetcher(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * index, age));

        return types.get(random.nextInt(3));
    }
    public static void main(String[] args) {

        Emloyer[] employees = new Emloyer[10];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        for (Emloyer employee : employees){
            System.out.println(employee);
        }

        //Arrays.sort(employees, new NameComparator());
        Arrays.sort(employees, new SalaryComparator());

        System.out.printf("\n*** Отсортированный массив сотрудников ***\n\n");

        for (Emloyer employee : employees){
            System.out.println(employee);
        }

        Arrays.sort(employees, new NameComparator());

        System.out.printf("\n*** Отсортированный массив сотрудников ***\n\n");

        for (Emloyer employee : employees){
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComporator());

        System.out.printf("\n*** Отсортированный массив сотрудников ***\n\n");

        for (Emloyer employee : employees){
            System.out.println(employee);
        }


    }
}
