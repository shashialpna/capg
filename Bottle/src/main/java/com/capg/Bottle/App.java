package com.capg.Bottle;

import javax.presistence.Entity;
import javax.presistence.Id;
import javax.presistence.Table;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "start project...." );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student st=new Student();
        st.setId(101);
        st.setName("sohan");
        st.setCity("Delhi");
        System.out.println(st);
        
        Session session=factory.openSession();
        
        Transaction tx=session.beginTranscation();
        session.save(st);
        tx.commit();
        session.close();
        
    }
}
