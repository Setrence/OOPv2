package DZ_Sem_3;

import java.util.Comparator;

public class AgeComporator implements Comparator<Emloyer> {
    @Override
    public int compare(Emloyer o1, Emloyer o2) {
        return Double.compare(o1.age, o2.age);
    }
}
