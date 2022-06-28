package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person person = new Person();
        person.setName("uttam");
        
        Address add = new Address();
        add.setPin(112);
        add.setCity("kolhapur");
        
        person.setAddress(add);
        
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        session.save(person);
        
        session.getTransaction().commit();
        session.close();
        factory.close();
        
    }
}
