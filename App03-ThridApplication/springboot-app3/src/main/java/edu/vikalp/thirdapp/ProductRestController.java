package edu.vikalp.thirdapp;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductRestController {

    @PostMapping("/product")
    public String save(@RequestBody Product product){
        System.out.println(product);
        return "product in database";
    }

    @GetMapping("/product/{pid}")
    public Product getProduct(@PathVariable Integer pid){

        Product p=null;
        if(pid==100) {
             p = new Product(100,"monitor",35000.00);
        }
        else if (pid==101) {
             p = new Product(101, "keyboard", 1500.00);
        }
        else {
             p = new Product(102, "mouse", 700.00);
        }
        return p;
        }

        @GetMapping("/products")
        public List<Product> getProducts(){
          Product  p1 = new Product(100,"monitor",35000.00);
          Product  p2 = new Product(101, "keyboard", 1500.00);
          Product  p3 = new Product(102, "mouse", 700.00);

          return Arrays.asList(p1,p2,p3);
        }


    }

