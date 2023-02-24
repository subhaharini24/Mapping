package org.hql.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();

		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		SessionFactory factory = metadata.getSessionFactoryBuilder().build();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

//		while (true) {
//			System.out.println("Enter book id:");
//			long bookId = Integer.parseInt(br.readLine());
//
//			System.out.println("Enter book Name:");
//			String name = br.readLine();
//
//			System.out.println("Enter book author name:");
//			String author = br.readLine();
//
//			System.out.println("Enter book price:");
//			double price = Double.parseDouble(br.readLine());
//
//			session.persist(new Book(bookId, name, author, price));
//
//			System.out.println("Do you want to continue?(Y/N)");
//			String response = br.readLine();
//
//			if (response.equals("N") || response.equals("n")) {
//				break;
//			}
//
//		}

		// select * from book
		Query<Book> query = session.createQuery("from Book");
		List<Book> booklist = query.getResultList();

		for (Book b : booklist) {
			System.out.println(b);
		}

		System.out.println(booklist.get(0));

		// Criteria bases queries - Criteria API

		System.out.println("Price greater than 700");
		Criteria criteria = session.createCriteria(Book.class);
		criteria.add(Restrictions.ge("price", new Double(500)));
		booklist = criteria.list();
		for (Book b : booklist) {
			System.out.println(b);
		}

//maximum price of the book

		query = session.createQuery("select max(price) from Book");
		booklist = query.getResultList();
		System.out.println(booklist.get(0));

		// minimum price of the book

		query = session.createQuery("select min(price) from Book");
		booklist = query.getResultList();
		System.out.println(booklist.get(0));
		

		//Sorting records
    	System.out.println("sorted records");
    	query=session.createQuery("from Book order by price desc");
    	booklist=query.getResultList();
    	for(Book b:booklist)
    	{
    		System.out.println(b);
    	}
    	
    	//between hql query
    	System.out.println("between hql query");
    	criteria=session.createCriteria(Book.class);
    	criteria.add(Restrictions.between("price", new Double(800), new Double(1100)));
    	booklist=criteria.list();
    	for(Book b:booklist)
    	{
    		System.out.println(b);
    	}

    	
    	//Sql queries in hibernate
    	System.out.println("SQL queries:");
    	NativeQuery<Book> nquery=session.createSQLQuery("select avg(price) from bookinfo");
    	List<Book> result= nquery.getResultList();
    	System.out.println(result.get(0));
    	
    	//like hql query
    	query=session.createQuery("from Book where author like '%r' ");
    	booklist=query.getResultList();
    	for(Book b:booklist)
    	{
    		System.out.println(b);
    	}
		transaction.commit();
		session.close();
		factory.close();
		
		

	}
}
