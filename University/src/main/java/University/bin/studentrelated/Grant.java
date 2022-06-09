package University.bin.studentrelated;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Grant {
    @JsonProperty
    private long id;
    @JsonProperty
    private int balance;

    public Grant() {
    }

    public Grant(long id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grant)) return false;
        Grant grant = (Grant) o;
        return getId() == grant.getId() && getBalance() == grant.getBalance();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBalance());
    }

    @Override
    public String toString() {
        return "Grant{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
