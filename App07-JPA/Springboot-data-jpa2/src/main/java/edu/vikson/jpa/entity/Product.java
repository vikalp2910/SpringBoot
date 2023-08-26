package edu.vikson.jpa.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
@Table(
        name = "products",
        schema = "vikalpdb",
        uniqueConstraints = {
          @UniqueConstraint(
                  name = "sku_unique",
                  columnNames = "stock_keeping_unit"
          ),
          @UniqueConstraint(
                  name = "name_unique",
                  columnNames = "name"
          )
        }
      )
public class Product {

    @Id
    @GeneratedValue(
                      strategy = GenerationType.SEQUENCE,
                      generator = "product_generator"
                   )
    @SequenceGenerator(
             name = "product_generator",
             sequenceName = "product_sequence_id",
             allocationSize = 1
    )

    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "stock_keeping_unit" ,nullable = false)
    private String sku;
    @Column(nullable = false ,length = 20)
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageUrl;
    private LocalTime dateCreated;
    private LocalTime lastUpdated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

