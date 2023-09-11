package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorID;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;


    public FinancialAdvisor() {}
    public Long getAdvisorID() {
        return advisorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
