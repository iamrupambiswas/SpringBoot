package com.biswas.SpringBootDemo.repository;

import com.biswas.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in database....");
    }
}
