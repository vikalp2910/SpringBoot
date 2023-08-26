package edu.vikson.jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
    @Column(name = "stock_keeping_unit", nullable = false)
    private String sku;
    @Column(nullable = false, length = 20)
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageUrl;
    @CreationTimestamp
    private LocalTime dateCreated;
    @UpdateTimestamp
    private LocalTime lastUpdated;

}