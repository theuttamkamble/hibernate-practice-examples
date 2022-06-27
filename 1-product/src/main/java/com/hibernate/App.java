package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Product p1 = new Product(10, "mobile phones", true);
        Product p2 = new Product(20, "sony camera", true);
        Product p3 = new Product(30, "asus laptops", false);
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        session.save(p1);
        session.save(p2);
        session.save(p3);
        
        session.getTransaction().commit();
        
        session.close();
        factory.close();
        
    }
}
