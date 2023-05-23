package DZ_Sem_3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emloyer> {

    @Override
    public int compare(Emloyer o1, Emloyer o2) {
        return Double.compare(o2.salary, o1.salary);
    }
}
