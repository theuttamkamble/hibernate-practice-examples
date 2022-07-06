package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Answer;
import com.hibernate.entity.Question;

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
        
        
        List<Question> list = session.createQuery("from Question").list();
        list.forEach(question-> {
        	System.out.println(question.getId());
        	System.out.println(question.getQuestion());
        	
        	List<Answer> answerList = question.getAnswers();
        	answerList.forEach(answer-> {
        		System.out.println(answer.getId());
        		System.out.println(answer.getAnswer());
        	});
        	
        	System.out.println("----------------------------");
        	
        });
        
        session.close();
        factory.close();
    }
}
