package University.studentrelated;

import java.time.LocalDate;

public class Exam {
    private long id;
    private LocalDate date;
    private boolean approved = true;

    public Exam(long id, LocalDate date, boolean approved) {
        this.id = id;
        this.date = date;
        this.approved = approved;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
