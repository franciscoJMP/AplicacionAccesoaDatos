
package Controladores;

import Controladores.CtrlArticulos;
import Modelos.Articulos;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class FuncionesArticulos {

    CtrlArticulos ctArticulos = new CtrlArticulos();

    public ArrayList cargarListaArticulos() {
        return ctArticulos.getArticulos();
    }
     public boolean guardarArticulos(Articulos a) {
        return ctArticulos.guardarArticulos(a);
    }

    public Articulos obtenerArticuloId(String referencia) {
        return ctArticulos.getArticuloId(referencia);
    }

    public boolean borrarArticulo(Articulos a) {
       return ctArticulos.borrarArticulos(a);
    }

    public boolean actualizarArticulos(Articulos a) {
        return ctArticulos.actualizarArticulos(a);
    }

}
