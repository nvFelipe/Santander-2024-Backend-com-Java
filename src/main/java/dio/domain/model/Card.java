package dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 13, scale = 2)
    private String number;
    private BigDecimal limit;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public String getNumber() {
        return number;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getLimit() {
        return limit;
    }
}
