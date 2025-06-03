package com.biswas.SpringBootDemo.service;

import com.biswas.SpringBootDemo.LaptopRepository;
import com.biswas.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository laptopRepository;

    public void addLaptop(Laptop lap) {
        laptopRepository.save(lap);
    }

    public boolean isGoodForProg(Laptop laptop) {
        return true;
    }

}
