package University.bin.studentrelated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Exchange {
    @JsonProperty
    private long id;
    @JsonProperty
    private String procedency;

    public Exchange() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exchange)) return false;
        Exchange exchange = (Exchange) o;
        return getId() == exchange.getId() && Objects.equals(getProcedency(), exchange.getProcedency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProcedency());
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "id=" + id +
                ", procedency='" + procedency + '\'' +
                '}';
    }
}
