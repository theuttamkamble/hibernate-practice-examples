package com.hibernate;

import java.util.ArrayList;
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
        
        // creating Question
        Question question = new Question();
        question.setQuestion("What is Collection?");
        
        // creating answers
        // answer 1
        Answer answer1 = new Answer();
        answer1.setId(44);
        answer1.setAnswer("Collection is framework.");
        answer1.setQuestion(question);
        
     // answer 2
        Answer answer2 = new Answer();
        answer2.setId(45);
        answer2.setAnswer("A Collection represents a single unit of objects, i.e., a group.");
        answer2.setQuestion(question);
        
        List<Answer> answers = new ArrayList<Answer>();
        answers.add(answer1);
        answers.add(answer2);
        
        question.setAnswers(answers);
        
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        session.save(question);
        session.save(answer1);
        session.save(answer2);
        
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
