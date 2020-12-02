/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.FacturasTot;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Francisco
 */
public class CtrlFacturasTot {

    private SessionFactory sf;
    private Session ss;

    public CtrlFacturasTot() {
        sf = NewHibernateUtil.getSessionFactory();
        ss = sf.openSession();
    }

    public boolean guardarOModificarFacturasTot(FacturasTot ftt,boolean modificar) {

        try {
            ss = sf.openSession();
            ss.beginTransaction();
            if(modificar){
                ss.saveOrUpdate(ftt);
            } else{
                ss.save(ftt);
            }
            
            return true;

        } catch (HibernateException ex) {
            System.out.println(ex);
            return false;

        } finally {
            try {
                ss.getTransaction().commit();
                ss.close();
            } catch (HibernateException ex) {
                System.out.println(ex);
                return false;
            }
        }

    }   

    boolean borrarFacturaTot(FacturasTot ftt) {
        try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.delete(ftt);
            return true;

        } catch (HibernateException ex) {
            System.out.println(ex);
            return false;

        } finally {
            try {
                ss.getTransaction().commit();
                ss.close();
            } catch (HibernateException ex) {
                System.out.println(ex);
                return false;
            }
        }
    }

}
