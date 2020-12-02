/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Clientes;
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
public class CtrlClientes {

    private SessionFactory sf;
    private Session ss;

    public CtrlClientes() {
        sf = NewHibernateUtil.getSessionFactory();
        ss = sf.openSession();
    }

    public ArrayList getClientes() {
        List<Clientes> listaClientes = new ArrayList<>();
        ss = sf.openSession();
        try {
            Criteria p = ss.createCriteria(Clientes.class);
            p.addOrder(Order.asc("dnicif"));
            listaClientes = p.list();

        } catch (HibernateException ex) {
            System.out.println(ex);
        } finally {
            ss.close();
        }

        return (ArrayList) listaClientes;
    }

    public Clientes getClienteId(String dniCliente) {
        Clientes c = null;
        ss = sf.openSession();
        try {
            c = (Clientes) ss.get(Clientes.class, dniCliente);

        } catch (HibernateException ex) {

        } finally {
            ss.close();
        }
        return c;

    }

    public boolean guardarCliente(Clientes c) {

        try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.save(c);
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

    public boolean actualizarClientes(Clientes c) {
       try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.update(c);
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
    public boolean borrarClientes(Clientes c) {
       try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.delete(c);
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
