package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    private String name;
    private String address;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "advisorID")
    private FinancialAdvisor advisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;
    public Client() {}

    public Long getClientID() {
        return clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
