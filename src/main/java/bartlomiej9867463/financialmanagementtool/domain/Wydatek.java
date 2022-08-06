package bartlomiej9867463.financialmanagementtool.domain;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
public class Wydatek implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Double amount;
    private String description;
    private String type;
    private LocalDate data;
    public Wydatek(String description, String type, LocalDate data, Double amount) {
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.data = data;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Wydatek{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}

