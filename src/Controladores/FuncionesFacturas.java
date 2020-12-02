/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Articulos;
import Modelos.FacturasCab;
import Modelos.FacturasLin;
import Modelos.FacturasLinId;
import Modelos.FacturasTot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Francisco
 */
public class FuncionesFacturas {

    CtrlFacturasCab ctFacturasCab = new CtrlFacturasCab();
    CtrlFacturasLin ctFacturasLin = new CtrlFacturasLin();
    CtrlFacturasTot ctFacturasTot = new CtrlFacturasTot();
    CtrlArticulos ctArticulos=new CtrlArticulos();

    public ArrayList cargarListaFacturasCab() {
        return ctFacturasCab.getFacturasCab();
    }

    public FacturasCab obtenerFacturasCabId(long numFac) {
        return ctFacturasCab.getFacturasCabId(numFac);
    }

    public boolean guardarFacturasCab(FacturasCab fcb) {
        return ctFacturasCab.guardarFacturasCab(fcb);
    }

    public boolean guardarFacturasLin(FacturasLin flin) {
        return ctFacturasLin.guardarFacturasLin(flin);
    }

    public boolean guardarOmodificarFacturasTot(FacturasTot ftt, boolean modificar) {
        return ctFacturasTot.guardarOModificarFacturasTot(ftt, modificar);
    }

    public FacturasLin obtenerFacturasLinId(FacturasLinId flid) {
        return ctFacturasLin.getFacturasLinId(flid);
    }

    public boolean borrarLineaFacturas(FacturasLin flin) {
        return ctFacturasLin.borrarFacturasLin(flin);
    }

    public boolean borrarFacturasTot(FacturasTot ftt) {
        return ctFacturasTot.borrarFacturaTot(ftt);
    }

    public boolean actualizarFacturasLin(FacturasLin flin) {
        return ctFacturasLin.actualizarFacturasLin(flin);
    }

    public boolean borrarTodasLasFacturas(FacturasCab fcb) {
        boolean exito = false;
        Set listaFacturasLinea = fcb.getFacturasLins();       

        for (Iterator it = listaFacturasLinea.iterator(); it.hasNext();) {
            FacturasLin flin = (FacturasLin) it.next();
            ctFacturasLin.borrarFacturasLin(flin);

        }

        exito = ctFacturasCab.borrarFacturasCab(fcb);

        return exito;
    }

    public void actualizarStockDeLineasAborrar(FacturasCab fcb) {
        for(Iterator it = fcb.getFacturasLins().iterator();it.hasNext();){
            FacturasLin flin = (FacturasLin) it.next();
            Articulos a = flin.getArticulos();
            a.setStock(a.getStock().add(flin.getCantidad()));
            ctArticulos.actualizarArticulos(a);
        }
    }

}
