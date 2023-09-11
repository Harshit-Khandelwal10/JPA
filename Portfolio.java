package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioID;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;
    public Portfolio() {}


    public Long getPortfolioID() {
        return portfolioID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
