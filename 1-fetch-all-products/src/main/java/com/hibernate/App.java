package com.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
//      List<Product> list = session.createQuery("from Product").list();
//      list.forEach(p-> {
//      	System.out.println(p);
//      });
        
        // Above code same as
        Query<Product> query = session.createQuery("from Product");
        List<Product> list = query.list();
        Iterator<Product> itr = list.iterator();
        while(itr.hasNext()) {
        	Product p = (Product) itr.next();
        	System.out.println(p);
        }
        
        session.close();
        factory.close();
    }
}
