package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Course;
import com.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        Student student = session.get(Student.class, 2);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getCourse().getId());
        System.out.println(student.getCourse().getCourse());
        System.out.println(student.getCourse().getFee());
        
        session.close();
        factory.close();
    }
}
