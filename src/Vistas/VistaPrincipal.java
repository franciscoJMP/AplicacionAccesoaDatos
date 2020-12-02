package Vistas;

import Controladores.FuncionesArticulos;
import Controladores.FuncionesClientes;
import Controladores.FuncionesFacturas;
import Controladores.FuncionesVista;
import Modelos.Articulos;
import Modelos.Clientes;
import Modelos.EstadisticasClientes;
import Modelos.FacturasCab;
import Modelos.FacturasLin;
import Modelos.FacturasLinId;
import Modelos.FacturasTot;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.sound.midi.MidiDevice;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

//Añadir formato en fechas.
/**
 *
 * @author Francisco
 */
public class VistaPrincipal extends javax.swing.JFrame {

    FuncionesVista fv = new FuncionesVista();
    FuncionesClientes fc = new FuncionesClientes();
    FuncionesArticulos fa = new FuncionesArticulos();
    FuncionesFacturas ff = new FuncionesFacturas();

    ArrayList<Articulos> listaArticulos = new ArrayList<>();
    ArrayList<Clientes> listaClientes = new ArrayList<>();
    ArrayList<FacturasCab> listaFacturasCab = new ArrayList<>();
    ArrayList<EstadisticasClientes> listaEstadisticasClientes = new ArrayList<>();

