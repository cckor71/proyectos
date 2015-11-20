/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Customer;
import pojo.MiHibernateUtil;

/**
 *
 * @author formacion
 */
public class CustomerDAO {
    
    private final Session session;
    
    public CustomerDAO(){
        SessionFactory sessionFac = MiHibernateUtil.getSessionFactory();
        session = sessionFac.openSession();
    }
    
    public List<Customer>findAll(){
        Transaction trans = this.session.beginTransaction();
        try{
            Query query = this.session.createQuery("from Customer");
            List list = query.list();
            trans.commit();
            return list;
        }catch(Exception e){
            trans.rollback();
            throw e;
        }
    }
    
    public Customer findById( String id){
        return null;
    }
}
