package DZ_Sem_6.dip;

import java.util.ArrayList;
import java.util.List;

public class Report {

    protected List<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        Print printReport = new PrintReport();
        printReport.output(items);
    }

    public void outputFirst(){
        Print printReport = new PrintFirst();
        printReport.output(items);
    }

    public List<ReportItem> getItems() {
        return items;
    }
}
