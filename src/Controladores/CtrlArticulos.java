/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Articulos;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;


/**
 *
 * @author Francisco
 */
public class CtrlArticulos {
    private SessionFactory sf;
    private Session ss;

    public CtrlArticulos() {
        sf=NewHibernateUtil.getSessionFactory();
        ss=sf.openSession();
    }
    public ArrayList getArticulos(){
        List<Articulos> listaArticulos = new ArrayList<>();
        ss=sf.openSession();
        try{
            Criteria p = ss.createCriteria(Articulos.class);
             p.addOrder(Order.asc("referencia"));
            listaArticulos=p.list();
                    
        } catch(HibernateException ex){
            
        }finally{
            ss.close();
        }    
        
        
        return (ArrayList) listaArticulos;
       
    }
     public Articulos getArticuloId(String referencia) {
        Articulos a = null;
        ss = sf.openSession();
        try {
            a = (Articulos) ss.get(Articulos.class, referencia);

        } catch (HibernateException ex) {

        } finally {
            ss.close();
        }
        return a;

    }

    public boolean guardarArticulos(Articulos a) {

        try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.save(a);
            return true;

        } catch (HibernateException ex) {
            return false;
        } finally {
            try {
                ss.getTransaction().commit();
                ss.close();
            } catch (HibernateException ex) {
                return false;
            }
        }

    }

    public boolean actualizarArticulos(Articulos a) {
       try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.update(a);
            return true;

        } catch (HibernateException ex) {
            return false;
        } finally {
            try {
                ss.getTransaction().commit();
                ss.close();
            } catch (HibernateException ex) {
                return false;
            }

        }

    }
    public boolean borrarArticulos(Articulos a) {
       try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.delete(a);
            return true;
        } catch (HibernateException ex) {
            return false;
        } finally {
            try {
                ss.getTransaction().commit();
                ss.close();
            } catch (HibernateException ex) {
                return false;
            }

        }

    }

    
    
}
