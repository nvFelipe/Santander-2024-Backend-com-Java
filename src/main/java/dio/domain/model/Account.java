package dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable = true)
    private String number;


    private String agency;

    @Column(precision = 2, scale = 13)
    private float balance;


    @Column(name = "additional_limit", precision = 2, scale = 13)
    private float limit;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public float getBalance() {
        return balance;
    }

    public float getLimit() {
        return limit;
    }
}
