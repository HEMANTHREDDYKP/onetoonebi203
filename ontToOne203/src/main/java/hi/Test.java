package hi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Company c=new Company();
		c.setLocation("HYd");
		c.setName("dell");
		
		Gst g=new Gst();
		g.setGstNo("89HTV5V76");
		g.setType("Pvt Ltd");
		g.setCompany(c);
		c.setGst(g);
		
		et.begin();
		em.persist(g);
		em.persist(c);
		et.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
