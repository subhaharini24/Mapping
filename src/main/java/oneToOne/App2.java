package oneToOne;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App2 {

	public static void main(String[] args) {
		
		
		StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg3.xml").build();
    	
    	Metadata metadata=new MetadataSources(serviceRegistry).getMetadataBuilder().build();
    	
    	SessionFactory factory=metadata.getSessionFactoryBuilder().build();
    	
    	Session session=factory.openSession();
    	
    	
    	Transaction transaction=session.beginTransaction();
    	
 
//    	Car car=new Car(111, "WB-40c-6363", "Blue", "xyz", "abc" );
//    	Driver driver=new Driver(123, "A.Raman", "Kolkata", 3757757);
//    	
//    	car.setDriver(driver);
//    	driver.setCar(car);
    	
    	Car car1=new Car(112, "BW-40-6463", "White","mno", "def" );
    	Driver driver1=new Driver(456, "subhash", "coimbatore", 65746483);
    	
    	car1.setDriver(driver1);
    	driver1.setCar(car1);
    	
//    	session.save(car);
//    	session.save(driver);
    	
    	session.save(car1);
    	session.save(driver1);
    	
    	transaction.commit();
    	
    	session.close();
    	factory.close();
    	

	}

}

