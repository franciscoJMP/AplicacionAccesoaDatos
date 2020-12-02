/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Clientes;
import Modelos.EstadisticasClientes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Francisco
 */
public class CtrlEstadisticasClientes {

    /*PARTE JDBC*/
    private Connection conexion;
    private Statement st;
    private boolean resultado;

    public boolean conectarServidor() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            resultado = true;
        } catch (ClassNotFoundException ex) {
            resultado = false;
        }
        return resultado;
    }

    public boolean conectarBD() {
        try {
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AD_TEMA_03_FACTURAS", "AD_TEMA_03_FACTURAS");
            resultado = true;
        } catch (SQLException ex) {
            resultado = false;
        }
        return resultado;
    }

    public void close() {
        try {
            if (st != null) {
                st.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {

        }
    }

    public boolean ejecutarProcedimiento(String fecha1, String fecha2, String dnicif1, String dnicif2) {
        resultado = conectarBD();
        try {
            if (resultado) {
                CallableStatement cst = conexion.prepareCall("{call SP_ESTADISTICAS (?,?,?,?)}");
                java.sql.Date fecha1SQL = devolverFechaSQL(fecha1);
                java.sql.Date fecha2SQL = devolverFechaSQL(fecha2);
                if (fecha1SQL != null && fecha2SQL != null) {
                    if (fecha1SQL.compareTo(fecha2SQL) > 0) {
                        cst.setDate(3, fecha2SQL);
                        cst.setDate(4, fecha1SQL);
                        
                    } else {
                        cst.setDate(3, fecha1SQL);
                        cst.setDate(4, fecha2SQL);
                    }                    

                    cst.setString(1, dnicif1);
                    cst.setString(2, dnicif2);
                    resultado = cst.execute();
                    if (!resultado) {
                        resultado = true;
                    } else {
                        resultado = false;
                    }

                } else {
                    resultado = false;
                }
            }

        } catch (SQLException ex) {
            resultado = false;
        }
        close();

        return resultado;
    }

    private java.sql.Date devolverFechaSQL(String fecha1) {
        java.sql.Date dateSQL = java.sql.Date.valueOf(convertirFecha(fecha1));;
        return dateSQL;

    }

    private String convertirFecha(String fecha1) {
        String[] fechaAux = fecha1.split("/");
        fecha1 = fechaAux[2] + "-" + fechaAux[1] + "-" + fechaAux[0];
        return fecha1;

    }

    /*PARTE DE HIBERNATE*/
    private SessionFactory sf;
    private Session ss;

    public CtrlEstadisticasClientes() {
        sf = NewHibernateUtil.getSessionFactory();
        ss = sf.openSession();
    }

    public ArrayList getEstadisticasCliente() {
        List listaEstadisticasCliente = new ArrayList<>();
        ss = sf.openSession();
        try {
            Criteria p = ss.createCriteria(EstadisticasClientes.class);
            listaEstadisticasCliente = p.list();

        } catch (HibernateException ex) {

        } finally {
            ss.close();
        }

        return (ArrayList) listaEstadisticasCliente;

    }
    public boolean borrarEstadisticasIDCliente(Clientes c){
        resultado = false;
        try{
            ss=sf.openSession();
            String hql="delete from EstadisticasClientes where DNICIF = :ID";
            Query consulta = ss.createQuery(hql);
            consulta.setParameter("ID", c.getDnicif());
            int estado=consulta.executeUpdate();
            if(estado==0){
                resultado=true;
            }
        }catch(HibernateException e){
            resultado=false;
        } finally{
            ss.close();
        }
        return resultado;
    }

}
