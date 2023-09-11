package entities;

import javax.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityID;

    private String name;
    private String category;
    private String purchaseDate;
    private double purchasePrice;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioID")
    private Portfolio portfolio;

    // Constructors, getters, and setters
    // Constructor
    public Security() {}

    // Getters and setters
    public Long getSecurityID() {
        return securityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
