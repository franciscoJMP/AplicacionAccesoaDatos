package Controladores;

import Modelos.FacturasCab;
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
public class CtrlFacturasCab {

    private SessionFactory sf;
    private Session ss;

    public CtrlFacturasCab() {
        sf = NewHibernateUtil.getSessionFactory();
        ss = sf.openSession();
    }

    public ArrayList getFacturasCab() {
        List listaFacturasCab = new ArrayList<>();
        ss = sf.openSession();
        try {
            Criteria p = ss.createCriteria(FacturasCab.class);
            p.addOrder(Order.asc("numfac"));
            listaFacturasCab = p.list();

        } catch (HibernateException ex) {

        } finally {
            ss.close();
        }

        return (ArrayList) listaFacturasCab;

    }

    public FacturasCab getFacturasCabId(long numFac) {
        FacturasCab fcb = null;
        ss = sf.openSession();
        try {
            fcb = (FacturasCab) ss.get(FacturasCab.class, numFac);
        } catch (HibernateException ex) {
            fcb = null;
        } finally {
            ss.close();
        }
        return fcb;

    }

    public boolean guardarFacturasCab(FacturasCab fcb) {

        try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.save(fcb);
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

    boolean borrarFacturasCab(FacturasCab fcb) {
        try {
            ss = sf.openSession();
            ss.beginTransaction();
            ss.delete(fcb);
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
