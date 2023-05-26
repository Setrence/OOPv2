package DZ_Sem_6.dip;

public class ReportItem {

    protected String description;
    protected float amount;

    public ReportItem(String description, float amount) {
        this.description = description;
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
