package oneToMany;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
      
    	StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure("oneToMany/hibernate.cfg3.xml").build();
    	
    	Metadata metadata=new MetadataSources(serviceRegistry).getMetadataBuilder().build();
    	
    	SessionFactory factory=metadata.getSessionFactoryBuilder().build();
    	
    	Session session=factory.openSession();
    	
    	
    	Transaction transaction=session.beginTransaction();
    	
    	
    	Instructor instructor=new Instructor("Raman","Arora","raman@gmail.com");
    	
    	Course course1=new Course("Java Programming");
    	Course course2=new Course("Python Programming");
    	
    	List<Course> courses=new ArrayList<>();
    	courses.add(course1);
    	courses.add(course2);
    	
    	instructor.setCourses(courses);
    	
    	
    	session.save(course1);
    	session.save(course2);
    	
    	session.save(instructor);
    
    	
    	
    
    	transaction.commit();
    	
    	session.close();
    	factory.close();
    	
    	
    	
    	
    }
}

