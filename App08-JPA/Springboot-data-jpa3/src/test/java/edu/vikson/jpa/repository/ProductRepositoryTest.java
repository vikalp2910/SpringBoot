package edu.vikson.jpa.repository;


import edu.vikson.jpa.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void saveMtd() {
        Product product = new Product();
        product.setName("product1");
        product.setDescription("product1 Desc");
        product.setSku("1000qty");
        product.setPrice(new BigDecimal(1000));
        product.setActive(true);
        product.setImageUrl("product1.png");

        Product result = productRepository.save(product);
        System.out.println(result.getId());
        System.out.println(result);
    }

    @Test
    void updateUsingSaveMtd() {
        //find by entity by id
        Long id = 1L;
        Product product = productRepository.findById(id).get();

        //update entity information
        product.setDescription("updateProduct1desc");

        //save again entity information
        productRepository.save(product);
    }

    @Test
    void findByIdMtd() {
        Long id = 1L;
        Product product = productRepository.findById(id).get();
    }

    @Test
    void saveAllMtd() {
        Product product2 = new Product();
        product2.setName("product2");
        product2.setDescription("product2 Desc");
        product2.setSku("2000qty");
        product2.setPrice(new BigDecimal(2000));
        product2.setActive(true);
        product2.setImageUrl("product2.png");

        Product product3 = new Product();
        product3.setName("product3");
        product3.setDescription("product3 Desc");
        product3.setSku("3000qty");
        product3.setPrice(new BigDecimal(3000));
        product3.setActive(true);
        product3.setImageUrl("product3.png");

        List result = productRepository.saveAll(List.of(product2, product3));
        System.out.println("++++result+++++++++");
        System.out.println(result);
    }

    @Test
    void findAllMtd() {
        List<Product> result = productRepository.findAll();
        result.forEach(p -> System.out.println(p.getName()));
        System.out.println("=======DATA=========");
        System.out.println(result);
    }

    @Test
    void deleteByIdMtd() {
        Long id = 3L;
        productRepository.deleteById(id);
    }

    @Test
    void deleteMtd() {
        Long id = 2L;
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
    }

    @Test
    void deleteAllMtd() {
        productRepository.deleteAll();
    }

    @Test
    void deleteAllIterableMtd() {
        var product1 = productRepository.findById(6L).get();
        var product2 = productRepository.findById(7L).get();
        productRepository.deleteAll(List.of(product1, product2));
    }

    @Test
    void countMtd() {
        Long count = productRepository.count();
        System.out.println(count);
    }

    @Test
    void existByIdMtd() {
        Boolean flag = productRepository.existsById(9L);
        System.out.println(flag);
    }

    @Test
    void findByPriceMtd(){
        List<Product> products=productRepository.findByDescription("product3 Desc");
        products.forEach(p-> System.out.println(p));
    }

    @Test
    void getAllProductsMtd(){
        List <Product> products=productRepository.getAllProducts();
        System.out.println(products);
    }

    @Test
    void getAllProductsByNameMtd(){
        List <Product> products=productRepository.getAllProductsByName("product3");
        System.out.println(products);
    }

    @Test
    void getAllProductsSqlMtd(){
        List <Product> products=productRepository.getAllProductsSql();
        System.out.println(products);
    }

    @Test
    void findByEntityMtd(){
        List <Product> products=productRepository.findByEntity();
        System.out.println(products);
    }

}