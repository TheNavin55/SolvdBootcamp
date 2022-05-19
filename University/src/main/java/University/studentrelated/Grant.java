package University.studentrelated;

public class Grant {
    private long id;
    private int percentage;

    public Grant(long id, int percentage) {
        this.id = id;
        this.percentage = percentage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
