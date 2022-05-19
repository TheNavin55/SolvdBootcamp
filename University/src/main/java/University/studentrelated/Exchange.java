package University.studentrelated;

public class Exchange {
    private long id;
    private String procedency;

    public Exchange(long id, String procedency) {
        this.id = id;
        this.procedency = procedency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProcedency() {
        return procedency;
    }

    public void setProcedency(String procedency) {
        this.procedency = procedency;
    }
}
