package org.example;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

    public static void main(String[] args) {
        Configuration cf=new Configuration();
        cf.configure("hibernate.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        Products prod1=(Products) se.load(Products.class,100);
        System.out.println(prod1.getProduct_id()+" "+prod1.getProduct_name()+" "+prod1.getPrice());
        se.close();
        Session se2=sf.openSession();
        Products prod2=(Products) se2.load(Products.class,100);
        System.out.println(prod2.getProduct_id()+" "+prod2.getProduct_name()+" "+prod2.getPrice());
        se2.close();
		/*Transaction tx=se.beginTransaction();

		Products p2=new Products();
		p2.setProduct_id(100);
		p2.setProduct_name("mobile");
		p2.setPrice(25000);
		se.save(p2);
		tx.commit();
		se.close();
		*/
        /*Query q=se.createQuery("from Products p ");
        List<Products> l=q.list();
        Iterator<Products> i=l.iterator();
        while(i.hasNext())
        {
            Products p=i.next();
            System.out.println(p.getProduct_id()+" "+p.getProduct_name()+" "+p.getPrice());
        }

        Query q2=se2.createQuery("from Products p2 ");
        List<Products> l2=q2.list();
        Iterator<Products> i2=l2.iterator();
        while(i2.hasNext())
        {
            Products p2=i2.next();
            System.out.println(p2.getProduct_id()+" "+p2.getProduct_name()+" "+p2.getPrice());
        }

         */

    }

}
//As we can see here, hibernate does not fire query twice. If you don't use second level cache, hibernate will fire query twice because both query uses different session objects.
