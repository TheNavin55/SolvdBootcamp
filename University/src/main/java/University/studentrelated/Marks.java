package University.studentrelated;

public class Marks {
    private long id;
    private String mark;

    public Marks(long id, String mark) {
        this.id = id;
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
