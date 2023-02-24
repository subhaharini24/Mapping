package org.hql.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App2 {

    public static void main(String[] args) {
        
        
        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata metadata=new MetadataSources(serviceRegistry).getMetadataBuilder().build();
        
        SessionFactory factory=metadata.getSessionFactoryBuilder().build();
        
        Session session=factory.openSession();
        
        
        Transaction transaction=session.beginTransaction();
        
        Driver driver=new Driver(1234, "A.Das", "Mumbai", 83838383);
        Car car=new Car(111, "WB-C40-0903", "red", "xyz", "abc", driver);
        
        
        session.save(driver);
        session.save(car);
        
        
        transaction.commit();
        
        session.close();
        factory.close();
        

    }

}
