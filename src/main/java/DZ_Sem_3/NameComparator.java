package DZ_Sem_3;

import java.util.Comparator;

public class NameComparator implements Comparator<Emloyer> {
    @Override
    public int compare(Emloyer o1, Emloyer o2) {
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        int res = o1.name.compareTo(o2.name);
        return res;
    }
}

