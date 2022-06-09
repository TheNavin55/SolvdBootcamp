package University.bin.studentrelated;

public class Mark {
    private long id;
    private Integer mark;

    public Mark(long id, Integer mark) {
        this.id = id;
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
