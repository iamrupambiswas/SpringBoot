package com.biswas.SpringBootDemo;

import com.biswas.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in database....");
    }
}