    public VistaPrincipal() {
        initComponents();
        cargarContenido();
        jd_calcularTotal.setLocationRelativeTo(this);
        jd_borrarLinea.setLocationRelativeTo(this);
        jd_importarFactura.setLocationRelativeTo(this);
        jd_exportarFacturas.setLocationRelativeTo(this);
        jd_consultarCliente.setLocationRelativeTo(this);
        jd_consultarArticulo.setLocationRelativeTo(this);
        jd_importarFactura.setLocationRelativeTo(this);
        jd_consultarFactura.setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_calcularTotal = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        cb_listadoFacturas = new javax.swing.JComboBox<>();
        bt_calcularTotalFacturas = new javax.swing.JButton();
        bt_cancelarCalcularTotal = new javax.swing.JButton();
        jd_borrarLinea = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cb_borrarFactura = new javax.swing.JComboBox<>();
        cb_borrarLineaFactura = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jf_ficheroXML = new javax.swing.JFileChooser();
        jd_exportarFacturas = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        cb_tipoFichero = new javax.swing.JComboBox<>();
        bt_exportarXMLJSON = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jd_consultarCliente = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        tx_consultarCliente = new javax.swing.JTextField();
        bt_consultarCliente = new javax.swing.JButton();
        bt_cancelarConsulta = new javax.swing.JButton();
        jd_consultarArticulo = new javax.swing.JDialog();
        jLabel31 = new javax.swing.JLabel();
        tx_consultarArticulo = new javax.swing.JTextField();
        bt_consultarArticulo = new javax.swing.JButton();
        bt_cancelarConArticulos = new javax.swing.JButton();
        jd_consultarFactura = new javax.swing.JDialog();
        jLabel32 = new javax.swing.JLabel();
        tx_consultarFactura = new javax.swing.JTextField();
        bt_consultarFact = new javax.swing.JButton();
        bt_cancelarFacturaConsulta = new javax.swing.JButton();
        jd_importarFactura = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tx_nuevaFacturaImportar = new javax.swing.JTextField();
        bt_importarNuevaFactura = new javax.swing.JButton();
        bt_cancelarImportar = new javax.swing.JButton();
        cb_clientesFacturasImportar = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        tx_rutaXML = new javax.swing.JTextField();
        bt_buscarXML = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_addCliente = new javax.swing.JButton();
        bt_delCliente = new javax.swing.JButton();
        bt_modCliente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tx_dniCli = new javax.swing.JTextField();
        tx_nombreCli = new javax.swing.JTextField();
        bt_limpiarCli = new javax.swing.JButton();
        bt_consultarClientes = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaEstadisticasClientes = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        bt_calcularEstadisticas = new javax.swing.JButton();
        cb_cliente1Estadisticas = new javax.swing.JComboBox<>();
        cb_cliente2Estadisticas = new javax.swing.JComboBox<>();
        jtf_fechaFin = new javax.swing.JFormattedTextField();
        jtf_fechaInicio = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        bt_addArticulo = new javax.swing.JButton();
        bt_delArticulo = new javax.swing.JButton();
        bt_modArticulo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tx_refArticulo = new javax.swing.JTextField();
        tx_descArticulo = new javax.swing.JTextField();
        tx_precArticulo = new javax.swing.JTextField();
        tx_porIvaArticulo = new javax.swing.JTextField();
        tx_stockArticulo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bt_consultarArt = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        bt_addFacturas = new javax.swing.JButton();
        bt_delFacturas = new javax.swing.JButton();
        bt_modFacturas = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tx_numFac = new javax.swing.JTextField();
        tx_lineaFac = new javax.swing.JTextField();
        tx_cantFacturas = new javax.swing.JTextField();
        cb_articulos = new javax.swing.JComboBox<>();
        tx_precioArticuloFacturas = new javax.swing.JTextField();
        cb_clientes = new javax.swing.JComboBox<>();
        tx_descuentoFactura = new javax.swing.JTextField();
        tx_IvaFacturaArticulos = new javax.swing.JTextField();
        bt_limpiarFacturas = new javax.swing.JButton();
        bt_borrarLineaFactura = new javax.swing.JButton();
        bt_consultarFacturas = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bt_importarXML = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFacturasCab = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaFacturasLin = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaFacturasTotales = new javax.swing.JTable();
        bt_calcularTotal = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        jd_calcularTotal.setTitle("Calcular Total");
        jd_calcularTotal.setModal(true);
        jd_calcularTotal.setSize(new java.awt.Dimension(400, 220));

        jLabel16.setText("Listado de facturas");

        bt_calcularTotalFacturas.setText("Calcular Total");
        bt_calcularTotalFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_calcularTotalFacturasActionPerformed(evt);
            }
        });

        bt_cancelarCalcularTotal.setText("Cancelar");
        bt_cancelarCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarCalcularTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_calcularTotalLayout = new javax.swing.GroupLayout(jd_calcularTotal.getContentPane());
        jd_calcularTotal.getContentPane().setLayout(jd_calcularTotalLayout);
        jd_calcularTotalLayout.setHorizontalGroup(
            jd_calcularTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_calcularTotalLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jd_calcularTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_calcularTotalLayout.createSequentialGroup()
                        .addComponent(bt_calcularTotalFacturas)
                        .addGap(90, 90, 90)
                        .addComponent(bt_cancelarCalcularTotal))
                    .addGroup(jd_calcularTotalLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(46, 46, 46)
                        .addComponent(cb_listadoFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jd_calcularTotalLayout.setVerticalGroup(
            jd_calcularTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_calcularTotalLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jd_calcularTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_listadoFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jd_calcularTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_calcularTotalFacturas)
                    .addComponent(bt_cancelarCalcularTotal))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jd_borrarLinea.setTitle("Borrar Linea Factura");
        jd_borrarLinea.setModal(true);
        jd_borrarLinea.setSize(new java.awt.Dimension(326, 226));

        jLabel17.setText("Facturas");

        jLabel18.setText("Linea de Factura");

        cb_borrarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_borrarFacturaActionPerformed(evt);
            }
        });

        cb_borrarLineaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_borrarLineaFacturaActionPerformed(evt);
            }
        });

        jButton8.setText("Eliminar Linea");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Cancelar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_borrarLineaLayout = new javax.swing.GroupLayout(jd_borrarLinea.getContentPane());
        jd_borrarLinea.getContentPane().setLayout(jd_borrarLineaLayout);
        jd_borrarLineaLayout.setHorizontalGroup(
            jd_borrarLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_borrarLineaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jd_borrarLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_borrarLineaLayout.createSequentialGroup()
                        .addGroup(jd_borrarLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_borrarLineaLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_borrarLineaFactura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jd_borrarLineaLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(58, 58, 58)
                                .addComponent(cb_borrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jd_borrarLineaLayout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(64, 64, 64))))
        );
        jd_borrarLineaLayout.setVerticalGroup(
            jd_borrarLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_borrarLineaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jd_borrarLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_borrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jd_borrarLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_borrarLineaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_borrarLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jf_ficheroXML.setCurrentDirectory(new File("."));

        jd_exportarFacturas.setTitle("Exportar Factura");
        jd_exportarFacturas.setModal(true);
        jd_exportarFacturas.setResizable(false);
        jd_exportarFacturas.setSize(new java.awt.Dimension(392, 157));

        jLabel26.setText("Seleccione el tipo de fichero");

        cb_tipoFichero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XML", "JSON" }));

        bt_exportarXMLJSON.setText("Exportar Factura");
        bt_exportarXMLJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exportarXMLJSONActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_exportarFacturasLayout = new javax.swing.GroupLayout(jd_exportarFacturas.getContentPane());
        jd_exportarFacturas.getContentPane().setLayout(jd_exportarFacturasLayout);
        jd_exportarFacturasLayout.setHorizontalGroup(
            jd_exportarFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_exportarFacturasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel26)
                .addGap(33, 33, 33)
                .addComponent(cb_tipoFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jd_exportarFacturasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_exportarXMLJSON)
                .addGap(37, 37, 37)
                .addComponent(jButton3)
                .addGap(48, 48, 48))
        );
        jd_exportarFacturasLayout.setVerticalGroup(
            jd_exportarFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_exportarFacturasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_exportarFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cb_tipoFichero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jd_exportarFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_exportarXMLJSON)
                    .addComponent(jButton3))
                .addGap(31, 31, 31))
        );

        jd_consultarCliente.setTitle("Consultar Cliente");
        jd_consultarCliente.setModal(true);
        jd_consultarCliente.setResizable(false);
        jd_consultarCliente.setSize(new java.awt.Dimension(323, 165));

        jLabel27.setText("DniCliente");

        bt_consultarCliente.setText("Consultar");
        bt_consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarClienteActionPerformed(evt);
            }
        });

        bt_cancelarConsulta.setText("Cancelar");
        bt_cancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_consultarClienteLayout = new javax.swing.GroupLayout(jd_consultarCliente.getContentPane());
        jd_consultarCliente.getContentPane().setLayout(jd_consultarClienteLayout);
        jd_consultarClienteLayout.setHorizontalGroup(
            jd_consultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_consultarClienteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jd_consultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_consultarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(53, 53, 53)
                        .addComponent(tx_consultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(jd_consultarClienteLayout.createSequentialGroup()
                        .addComponent(bt_consultarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_cancelarConsulta)
                        .addGap(46, 46, 46))))
        );
        jd_consultarClienteLayout.setVerticalGroup(
            jd_consultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_consultarClienteLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jd_consultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tx_consultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jd_consultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_consultarCliente)
                    .addComponent(bt_cancelarConsulta))
                .addGap(19, 19, 19))
        );

        jd_consultarArticulo.setTitle("Consultar Articulo");
        jd_consultarArticulo.setModal(true);
        jd_consultarArticulo.setResizable(false);
        jd_consultarArticulo.setSize(new java.awt.Dimension(323, 165));

        jLabel31.setText("Referencia");

        bt_consultarArticulo.setText("Consultar");
        bt_consultarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarArticuloActionPerformed(evt);
            }
        });

        bt_cancelarConArticulos.setText("Cancelar");
        bt_cancelarConArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarConArticulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_consultarArticuloLayout = new javax.swing.GroupLayout(jd_consultarArticulo.getContentPane());
        jd_consultarArticulo.getContentPane().setLayout(jd_consultarArticuloLayout);
        jd_consultarArticuloLayout.setHorizontalGroup(
            jd_consultarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_consultarArticuloLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jd_consultarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_consultarArticuloLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(53, 53, 53)
                        .addComponent(tx_consultarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(jd_consultarArticuloLayout.createSequentialGroup()
                        .addComponent(bt_consultarArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_cancelarConArticulos)
                        .addGap(46, 46, 46))))
        );
        jd_consultarArticuloLayout.setVerticalGroup(
            jd_consultarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_consultarArticuloLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jd_consultarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tx_consultarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jd_consultarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_consultarArticulo)
                    .addComponent(bt_cancelarConArticulos))
                .addGap(19, 19, 19))
        );

        jd_consultarFactura.setTitle("Consultar Factura");
        jd_consultarFactura.setModal(true);
        jd_consultarFactura.setResizable(false);
        jd_consultarFactura.setSize(new java.awt.Dimension(323, 165));

        jLabel32.setText("NumFactura");

        bt_consultarFact.setText("Consultar");
        bt_consultarFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarFactActionPerformed(evt);
            }
        });

        bt_cancelarFacturaConsulta.setText("Cancelar");
        bt_cancelarFacturaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarFacturaConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_consultarFacturaLayout = new javax.swing.GroupLayout(jd_consultarFactura.getContentPane());
        jd_consultarFactura.getContentPane().setLayout(jd_consultarFacturaLayout);
        jd_consultarFacturaLayout.setHorizontalGroup(
            jd_consultarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_consultarFacturaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jd_consultarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_consultarFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(53, 53, 53)
                        .addComponent(tx_consultarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jd_consultarFacturaLayout.createSequentialGroup()
                        .addComponent(bt_consultarFact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_cancelarFacturaConsulta)
                        .addGap(46, 46, 46))))
        );
        jd_consultarFacturaLayout.setVerticalGroup(
            jd_consultarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_consultarFacturaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jd_consultarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tx_consultarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jd_consultarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_consultarFact)
                    .addComponent(bt_cancelarFacturaConsulta))
                .addGap(19, 19, 19))
        );

        jd_importarFactura.setTitle("Importar Facturas");
        jd_importarFactura.setMinimumSize(new java.awt.Dimension(473, 300));
        jd_importarFactura.setModal(true);
        jd_importarFactura.setSize(new java.awt.Dimension(473, 232));

        jLabel19.setText("Numero de la nueva Factura");

        jLabel20.setText("Cliente");

        bt_importarNuevaFactura.setText("Importar Facturas");
        bt_importarNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_importarNuevaFacturaActionPerformed(evt);
            }
        });

        bt_cancelarImportar.setText("Cancelar");
        bt_cancelarImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarImportarActionPerformed(evt);
            }
        });

        jLabel21.setText("Archivo XML O JSON");

        bt_buscarXML.setText("Buscar");
        bt_buscarXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarXMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_importarFacturaLayout = new javax.swing.GroupLayout(jd_importarFactura.getContentPane());
        jd_importarFactura.getContentPane().setLayout(jd_importarFacturaLayout);
        jd_importarFacturaLayout.setHorizontalGroup(
            jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_importarFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_importarFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_nuevaFacturaImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_importarFacturaLayout.createSequentialGroup()
                        .addGroup(jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addGroup(jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_importarFacturaLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(bt_importarNuevaFactura)
                                .addGap(35, 35, 35)
                                .addComponent(bt_cancelarImportar))
                            .addGroup(jd_importarFacturaLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_importarFacturaLayout.createSequentialGroup()
                                        .addComponent(tx_rutaXML)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_buscarXML))
                                    .addComponent(cb_clientesFacturasImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jd_importarFacturaLayout.setVerticalGroup(
            jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_importarFacturaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tx_nuevaFacturaImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_clientesFacturasImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_rutaXML, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(bt_buscarXML))
                .addGap(18, 18, 18)
                .addGroup(jd_importarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_cancelarImportar)
                    .addComponent(bt_importarNuevaFactura))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tx_rutaXML.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion Final Hibernate");
        setResizable(false);

        bt_addCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_addCliente.setText("Añadir Cliente");
        bt_addCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addClienteActionPerformed(evt);
            }
        });

        bt_delCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_delCliente.setText("Borrar Cliente");
        bt_delCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delClienteActionPerformed(evt);
            }
        });

        bt_modCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_modCliente.setText("Modificar Cliente");
        bt_modCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modClienteActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Quitar Filtro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_addCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_delCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_modCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addCliente)
                    .addComponent(bt_delCliente)
                    .addComponent(bt_modCliente)
                    .addComponent(jButton2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre Cliente");

        bt_limpiarCli.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_limpiarCli.setText("Limpiar");
        bt_limpiarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiarCliActionPerformed(evt);
            }
        });

        bt_consultarClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_consultarClientes.setText("Consultar ");
        bt_consultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bt_limpiarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(bt_consultarClientes))
                    .addComponent(tx_dniCli)
                    .addComponent(tx_nombreCli))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx_dniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tx_nombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpiarCli)
                    .addComponent(bt_consultarClientes))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNICIF", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaEstadisticasClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Año", "Numero Mes", "Nombre Mes", "DNI Cliente", "Nombre Cliente", "Suma Base", "Suma Dtos", "Suma IVA", "Suma Totales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tablaEstadisticasClientes);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel17.setBorder(new TitledBorder(new LineBorder(Color.GRAY), "Datos Clientes Estadisticas"));

        jLabel22.setText("Cliente 1");

        jLabel23.setText("Cliente 2");

        jLabel24.setText("Fecha Inicio");

        jLabel25.setText("Fecha Fin");

        bt_calcularEstadisticas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_calcularEstadisticas.setText("Calcular Estadisticas Clientes");
        bt_calcularEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_calcularEstadisticasActionPerformed(evt);
            }
        });

        jtf_fechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jtf_fechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_calcularEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cb_cliente1Estadisticas, 0, 194, Short.MAX_VALUE)
                                .addComponent(cb_cliente2Estadisticas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtf_fechaFin))
                            .addComponent(jtf_fechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cb_cliente1Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cb_cliente2Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jtf_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jtf_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(bt_calcularEstadisticas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new TitledBorder(new LineBorder(Color.GRAY), "Datos Cliente"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Clientes", jPanel2);

        bt_addArticulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_addArticulo.setText("Añadir Articulo");
        bt_addArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addArticuloActionPerformed(evt);
            }
        });

        bt_delArticulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_delArticulo.setText("Borrar Articulo");
        bt_delArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delArticuloActionPerformed(evt);
            }
        });

        bt_modArticulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_modArticulo.setText("Modificar Articulo");
        bt_modArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modArticuloActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Quitar Filtro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_addArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_delArticulo)
                .addGap(12, 12, 12)
                .addComponent(bt_modArticulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addArticulo)
                    .addComponent(bt_delArticulo)
                    .addComponent(bt_modArticulo)
                    .addComponent(jButton4))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new TitledBorder(new LineBorder(Color.GRAY), "Datos Articulos"));

        jLabel3.setText("Referencia");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Precio");

        jLabel6.setText("Porciva");

        jLabel7.setText("Stock");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt_consultarArt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_consultarArt.setText("Consultar");
        bt_consultarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarArtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(tx_stockArticulo))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_porIvaArticulo)
                            .addComponent(tx_precArticulo)
                            .addComponent(tx_descArticulo)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_consultarArt)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tx_refArticulo)))
                .addGap(56, 56, 56))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tx_refArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tx_descArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tx_precArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tx_porIvaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tx_stockArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(bt_consultarArt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Referencia", "Descripcion", "Precio", "Porciva", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArticulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaArticulos);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Articulos", jPanel3);

        bt_addFacturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_addFacturas.setText("Añadir Facturas");
        bt_addFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addFacturasActionPerformed(evt);
            }
        });

        bt_delFacturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_delFacturas.setText("Borrar Facturas");
        bt_delFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delFacturasActionPerformed(evt);
            }
        });

        bt_modFacturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_modFacturas.setText("Modificar Facturas");
        bt_modFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modFacturasActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("Quitar Filtro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel28.setText("Cabecera ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_addFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_delFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_modFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(312, 312, 312))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addFacturas)
                    .addComponent(bt_delFacturas)
                    .addComponent(bt_modFacturas)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28))
        );

        jPanel12.setBorder(new TitledBorder(new LineBorder(Color.GRAY), "Datos Facturas"));

        jLabel8.setText("NumFac");

        jLabel9.setText("LineaFac");

        jLabel10.setText("Articulo");

        jLabel11.setText("Cantidad");

        jLabel12.setText("Precio");

        jLabel13.setText("Descuento Linea");

        jLabel14.setText("IVA Linea");

        jLabel15.setText("Cliente");

        cb_articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_articulosActionPerformed(evt);
            }
        });

        bt_limpiarFacturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_limpiarFacturas.setText("Limpiar");
        bt_limpiarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiarFacturasActionPerformed(evt);
            }
        });

        bt_borrarLineaFactura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_borrarLineaFactura.setText("Borrar Linea");
        bt_borrarLineaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_borrarLineaFacturaActionPerformed(evt);
            }
        });

        bt_consultarFacturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_consultarFacturas.setText("Consultar");
        bt_consultarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consultarFacturasActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setText("Exportar Factura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        bt_importarXML.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_importarXML.setText("Importar Factura");
        bt_importarXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_importarXMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tx_numFac)
                            .addComponent(tx_lineaFac)
                            .addComponent(tx_cantFacturas)
                            .addComponent(cb_articulos, 0, 185, Short.MAX_VALUE)
                            .addComponent(tx_precioArticuloFacturas)
                            .addComponent(tx_descuentoFactura)
                            .addComponent(tx_IvaFacturaArticulos)
                            .addComponent(cb_clientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bt_importarXML, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addComponent(bt_limpiarFacturas)
                            .addGap(18, 18, 18)
                            .addComponent(bt_borrarLineaFactura)
                            .addGap(18, 18, 18)
                            .addComponent(bt_consultarFacturas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tx_numFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tx_lineaFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tx_cantFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tx_precioArticuloFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tx_descuentoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tx_IvaFacturaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpiarFacturas)
                    .addComponent(bt_borrarLineaFactura)
                    .addComponent(bt_consultarFacturas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(bt_importarXML)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tx_IvaFacturaArticulos.setEditable(false);
        tx_precioArticuloFacturas.setEnabled(false);
        tx_IvaFacturaArticulos.setEditable(false);
        tx_IvaFacturaArticulos.setEnabled(false);

        tablaFacturasCab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMFAC", "FECHAFAC", "DNICIF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFacturasCab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturasCabMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaFacturasCab);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaFacturasLin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numfac", "LineaFac", "Referencia", "Cantidad", "Precio", "DtoLinea", "IvaLinea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFacturasLin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturasLinMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaFacturasLin);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tablaFacturasTotales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NumFac", "BaseImp", "ImpDTO", "ImIva", "TotalFac"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaFacturasTotales);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        bt_calcularTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bt_calcularTotal.setText("Calcular Total");
        bt_calcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_calcularTotalActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setText("Linea Factura");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel30.setText("Total Factura");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30)
                                .addGap(294, 294, 294))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(bt_calcularTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(230, 230, 230))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel29)
                                                .addGap(292, 292, 292)))))))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_calcularTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        jTabbedPane2.addTab("Facturas", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_delArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delArticuloActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaArticulos.getModel();
        String referencia = (String) modelo.getValueAt(tablaArticulos.getSelectedRow(), 0);
        Articulos a = fa.obtenerArticuloId(referencia);
        if (a.getFacturasLins().size() == 0) {
            int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Eliminar el articulo" + a.getDescripcion() + "?", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
            if (opcion == JOptionPane.OK_OPTION) {
                if (fa.borrarArticulo(a)) {
                    JOptionPane.showMessageDialog(rootPane, "Articulo eliminado", "Información", JOptionPane.INFORMATION_MESSAGE);
                    cb_articulos.removeAllItems();
                    cargarContenido();
                    borrarDatosTx();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error al actualizar articulo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "No se puede borrar este articulo porque tiene facturas asociadas", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_bt_delArticuloActionPerformed

    private void bt_addArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addArticuloActionPerformed
        try {
            String referencia, descripcion;
            BigDecimal precio, porciva, stock;
            referencia = tx_refArticulo.getText();
            descripcion = tx_descArticulo.getText();
            precio = new BigDecimal(tx_precArticulo.getText());
            porciva = new BigDecimal(tx_porIvaArticulo.getText());
            stock = new BigDecimal(tx_stockArticulo.getText());
            if (stock.compareTo(new BigDecimal("0")) == 1 && precio.compareTo(new BigDecimal("0")) == 1 && porciva.compareTo(new BigDecimal("0")) == 1) {
                Articulos a = new Articulos(referencia, descripcion, precio, porciva, stock);

                if (fa.guardarArticulos(a)) {
                    JOptionPane.showMessageDialog(rootPane, "Articulo creado", "Información", JOptionPane.INFORMATION_MESSAGE);

                    cargarContenido();
                    borrarDatosTx();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "La descripcion y la referencia no pueden ser iguales a la de otro articulo", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El minimo es 1", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Rellene los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bt_addArticuloActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
        String dniCliente = (String) modelo.getValueAt(tablaClientes.getSelectedRow(), 0);
        Clientes c = fc.obtenerClienteDni(dniCliente);
        if (c != null) {
            tx_dniCli.setText(c.getDnicif());
            tx_nombreCli.setText(c.getNombrecli());
        }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void bt_limpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiarCliActionPerformed
        borrarDatosTx();
    }//GEN-LAST:event_bt_limpiarCliActionPerformed

    private void bt_modClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modClienteActionPerformed
        String dniCli = tx_dniCli.getText();
        String nombString = tx_nombreCli.getText();
        if (!dniCli.equals("") && !nombString.equals("")) {
            Clientes c = new Clientes(dniCli, nombString);
            if (fc.actualizarCliente(c)) {
                JOptionPane.showMessageDialog(rootPane, "Cliente " + c.getNombrecli() + " actualizado", "Información", JOptionPane.INFORMATION_MESSAGE);
                cb_clientes.removeAllItems();
                cargarContenido();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al insertar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Rellen los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_modClienteActionPerformed

    private void bt_delClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delClienteActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
            String dniCliente = (String) modelo.getValueAt(tablaClientes.getSelectedRow(), 0);
            Clientes c = fc.obtenerClienteDni(dniCliente);
            if (c.getFacturasCabs().size() == 0) {
                int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Eliminar al cliente" + c.getNombrecli() + "?", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                fc.borrarEstadisticasClientesId(c);
                if (opcion == JOptionPane.OK_OPTION) {
                    if (fc.borrarCliente(c)) {
                        JOptionPane.showMessageDialog(this, "El cliente " + c.getNombrecli() + "fue borrado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
                        cb_clientes.removeAllItems();
                        cargarContenido();
                        borrarDatosTx();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo borrar al cliente " + c.getNombrecli() + ".", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se puede borrar al cliente porque tiene facturas asociadas", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_delClienteActionPerformed

    private void bt_addClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addClienteActionPerformed
        String dniCli = tx_dniCli.getText();
        String nombString = tx_nombreCli.getText();
        if (!dniCli.equals("") && !nombString.equals("")) {
            Clientes c = new Clientes(dniCli, nombString);
            if (fc.guardaCliente(c)) {
                JOptionPane.showMessageDialog(this, "Cliente guardado con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
                cb_clientes.removeAllItems();
                cargarContenido();

            } else {
                JOptionPane.showMessageDialog(this, "Error el cliente ya existe", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Rellene los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_addClienteActionPerformed

    private void tablaArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArticulosMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tablaArticulos.getModel();
        String referencia = (String) modelo.getValueAt(tablaArticulos.getSelectedRow(), 0);

        Articulos a = fa.obtenerArticuloId(referencia);
        tx_refArticulo.setText(a.getReferencia());
        tx_descArticulo.setText(a.getDescripcion());
        tx_precArticulo.setText(a.getPrecio().toString());
        tx_porIvaArticulo.setText(a.getPorciva().toString());
        tx_stockArticulo.setText(a.getStock().toString());

    }//GEN-LAST:event_tablaArticulosMouseClicked

    private void tablaFacturasCabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturasCabMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tablaFacturasCab.getModel();
        long numFac = (long) modelo.getValueAt(tablaFacturasCab.getSelectedRow(), 0);
        FacturasCab fcb = ff.obtenerFacturasCabId(numFac);
        FacturasTot ft = fcb.getFacturasTot();

        tablaFacturasTotales.setModel(fv.cargarTablaFacturasTot(ft, tablaFacturasTotales));
        tablaFacturasLin.setModel(fv.cargarTablaFacturasLin(fcb.getFacturasLins(), tablaFacturasLin));


    }//GEN-LAST:event_tablaFacturasCabMouseClicked

    private void bt_modArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modArticuloActionPerformed
        try {
            String referencia, descripcion;
            BigDecimal precio, porciva, stock;
            referencia = tx_refArticulo.getText();
            descripcion = tx_descArticulo.getText();
            precio = new BigDecimal(tx_precArticulo.getText());
            porciva = new BigDecimal(tx_porIvaArticulo.getText());
            stock = new BigDecimal(tx_stockArticulo.getText());
            if (stock.compareTo(new BigDecimal("0")) == 1 && precio.compareTo(new BigDecimal("0")) == 1 && porciva.compareTo(new BigDecimal("0")) == 1) {
                Articulos a = new Articulos(referencia, descripcion, precio, porciva, stock);

                if (fa.actualizarArticulos(a)) {
                    JOptionPane.showMessageDialog(this, "Articulo modificado con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
                    cb_articulos.removeAllItems();
                    cargarContenido();
                    borrarDatosTx();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al modificar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El minimo es 1", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una linea. Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bt_modArticuloActionPerformed

    private void bt_addFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addFacturasActionPerformed
        try {
            long numFac, lineaFactura;
            numFac = new Long(tx_numFac.getText());
            lineaFactura = new Long(tx_lineaFac.getText());

            FacturasLinId flid = new FacturasLinId(numFac, lineaFactura);
            FacturasLin flin = new FacturasLin();

            Articulos a = fa.obtenerArticuloId((String) cb_articulos.getSelectedItem());
            BigDecimal cantidad = new BigDecimal(tx_cantFacturas.getText());
            if (cantidad.compareTo(new BigDecimal("0")) == 1) {
                if (a.getStock().compareTo(cantidad) == 1 || a.getStock().compareTo(cantidad) == 0) {
                    a.setStock(a.getStock().subtract(cantidad));
                    fa.actualizarArticulos(a);
                    flin.setId(flid);
                    flin.setArticulos(a);
                    flin.setCantidad(cantidad);
                    flin.setPrecio(new BigDecimal(tx_precioArticuloFacturas.getText()));
                    flin.setDtolinea(new BigDecimal(tx_descuentoFactura.getText()));
                    flin.setIvalinea(new BigDecimal(tx_IvaFacturaArticulos.getText()));
                    boolean guardarFacturasCab = guardarFacturasCab(numFac);
                    boolean guardarFacturasLin = ff.guardarFacturasLin(flin);

                    if (guardarFacturasCab) {
                        if (guardarFacturasLin) {
                            calcularFacturasTotales(flin.getId().getNumfac(), false);
                        }

                    } else {
                        FacturasCab fcb = ff.obtenerFacturasCabId(numFac);
                        calcularFacturasTotales(fcb.getNumfac(), true);
                    }
                    FacturasCab fcb = ff.obtenerFacturasCabId(numFac);
                    tablaFacturasLin.setModel(fv.cargarTablaFacturasLin(fcb.getFacturasLins(), tablaFacturasLin));
                    cargarContenido();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "La cantidad que intenta comprar es superior al stock disponible para ese articulo", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "La cantidad minima es 1", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Error en los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_bt_addFacturasActionPerformed

    private void cb_articulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_articulosActionPerformed

        String referencia = (String) cb_articulos.getSelectedItem();
        if (referencia != null) {
            Articulos a = fa.obtenerArticuloId(referencia);
            tx_precioArticuloFacturas.setText(a.getPrecio().toString());
            tx_IvaFacturaArticulos.setText(a.getPorciva().toString());
        }


    }//GEN-LAST:event_cb_articulosActionPerformed

    private void bt_calcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_calcularTotalActionPerformed
        jd_calcularTotal.setVisible(true);
    }//GEN-LAST:event_bt_calcularTotalActionPerformed

    private void bt_calcularTotalFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_calcularTotalFacturasActionPerformed
        long numeroFactura = Long.parseLong((String) cb_listadoFacturas.getSelectedItem());
        FacturasCab fcb = ff.obtenerFacturasCabId(numeroFactura);
        boolean modificar;
        if (fcb.getFacturasTot() != null) {
            modificar = true;
        } else {
            modificar = false;
        }
        calcularFacturasTotales(numeroFactura, modificar);
    }//GEN-LAST:event_bt_calcularTotalFacturasActionPerformed

    private void tablaFacturasLinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturasLinMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tablaFacturasLin.getModel();
        long numFac = (long) modelo.getValueAt(tablaFacturasLin.getSelectedRow(), 0);
        long lineafac = (long) modelo.getValueAt(tablaFacturasLin.getSelectedRow(), 1);
        FacturasLinId flind = new FacturasLinId(numFac, lineafac);
        FacturasLin flin = ff.obtenerFacturasLinId(flind);
        tx_numFac.setText(String.valueOf(flin.getId().getNumfac()));
        tx_lineaFac.setText(String.valueOf(flin.getId().getLineafac()));
        String referenciaArticulo = flin.getArticulos().getReferencia();
        referenciaArticulo = referenciaArticulo.substring(referenciaArticulo.length() - 1);
        int numArticulo = Integer.parseInt(referenciaArticulo);
        cb_articulos.setSelectedIndex(numArticulo - 1);
        tx_cantFacturas.setText(flin.getCantidad().toString());
        tx_descuentoFactura.setText(flin.getDtolinea().toString());


    }//GEN-LAST:event_tablaFacturasLinMouseClicked

    private void bt_delFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delFacturasActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaFacturasCab.getModel();
            long numFac = (long) modelo.getValueAt(tablaFacturasCab.getSelectedRow(), 0);
            FacturasCab fcb = ff.obtenerFacturasCabId(numFac);
            int opcion = JOptionPane.showConfirmDialog(jd_borrarLinea, "¿Eliminar la factura " + fcb.getNumfac() + "? Tenga en cuenta que esta accion eliminara todas las lineas asocidadas a esta factura", "Eliminar", JOptionPane.INFORMATION_MESSAGE);

            if (opcion == JOptionPane.OK_OPTION) {
                ff.actualizarStockDeLineasAborrar(fcb);
                if (ff.borrarTodasLasFacturas(fcb)) {
                    JOptionPane.showMessageDialog(this, "La factura " + fcb.getNumfac() + " se borro correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    cargarContenido();
                    modelo = (DefaultTableModel) tablaFacturasLin.getModel();
                    modelo.setRowCount(0);
                    tablaFacturasLin.setModel(modelo);
                    modelo = (DefaultTableModel) tablaFacturasTotales.getModel();
                    modelo.setRowCount(0);
                    tablaFacturasTotales.setModel(modelo);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al borrar las facturas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Seleccione una factura de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bt_delFacturasActionPerformed

    private void bt_borrarLineaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_borrarLineaFacturaActionPerformed
        
        jd_borrarLinea.setVisible(true);
    }//GEN-LAST:event_bt_borrarLineaFacturaActionPerformed

    private void cb_borrarLineaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_borrarLineaFacturaActionPerformed

    }//GEN-LAST:event_cb_borrarLineaFacturaActionPerformed

    private void cb_borrarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_borrarFacturaActionPerformed
        try {
            long numFac = Long.parseLong((String) cb_borrarFactura.getSelectedItem());
            FacturasCab fcb = ff.obtenerFacturasCabId(numFac);
            cb_borrarLineaFactura.removeAllItems();
            for (Iterator it = fcb.getFacturasLins().iterator(); it.hasNext();) {
                FacturasLin flin = (FacturasLin) it.next();
                cb_borrarLineaFactura.addItem(String.valueOf(flin.getId().getLineafac()));
            }
        } catch (NumberFormatException e) {

        }

    }//GEN-LAST:event_cb_borrarFacturaActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        jd_borrarLinea.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        long numFac = Long.parseLong((String) cb_borrarFactura.getSelectedItem());
        long lineaFac = Long.parseLong((String) cb_borrarLineaFactura.getSelectedItem());

        FacturasLinId flid = new FacturasLinId(numFac, lineaFac);
        FacturasLin flin = ff.obtenerFacturasLinId(flid);

        int opcion = JOptionPane.showConfirmDialog(jd_borrarLinea, "¿Eliminar la linea" + flin.getId().getLineafac() + " de la factura " + flin.getId().getNumfac() + "?", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
        if (opcion == JOptionPane.OK_OPTION) {
            if (ff.borrarLineaFacturas(flin)) {
                FacturasCab fcb = ff.obtenerFacturasCabId(numFac);
                if (fcb.getFacturasLins().size() > 0) {
                    Articulos a = flin.getArticulos();
                    a.setStock(a.getStock().add(flin.getCantidad()));
                    fa.actualizarArticulos(a);
                    calcularFacturasTotales(flin.getId().getNumfac(), true);
                    fv.cargarTablaFacturasLin(fcb.getFacturasLins(), tablaFacturasLin);
                    fv.cargarTablaFacturasTot(fcb.getFacturasTot(), tablaFacturasTotales);
                } else {
                    ff.borrarFacturasTot(fcb.getFacturasTot());
                    ff.borrarTodasLasFacturas(fcb);
                    DefaultTableModel modelo = (DefaultTableModel) tablaFacturasTotales.getModel();
                    modelo.setRowCount(0);
                    tablaFacturasTotales.setModel(modelo);
                    modelo = (DefaultTableModel) tablaFacturasLin.getModel();
                    modelo.setRowCount(0);
                    tablaFacturasLin.setModel(modelo);

                }

            }

        } else {
            jd_borrarLinea.setVisible(false);
        }
        cb_borrarFactura.removeAllItems();
        cb_borrarLineaFactura.removeAllItems();
        cargarContenido();


    }//GEN-LAST:event_jButton8ActionPerformed

    private void bt_modFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modFacturasActionPerformed
        try {
            long numFac, lineaFactura;
            numFac = new Long(tx_numFac.getText());
            lineaFactura = new Long(tx_lineaFac.getText());

            FacturasLinId flid = new FacturasLinId(numFac, lineaFactura);
            FacturasLin flin = ff.obtenerFacturasLinId(flid);

            Articulos a = fa.obtenerArticuloId((String) cb_articulos.getSelectedItem());
            BigDecimal cantidad = new BigDecimal(tx_cantFacturas.getText());
            if (cantidad.compareTo(new BigDecimal(0)) == 1) {
                if (a.getStock().compareTo(cantidad) == 1 || a.getStock().compareTo(cantidad) == 0) {
                    a.setStock(a.getStock().subtract(cantidad));
                    fa.actualizarArticulos(a);

                    flin.setArticulos(a);
                    flin.setCantidad(cantidad);
                    flin.setPrecio(new BigDecimal(tx_precioArticuloFacturas.getText()));
                    flin.setDtolinea(new BigDecimal(tx_descuentoFactura.getText()));
                    flin.setIvalinea(new BigDecimal(tx_IvaFacturaArticulos.getText()));
                    ff.actualizarFacturasLin(flin);
                    calcularFacturasTotales(flin.getId().getNumfac(), true);
                    cargarContenido();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El Stock del articulo es menor que la cantidad que solicita", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "La cantidad minima es 1", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "No se puede modificar la linea de la factura", "Error", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_bt_modFacturasActionPerformed

    private void bt_cancelarCalcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarCalcularTotalActionPerformed
        jd_calcularTotal.setVisible(false);
    }//GEN-LAST:event_bt_cancelarCalcularTotalActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        jd_exportarFacturas.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void bt_importarXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_importarXMLActionPerformed
       
        jd_importarFactura.setVisible(true);

    }//GEN-LAST:event_bt_importarXMLActionPerformed

    private void bt_buscarXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarXMLActionPerformed
        int seleccionar = jf_ficheroXML.showOpenDialog(jd_importarFactura);
        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            tx_rutaXML.setText(jf_ficheroXML.getSelectedFile().getAbsolutePath());

        }

    }//GEN-LAST:event_bt_buscarXMLActionPerformed

    private void bt_importarNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_importarNuevaFacturaActionPerformed
        try {
            String ruta = jf_ficheroXML.getSelectedFile().getAbsolutePath();            
            String[] auxRuta = ruta.split("\\.");
            String extension = auxRuta[1].toLowerCase().replace(" ", "");
            File fichero = new File(ruta);
            long numFac = Long.parseLong(tx_nuevaFacturaImportar.getText());
            Clientes c = fc.obtenerClienteDni((String) cb_clientesFacturasImportar.getSelectedItem());
            FacturasCab fcb = new FacturasCab();
            fcb.setNumfac(numFac);
            fcb.setClientes(c);
            fcb.setFechafac(new Date());
            switch (extension) {
                case "xml":
                    if (ff.guardarFacturasCab(fcb)) {
                        if (fv.importarDatos(fcb, fichero, this)) {
                            JOptionPane.showMessageDialog(jd_importarFactura, "Se importo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                            jd_importarFactura.setVisible(false);
                            calcularFacturasTotales(fcb.getNumfac(), false);
                        } else {
                            JOptionPane.showMessageDialog(jd_importarFactura, "Error al guardar las lineas", "Error", JOptionPane.ERROR_MESSAGE);
                            jd_importarFactura.setVisible(false);
                            ff.borrarTodasLasFacturas(fcb);
                        }
                    } else {
                        JOptionPane.showMessageDialog(jd_importarFactura, "Error esta factura ya existe", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    cargarContenido();
                    break;
                case "json":
                    if (ff.guardarFacturasCab(fcb)) {
                        if (fv.importarDatosJSON(fcb, fichero, this)) {
                            JOptionPane.showMessageDialog(jd_importarFactura, "Se importo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                            jd_importarFactura.setVisible(false);
                            calcularFacturasTotales(fcb.getNumfac(), false);
                        } else {
                            JOptionPane.showMessageDialog(jd_importarFactura, "Error al guardar las lineas", "Error", JOptionPane.ERROR_MESSAGE);
                            jd_importarFactura.setVisible(false);
                            ff.borrarTodasLasFacturas(fcb);
                        }
                    } else {
                        JOptionPane.showMessageDialog(jd_importarFactura, "Error esta factura ya existe", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    cargarContenido();

                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(jd_importarFactura, "NumFactura erroneo", "Error", JOptionPane.ERROR_MESSAGE);

        } 


    }//GEN-LAST:event_bt_importarNuevaFacturaActionPerformed

    private void bt_cancelarImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarImportarActionPerformed
        jd_importarFactura.setVisible(false);
    }//GEN-LAST:event_bt_cancelarImportarActionPerformed

    private void bt_calcularEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_calcularEstadisticasActionPerformed
        String fecha1, fecha2, dnicif1, dnicif2;
        fecha1 = jtf_fechaInicio.getText();
        fecha2 = jtf_fechaFin.getText();
        dnicif1 = (String) cb_cliente1Estadisticas.getSelectedItem();
        dnicif2 = (String) cb_cliente2Estadisticas.getSelectedItem();
        if (fc.ejecutarProcedimiento(fecha1, fecha2, dnicif1, dnicif2)) {
            DefaultTableModel modelo = fv.cargarTablaEstadisticas(fc.cargarListaEstadisticaClientes(), tablaEstadisticasClientes);
            if (modelo != null) {
                tablaEstadisticasClientes.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Se cargaron las estadisticas de los clientes", "Información", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Error al cargar las estadisticas", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "Error al generar las estadisticas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_calcularEstadisticasActionPerformed

    private void bt_exportarXMLJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exportarXMLJSONActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaFacturasCab.getModel();
            long numFac = (long) modelo.getValueAt(tablaFacturasCab.getSelectedRow(), 0);
            FacturasCab fcb = ff.obtenerFacturasCabId(numFac);
            String opcion = (String) cb_tipoFichero.getSelectedItem();
            opcion = opcion.toLowerCase().replace(" ", "");
            switch (opcion) {
                case "xml":
                    if (fv.exportarXML(fcb)) {
                        JOptionPane.showMessageDialog(rootPane, "Se exporto correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al exportar", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    break;
                case "json":
                    if (fv.exportarJSON(fcb)) {
                        JOptionPane.showMessageDialog(rootPane, "Se exporto correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error al exportar", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                    break;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione una linea", "Error", JOptionPane.ERROR_MESSAGE);

        } finally {
            jd_exportarFacturas.setVisible(false);
        }
    }//GEN-LAST:event_bt_exportarXMLJSONActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jd_exportarFacturas.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt_consultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarClientesActionPerformed
        jd_consultarCliente.dispose();
        jd_consultarCliente.setVisible(true);
    }//GEN-LAST:event_bt_consultarClientesActionPerformed

    private void bt_consultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarClienteActionPerformed
        String dniClinete = tx_consultarCliente.getText();
        Clientes c = fc.obtenerClienteDni(dniClinete);
        if (c != null) {
            ArrayList<Clientes> listaClientes = new ArrayList<>();
            listaClientes.add(c);
            tablaClientes.setModel(fv.cargarTablaClientes(listaClientes, tablaClientes));
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se encontro al cliente", "Error", JOptionPane.ERROR_MESSAGE);

        }

        jd_consultarCliente.dispose();
        jd_consultarCliente.setVisible(false);
    }//GEN-LAST:event_bt_consultarClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarContenido();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        borrarDatosTx();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_consultarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarArticuloActionPerformed
        String referencia = tx_consultarArticulo.getText();
        Articulos a = fa.obtenerArticuloId(referencia);
        if (a != null) {
            ArrayList<Articulos> listaArticulos = new ArrayList<>();
            listaArticulos.add(a);
            tablaArticulos.setModel(fv.cargarTablaArticulos(listaArticulos, tablaArticulos));

        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay articulo con esa referencia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jd_consultarArticulo.setVisible(false);
    }//GEN-LAST:event_bt_consultarArticuloActionPerformed

    private void bt_consultarFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarFactActionPerformed
        try {
            long numFactura = Long.parseLong(tx_consultarFactura.getText());
            FacturasCab fcb = ff.obtenerFacturasCabId(numFactura);
            ArrayList<FacturasCab> listaFacturas = new ArrayList<>();

            if (fcb != null) {
                listaFacturas.add(fcb);
                tablaFacturasCab.setModel(fv.cargarTablaFacturasCab(listaFacturas, tablaFacturasCab));
                tablaFacturasLin.setModel(fv.cargarTablaFacturasLin(fcb.getFacturasLins(), tablaFacturasLin));
                tablaFacturasTotales.setModel(fv.cargarTablaFacturasTot(fcb.getFacturasTot(), tablaFacturasTotales));
                jd_consultarFactura.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error en el numero Factura", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Error en el numero Factura", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bt_consultarFactActionPerformed

    private void bt_consultarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarArtActionPerformed
        
        jd_consultarArticulo.setVisible(true);
    }//GEN-LAST:event_bt_consultarArtActionPerformed

    private void bt_consultarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consultarFacturasActionPerformed
        
        jd_consultarFactura.setVisible(true);
    }//GEN-LAST:event_bt_consultarFacturasActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cargarContenido();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cargarContenido();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_limpiarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiarFacturasActionPerformed
        borrarDatosTx();
    }//GEN-LAST:event_bt_limpiarFacturasActionPerformed

    private void bt_cancelarFacturaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarFacturaConsultaActionPerformed
        jd_consultarFactura.setVisible(false);
    }//GEN-LAST:event_bt_cancelarFacturaConsultaActionPerformed

    private void bt_cancelarConArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarConArticulosActionPerformed
        jd_consultarArticulo.setVisible(false);
    }//GEN-LAST:event_bt_cancelarConArticulosActionPerformed

    private void bt_cancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarConsultaActionPerformed
        jd_consultarCliente.setVisible(false);
    }//GEN-LAST:event_bt_cancelarConsultaActionPerformed

    private void cargarContenido() {
        listaArticulos = fa.cargarListaArticulos();
        listaClientes = fc.cargarListaClientes();
        listaFacturasCab = ff.cargarListaFacturasCab();
        listaEstadisticasClientes = fc.cargarListaEstadisticaClientes();
        tablaArticulos.setModel(fv.cargarTablaArticulos(listaArticulos, tablaArticulos));
        cb_articulos.removeAllItems();
        cb_clientes.removeAllItems();
        cb_cliente1Estadisticas.removeAllItems();
        cb_cliente2Estadisticas.removeAllItems();
        cb_clientesFacturasImportar.removeAllItems();
        cb_listadoFacturas.removeAllItems();
        cb_borrarFactura.removeAllItems();

        for (Iterator it = listaArticulos.iterator(); it.hasNext();) {
            Articulos a = (Articulos) it.next();
            cb_articulos.addItem(a.getReferencia());
        }

        for (Iterator it = listaClientes.iterator(); it.hasNext();) {
            Clientes c = (Clientes) it.next();
            cb_clientes.addItem(c.getDnicif());
            cb_clientesFacturasImportar.addItem(c.getDnicif());
            cb_cliente1Estadisticas.addItem(c.getDnicif());
            cb_cliente2Estadisticas.addItem(c.getDnicif());
        }

        for (Iterator it = listaFacturasCab.iterator(); it.hasNext();) {
            FacturasCab fc = (FacturasCab) it.next();
            cb_listadoFacturas.addItem(String.valueOf(fc.getNumfac()));
        }

        for (Iterator it = listaFacturasCab.iterator(); it.hasNext();) {
            FacturasCab fc = (FacturasCab) it.next();
            if (fc.getFacturasLins().size() > 0) {
                cb_borrarFactura.addItem(String.valueOf(fc.getNumfac()));
            }

        }

        tablaClientes.setModel(fv.cargarTablaClientes(listaClientes, tablaClientes));
        tablaFacturasCab.setModel(fv.cargarTablaFacturasCab(listaFacturasCab, tablaFacturasCab));
        tablaEstadisticasClientes.setModel(fv.cargarTablaEstadisticas(listaEstadisticasClientes, tablaEstadisticasClientes));

    }

    private void borrarDatosTx() {
        tx_dniCli.setText("");
        tx_nombreCli.setText("");
        tx_refArticulo.setText("");
        tx_descArticulo.setText("");
        tx_precArticulo.setText("");
        tx_porIvaArticulo.setText("");
        tx_stockArticulo.setText("");
        tx_IvaFacturaArticulos.setText("");
        tx_cantFacturas.setText("");
        tx_consultarCliente.setText("");
        tx_descuentoFactura.setText("");
        tx_dniCli.setText("");
        tx_lineaFac.setText("");
        tx_nuevaFacturaImportar.setText("");
        tx_numFac.setText("");
        tx_precioArticuloFacturas.setText("");
        tx_rutaXML.setText("");

    }

    private boolean guardarFacturasCab(long numFac) {
        FacturasCab fcb = new FacturasCab();
        String idCliente = (String) cb_clientes.getSelectedItem();
        Clientes c = fc.obtenerClienteDni(idCliente);
        fcb.setClientes(c);
        fcb.setNumfac(numFac);
        fcb.setFechafac(new Date());
        return ff.guardarFacturasCab(fcb);
    }

    private void calcularFacturasTotales(long numeroFactura, boolean modificar) {
        FacturasCab fcb = ff.obtenerFacturasCabId(numeroFactura);
        BigDecimal calculoBaseImp = new BigDecimal("0"), calculoImpDto = new BigDecimal("0"), calculoIva = new BigDecimal("0"), calculoTotal = new BigDecimal("0");
        FacturasTot ftt = new FacturasTot();
        if (fcb.getFacturasLins().size() > 0) {
            for (Iterator it = fcb.getFacturasLins().iterator(); it.hasNext();) {
                FacturasLin flin = (FacturasLin) it.next();
                calculoBaseImp = calculoBaseImp.add(flin.getCantidad().multiply(flin.getPrecio()));
                calculoImpDto = calculoImpDto.add(calculoBaseImp.multiply(flin.getDtolinea()).divide(new BigDecimal("100")));
                calculoIva = calculoIva.add(calculoBaseImp.subtract(calculoImpDto).multiply(flin.getIvalinea()).divide(new BigDecimal("100")));
                calculoTotal = calculoTotal.add(calculoBaseImp.add(calculoIva));

            }

            ftt.setNumfac(numeroFactura);
            ftt.setBaseimp(calculoBaseImp);
            ftt.setImpDto(calculoImpDto);
            ftt.setImpIva(calculoIva);
            ftt.setTotalfac(calculoTotal);
            ftt.setFacturasCab(fcb);

            boolean exito;

            exito = ff.guardarOmodificarFacturasTot(ftt, modificar);

            if (exito) {
                JOptionPane.showMessageDialog(rootPane, "Se genero el total de las lineas de la factura " + fcb.getNumfac(), "Información", JOptionPane.INFORMATION_MESSAGE);
                jd_calcularTotal.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al calcular el total", "Error", JOptionPane.ERROR_MESSAGE);

            }
            cargarContenido();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Esta factura no tiene lineas", "Error", JOptionPane.ERROR_MESSAGE);

        }
        cargarContenido();
        fv.cargarTablaFacturasTot(ftt, tablaFacturasTotales);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addArticulo;
    private javax.swing.JButton bt_addCliente;
    private javax.swing.JButton bt_addFacturas;
    private javax.swing.JButton bt_borrarLineaFactura;
    private javax.swing.JButton bt_buscarXML;
    private javax.swing.JButton bt_calcularEstadisticas;
    private javax.swing.JButton bt_calcularTotal;
    private javax.swing.JButton bt_calcularTotalFacturas;
    private javax.swing.JButton bt_cancelarCalcularTotal;
    private javax.swing.JButton bt_cancelarConArticulos;
    private javax.swing.JButton bt_cancelarConsulta;
    private javax.swing.JButton bt_cancelarFacturaConsulta;
    private javax.swing.JButton bt_cancelarImportar;
    private javax.swing.JButton bt_consultarArt;
    private javax.swing.JButton bt_consultarArticulo;
    private javax.swing.JButton bt_consultarCliente;
    private javax.swing.JButton bt_consultarClientes;
    private javax.swing.JButton bt_consultarFact;
    private javax.swing.JButton bt_consultarFacturas;
    private javax.swing.JButton bt_delArticulo;
    private javax.swing.JButton bt_delCliente;
    private javax.swing.JButton bt_delFacturas;
    private javax.swing.JButton bt_exportarXMLJSON;
    private javax.swing.JButton bt_importarNuevaFactura;
    private javax.swing.JButton bt_importarXML;
    private javax.swing.JButton bt_limpiarCli;
    private javax.swing.JButton bt_limpiarFacturas;
    private javax.swing.JButton bt_modArticulo;
    private javax.swing.JButton bt_modCliente;
    private javax.swing.JButton bt_modFacturas;
    private javax.swing.JComboBox<String> cb_articulos;
    private javax.swing.JComboBox<String> cb_borrarFactura;
    private javax.swing.JComboBox<String> cb_borrarLineaFactura;
    private javax.swing.JComboBox<String> cb_cliente1Estadisticas;
    private javax.swing.JComboBox<String> cb_cliente2Estadisticas;
    private javax.swing.JComboBox<String> cb_clientes;
    private javax.swing.JComboBox<String> cb_clientesFacturasImportar;
    private javax.swing.JComboBox<String> cb_listadoFacturas;
    private javax.swing.JComboBox<String> cb_tipoFichero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JDialog jd_borrarLinea;
    private javax.swing.JDialog jd_calcularTotal;
    private javax.swing.JDialog jd_consultarArticulo;
    private javax.swing.JDialog jd_consultarCliente;
    private javax.swing.JDialog jd_consultarFactura;
    private javax.swing.JDialog jd_exportarFacturas;
    private javax.swing.JDialog jd_importarFactura;
    private javax.swing.JFileChooser jf_ficheroXML;
    private javax.swing.JFormattedTextField jtf_fechaFin;
    private javax.swing.JFormattedTextField jtf_fechaInicio;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaEstadisticasClientes;
    private javax.swing.JTable tablaFacturasCab;
    private javax.swing.JTable tablaFacturasLin;
    private javax.swing.JTable tablaFacturasTotales;
    private javax.swing.JTextField tx_IvaFacturaArticulos;
    private javax.swing.JTextField tx_cantFacturas;
    private javax.swing.JTextField tx_consultarArticulo;
    private javax.swing.JTextField tx_consultarCliente;
    private javax.swing.JTextField tx_consultarFactura;
    private javax.swing.JTextField tx_descArticulo;
    private javax.swing.JTextField tx_descuentoFactura;
    private javax.swing.JTextField tx_dniCli;
    private javax.swing.JTextField tx_lineaFac;
    private javax.swing.JTextField tx_nombreCli;
    private javax.swing.JTextField tx_nuevaFacturaImportar;
    private javax.swing.JTextField tx_numFac;
    private javax.swing.JTextField tx_porIvaArticulo;
    private javax.swing.JTextField tx_precArticulo;
    private javax.swing.JTextField tx_precioArticuloFacturas;
    private javax.swing.JTextField tx_refArticulo;
    private javax.swing.JTextField tx_rutaXML;
    private javax.swing.JTextField tx_stockArticulo;
    // End of variables declaration//GEN-END:variables

}
