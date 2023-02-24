package oneToOne;


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
      
    	StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure("oneToOne/hibernate.cfg3.xml").build();
    	
    	Metadata metadata=new MetadataSources(serviceRegistry).getMetadataBuilder().build();
    	
    	SessionFactory factory=metadata.getSessionFactoryBuilder().build();
    	
    	Session session=factory.openSession();
    	
    	
    	Transaction transaction=session.beginTransaction();
    	
    	Student student=new Student(123,"Raman","v",76456546,"raman@gmail.com");
    	Address address=new Address(234, "abc street", "kolkata", "WB", "INDIA", 713213);
    	
    	student.setAddress(address);
    	address.setStudent(student);
    	
    	session.save(student);
    	session.save(address);
    	
    	
    
    	transaction.commit();
    	session.close();
    	factory.close();
    	
    	
    	
    	
    	
    	
    	
    }
}
