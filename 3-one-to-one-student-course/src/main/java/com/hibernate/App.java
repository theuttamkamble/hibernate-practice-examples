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
    	Student student = new Student();
    	student.setName("uttam");
    	
    	Course course = new Course();
    	course.setId(101);
    	course.setCourse("java");
    	course.setFee(20000);
    	course.setStudent(student);
    	
    	student.setCourse(course);
    	    	

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        session.save(student);
        session.save(course);
        
        session.getTransaction().commit();        
        session.close();
        factory.close();
    }
}
