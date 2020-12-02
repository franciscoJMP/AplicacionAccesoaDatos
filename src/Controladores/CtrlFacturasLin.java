
package Controladores;

import Modelos.FacturasLin;
import Modelos.FacturasLinId;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CtrlFacturasLin {

    private SessionFactory sf;
    private Session ss;

    public CtrlFacturasLin() {
        sf = NewHibernateUtil.getSessionFactory();
        ss = sf.openSession();
    }

    public FacturasLin getFacturasLinId(FacturasLinId flid) {
        FacturasLin flin = null;
        ss = sf.openSession();
        try {
            flin = (FacturasLin) ss.get(FacturasLin.class, flid);

        } catch (HibernateException ex) {

        } finally {
            ss.close();
        }
        return flin;

    }

    public boolean guardarFacturasLin(FacturasLin flin) {

        try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.save(flin);
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

    public boolean borrarFacturasLin(FacturasLin flin) {

        try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.delete(flin);
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

    boolean actualizarFacturasLin(FacturasLin flin) {
        try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.update(flin);
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
