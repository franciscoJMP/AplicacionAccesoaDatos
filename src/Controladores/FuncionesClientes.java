
package Controladores;

import Controladores.CtrlClientes;
import Controladores.CtrlEstadisticasClientes;
import Modelos.Clientes;
import Modelos.EstadisticasClientes;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class FuncionesClientes {
    CtrlClientes ctClientes=new CtrlClientes();
    CtrlEstadisticasClientes ctEstadisticasClientes=new CtrlEstadisticasClientes();
    
    public ArrayList<Clientes> cargarListaClientes() {
       return ctClientes.getClientes();
    }
    public ArrayList<EstadisticasClientes> cargarListaEstadisticaClientes() {
       return ctEstadisticasClientes.getEstadisticasCliente();
    }
    public Clientes obtenerClienteDni(String dniCliente) {
        return ctClientes.getClienteId(dniCliente);
    }

    public boolean guardaCliente(Clientes c) {
        return ctClientes.guardarCliente(c);
    }

    public boolean actualizarCliente(Clientes c) {
       return ctClientes.actualizarClientes(c);
    }
    public boolean borrarCliente(Clientes c){
        return ctClientes.borrarClientes(c);
    }
    public boolean ejecutarProcedimiento(String fecha1, String fecha2, String dnicif1, String dnicif2){
        return ctEstadisticasClientes.ejecutarProcedimiento(fecha1, fecha2, dnicif1, dnicif2);
    }
    public boolean borrarEstadisticasClientesId(Clientes c){
        return ctEstadisticasClientes.borrarEstadisticasIDCliente(c);
    }
    
    
}
