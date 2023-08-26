package edu.vikson.jpa.repository;

import edu.vikson.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;

public interface ProductRepository extends JpaRepository<Product,Long> {


    public List <Product> findByDescription(String desc);


    @Query("from Product")
    List<Product> getAllProducts();

    @Query("select p from Product p where p.name=:n ")
    List<Product> getAllProductsByName(@Param("n") String name);

    @Query(value = "select * from products" , nativeQuery = true)
    List<Product> getAllProductsSql();

    @Query("select u from #{#entityName} u ")
    List<Product> findByEntity();



}
