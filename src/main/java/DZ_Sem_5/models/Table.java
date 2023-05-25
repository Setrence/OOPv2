package DZ_Sem_5.models;


import java.util.Collection;

public class Table {


    private static int counter;

    private final int no;

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }


    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }

}

