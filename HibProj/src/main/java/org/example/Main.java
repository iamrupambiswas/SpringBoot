package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("Rupam Biswas");
        s1.setRollNo(112);
        s1.setAge(20);

        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        session.save(s1);

        System.out.println(s1 );
    }
}