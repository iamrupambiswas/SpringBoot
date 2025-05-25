package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name = "alien_table")
public class Alien {

    @Id
    private int aid;

//    @Column(name = "alien_name")
    private String name;

//    @Transient
    private String tech;
    @OneToMany
    private List<Laptop> laptops;



    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
