/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Articulos;
import Modelos.Clientes;
import Modelos.EstadisticasClientes;
import Modelos.EstadisticasClientesId;
import Modelos.FacturasCab;
import Modelos.FacturasLin;
import Modelos.FacturasLinId;
import Modelos.FacturasTot;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author Francisco
 */
public class FuncionesVista {

    FuncionesArticulos fa = new FuncionesArticulos();
    FuncionesFacturas ff = new FuncionesFacturas();
    FuncionesClientes fc = new FuncionesClientes();

    public DefaultTableModel cargarTablaArticulos(ArrayList<Articulos> listaArticulos, JTable tablaArticulos) {
        DefaultTableModel modelo = (DefaultTableModel) tablaArticulos.getModel();
        modelo.setRowCount(0);
        for (Iterator it = listaArticulos.iterator(); it.hasNext();) {
            Articulos a = (Articulos) it.next();
            modelo.addRow(new Object[]{a.getReferencia(), a.getDescripcion(), a.getPrecio(), a.getPorciva(), a.getStock()});
        }
        return modelo;
    }

    public DefaultTableModel cargarTablaClientes(ArrayList<Clientes> listaClientes, JTable tablaClientes) {
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
        modelo.setRowCount(0);
        for (Iterator it = listaClientes.iterator(); it.hasNext();) {
            Clientes c = (Clientes) it.next();
            modelo.addRow(new Object[]{c.getDnicif(), c.getNombrecli()});
        }
        return modelo;
    }

    public DefaultTableModel cargarTablaFacturasCab(ArrayList<FacturasCab> listaFacturasCab, JTable tablaFacturasCab) {
        DefaultTableModel modelo = (DefaultTableModel) tablaFacturasCab.getModel();
        modelo.setRowCount(0);
        for (Iterator it = listaFacturasCab.iterator(); it.hasNext();) {
            FacturasCab fcb = (FacturasCab) it.next();
            modelo.addRow(new Object[]{fcb.getNumfac(), fcb.getFechaFormateada(), fcb.getClientes().getDnicif()});
        }
        return modelo;
    }

    public DefaultTableModel cargarTablaFacturasLin(Set facturasLins, JTable tablaFacturasLin) {
        DefaultTableModel modelo = (DefaultTableModel) tablaFacturasLin.getModel();
        List listaFacturasLinOrdenada = new ArrayList(facturasLins);
        listaFacturasLinOrdenada.sort(FacturasLin.ordenarLineaFactura);
        modelo.setRowCount(0);
        for (Iterator it = listaFacturasLinOrdenada.iterator(); it.hasNext();) {
            FacturasLin fcl = (FacturasLin) it.next();
            modelo.addRow(new Object[]{fcl.getId().getNumfac(), fcl.getId().getLineafac(), fcl.getArticulos().getReferencia(), fcl.getCantidad(), fcl.getPrecio(), fcl.getDtolinea(), fcl.getIvalinea()});
        }
        return modelo;
    }

    public DefaultTableModel cargarTablaFacturasTot(FacturasTot ft, JTable tablaFacturasTotales) {
        DefaultTableModel modelo = (DefaultTableModel) tablaFacturasTotales.getModel();
        modelo.setRowCount(0);
        if (ft != null) {
            modelo.addRow(new Object[]{ft.getNumfac(), ft.getBaseimp(), ft.getImpDto(), ft.getImpIva(), ft.getTotalfac()});
        }
        return modelo;

    }

    public boolean exportarXML(FacturasCab fcb) {
        boolean exito = false;
        String aux = fcb.getNumfac() + ".xml";

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Facturas", null);
            document.setXmlVersion("1.0");
            Element raiz = document.getDocumentElement();
            Element nodoCliente = document.createElement("Cliente");

            Element nodoNumFac = document.createElement("numFactura");
            Text textoNumFac = document.createTextNode(String.valueOf(fcb.getNumfac()));
            nodoNumFac.appendChild(textoNumFac);

            Element nodoDniCif = document.createElement("dniCif");
            Text textoDniCif = document.createTextNode(fcb.getClientes().getDnicif());
            nodoDniCif.appendChild(textoDniCif);

            Element nodoNombreCli = document.createElement("nombreCliente");
            Text textoNombreCli = document.createTextNode(fcb.getClientes().getNombrecli());
            nodoNombreCli.appendChild(textoNombreCli);

            Element nodoFecha = document.createElement("fecha");
            Text textoFecha = document.createTextNode(fcb.getFechaFormateada());
            nodoFecha.appendChild(textoFecha);

            nodoCliente.appendChild(nodoNumFac);
            nodoCliente.appendChild(nodoDniCif);
            nodoCliente.appendChild(nodoNombreCli);
            nodoCliente.appendChild(nodoFecha);
            raiz.appendChild(nodoCliente);
            List listaLineasOrdenada = new ArrayList(fcb.getFacturasLins());
            listaLineasOrdenada.sort(FacturasLin.ordenarLineaFactura);

            for (Iterator it = listaLineasOrdenada.iterator(); it.hasNext();) {
                FacturasLin flin = (FacturasLin) it.next();
                Element nodoLineaFacturas = document.createElement("LineasFacturas");

                Element nodoNumLinea = document.createElement("lineaFactura");
                Text textoNumLinea = document.createTextNode(String.valueOf(flin.getId().getLineafac()));
                nodoNumLinea.appendChild(textoNumLinea);

                Element nodoReferencia = document.createElement("referencia");
                Text textoReferencia = document.createTextNode(flin.getArticulos().getReferencia());
                nodoReferencia.appendChild(textoReferencia);

                Element nodoDescripcion = document.createElement("descripcion");
                Text textoDescripcion = document.createTextNode(flin.getArticulos().getDescripcion());
                nodoDescripcion.appendChild(textoDescripcion);

                Element nodoPrecio = document.createElement("precio");
                Text textoPrecio = document.createTextNode(flin.getPrecio().toString());
                nodoPrecio.appendChild(textoPrecio);

                Element nodoDescuentoLinea = document.createElement("descuentoLinea");
                Text textoDescuentoLinea = document.createTextNode(flin.getDtolinea().toString());
                nodoDescuentoLinea.appendChild(textoDescuentoLinea);

                Element nodoIvaLinea = document.createElement("ivaLinea");
                Text textonodoIvaLinea = document.createTextNode(flin.getIvalinea().toString());
                nodoIvaLinea.appendChild(textonodoIvaLinea);

                Element nodoCantidad = document.createElement("cantidad");
                Text textoCantidad = document.createTextNode(flin.getCantidad().toString());
                nodoCantidad.appendChild(textoCantidad);

                Element nodoSubTotal = document.createElement("subtotal");
                Text textoSubTotal = document.createTextNode(flin.calcularSubtotal().toString());
                nodoSubTotal.appendChild(textoSubTotal);
                nodoLineaFacturas.appendChild(nodoNumLinea);
                nodoLineaFacturas.appendChild(nodoReferencia);
                nodoLineaFacturas.appendChild(nodoDescripcion);
                nodoLineaFacturas.appendChild(nodoPrecio);
                nodoLineaFacturas.appendChild(nodoDescuentoLinea);
                nodoLineaFacturas.appendChild(nodoIvaLinea);
                nodoLineaFacturas.appendChild(nodoCantidad);
                nodoLineaFacturas.appendChild(nodoSubTotal);
                raiz.appendChild(nodoLineaFacturas);

            }
            Element nodoFacturasTotal = document.createElement("FacturaTotal");

            Element numeroFactura = document.createElement("numeroFactura");
            Text textoNumeroFactura = document.createTextNode(String.valueOf(fcb.getNumfac()));
            numeroFactura.appendChild(textoNumeroFactura);

            Element totalFactura = document.createElement("total");
            Text textoTotalFactura = document.createTextNode(fcb.getFacturasTot().getTotalfac().toString());
            totalFactura.appendChild(textoTotalFactura);
            nodoFacturasTotal.appendChild(numeroFactura);
            nodoFacturasTotal.appendChild(totalFactura);
            raiz.appendChild(nodoFacturasTotal);
            Source source = new DOMSource(document);
            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File(aux)); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            exito = true;

        } catch (ParserConfigurationException ex) {
            exito = false;
        } catch (TransformerConfigurationException ex) {
            exito = false;
        } catch (TransformerException ex) {
            exito = false;
        }
        return exito;

    }

    public Document leerXML(File fichero) {

        DocumentBuilder db;
        Document doc = null;
        try {
            db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            doc = db.parse(fichero);
        } catch (ParserConfigurationException ex) {

        } catch (SAXException ex) {

        } catch (IOException ex) {

        }
        return doc;

    }

    public boolean importarDatos(FacturasCab fcb, File fichero, Component component) {
        boolean exito = false;
        boolean noInsertadas = false;
        Document ficheroXML = leerXML(fichero);
        long numFac = fcb.getNumfac(), lineaFactura;
        Articulos a = new Articulos();
        BigDecimal cantidad = null, precio = null, dtolinea = null, ivalinea = null;
        if (ficheroXML != null) {
            try {
                Element nodoRaiz = ficheroXML.getDocumentElement();
                if (nodoRaiz.getNodeName() == "Facturas") {
                    NodeList nodosListaFacturas = nodoRaiz.getElementsByTagName("LineasFacturas");
                    if (nodosListaFacturas.getLength() > 0) {
                        for (int i = 0; i < nodosListaFacturas.getLength(); i++) {
                            Element e = (Element) nodosListaFacturas.item(i);
                            FacturasLin flin = new FacturasLin();
                            FacturasLinId flind = new FacturasLinId();
                            lineaFactura = Long.parseLong(e.getElementsByTagName("lineaFactura").item(0).getChildNodes().item(0).getNodeValue());
                            flind.setNumfac(numFac);
                            flind.setLineafac(lineaFactura);
                            a = fa.obtenerArticuloId(e.getElementsByTagName("referencia").item(0).getChildNodes().item(0).getNodeValue());
                            cantidad = new BigDecimal(e.getElementsByTagName("cantidad").item(0).getChildNodes().item(0).getNodeValue());
                            precio = new BigDecimal(e.getElementsByTagName("precio").item(0).getChildNodes().item(0).getNodeValue());
                            dtolinea = new BigDecimal(e.getElementsByTagName("descuentoLinea").item(0).getChildNodes().item(0).getNodeValue());
                            ivalinea = new BigDecimal(e.getElementsByTagName("ivaLinea").item(0).getChildNodes().item(0).getNodeValue());

                            flin.setId(flind);
                            flin.setFacturasCab(fcb);
                            flin.setArticulos(a);
                            flin.setPrecio(precio);
                            flin.setCantidad(cantidad);
                            flin.setDtolinea(dtolinea);
                            flin.setIvalinea(ivalinea);

                            if (a.getStock().compareTo(cantidad) == 1) {
                                exito = ff.guardarFacturasLin(flin);
                                a.setStock(a.getStock().subtract(cantidad));
                                fa.actualizarArticulos(a);
                            } else {
                                noInsertadas = true;
                            }

                        }
                    }
                }

                if (noInsertadas) {
                    JOptionPane.showMessageDialog(component, "Algunas lineas excedian el stock, no se añadieron", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (DOMException e) {
                exito = false;
            } catch (NumberFormatException e) {
                exito = false;
            }
        }
        return exito;
    }

    public DefaultTableModel cargarTablaEstadisticas(ArrayList<EstadisticasClientes> listaEstadisticaClientes, JTable tablaEstadisticasClientes) {
        DefaultTableModel modelo = (DefaultTableModel) tablaEstadisticasClientes.getModel();
        modelo.setRowCount(0);
        if (listaEstadisticaClientes.size() > 0) {
            for (Iterator it = listaEstadisticaClientes.iterator(); it.hasNext();) {
                EstadisticasClientes edc = (EstadisticasClientes) it.next();
                EstadisticasClientesId edcId = edc.getId();
                modelo.addRow(new Object[]{edcId.getAnio(),
                    edcId.getMesNum(),
                    edc.getMesNom(),
                    edcId.getDnicif(),
                    edc.getNombrecli(),
                    edc.getSumaBase(),
                    edc.getSumaDtos(),
                    edc.getSumaIva(),
                    edc.getSumaTotales()
                });
            }
        } else {
            modelo = null;
        }

        return modelo;
    }

    public boolean exportarJSON(FacturasCab fcb) {
        FileWriter fw = null;
        boolean exito = false;
        BufferedWriter bf = null;
        try {

            String nombreFichero = fcb.getNumfac() + ".json";
            File ficheroJson = new File(nombreFichero);

            if (!ficheroJson.exists()) {
                ficheroJson.createNewFile();
            }

            fw = new FileWriter(ficheroJson);
            bf = new BufferedWriter(fw);
            bf.write("{\n");
            bf.write("  \"Facturas\": {\n");
            bf.write("\t\"Cliente\": {\n");
            bf.write(" \t\"numFactura\": ");
            bf.write('"' + String.valueOf(fcb.getNumfac()) + '"' + "," + "\n");
            bf.write(" \t\"dniCif\": ");
            bf.write('"' + fcb.getClientes().getDnicif() + '"' + "," + "\n");
            bf.write(" \t\"nombreCliente\": ");
            bf.write('"' + fcb.getClientes().getNombrecli() + '"' + "," + "\n");
            bf.write(" \t\"Fecha\": ");
            bf.write('"' + fcb.getFechaFormateada() + '"' + "\n");
            bf.write(" },\n");
            bf.write("  \t\"LineasFacturas\": [\n");
            int i = 0;
            for (Iterator it = fcb.getFacturasLins().iterator(); it.hasNext();) {

                FacturasLin flin = (FacturasLin) it.next();
                bf.write(" \t{\n");
                bf.write(" \t\"lineaFactura\": ");
                bf.write('"' + String.valueOf(flin.getId().getLineafac()) + '"' + "," + "\n");
                bf.write(" \t\"referencia\": ");
                bf.write('"' + flin.getArticulos().getReferencia() + '"' + "," + "\n");
                bf.write(" \t\"descripcion\": ");
                bf.write('"' + flin.getArticulos().getDescripcion() + '"' + "," + "\n");
                bf.write(" \t\"precio\": ");
                bf.write('"' + flin.getArticulos().getPrecio().toString() + '"' + "," + "\n");
                bf.write(" \t\"descuentoLinea\": ");
                bf.write('"' + flin.getDtolinea().toString() + '"' + "," + "\n");
                bf.write(" \t\"ivaLinea\": ");
                bf.write('"' + flin.getIvalinea().toString() + '"' + "," + "\n");
                bf.write(" \t\"cantidad\": ");
                bf.write('"' + flin.getCantidad().toString() + '"' + "," + "\n");
                bf.write(" \t\"subtotal\": ");
                bf.write('"' + flin.calcularSubtotal().toString() + '"' + "\n");
                if (i == fcb.getFacturasLins().size() - 1) {
                    bf.write(" \t}\n");
                } else {
                    bf.write(" \t},\n");
                }
                i++;

            }
            bf.write("  \t],\n");
            bf.write("\t\"FacturaTotal\": {\n");
            bf.write(" \t\"numFactura\": ");
            bf.write('"' + String.valueOf(fcb.getNumfac()) + '"' + "," + "\n");
            bf.write(" \t\"total\": ");
            bf.write('"' + fcb.getFacturasTot().getTotalfac().toString() + '"' + "\n");
            bf.write("   }\n");
            bf.write("  }\n");
            bf.write(" }\n");

        } catch (IOException ex) {
            exito = false;
        } finally {
            try {
                bf.flush();
                bf.close();
                fw.close();
                exito = true;
            } catch (IOException ex) {
                exito = true;
            }
        }
        return exito;
    }

    public boolean importarDatosJSON(FacturasCab fcb, File fichero, Component component) {
        boolean exito = false;
        boolean noInsertar = false;
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String todo = "";
            while (br.read() != -1) {
                todo = todo + br.readLine();

            }
            br.close();
            fr.close();
            ArrayList<FacturasLin> listaFlin = new ArrayList<>();
            String[] lienasFacturas = todo.split("\\[")[1].split("\\{");
            for (int i = 0; i < lienasFacturas.length; i++) {
                String[] auxLin = lienasFacturas[i].split("\\,");
                FacturasLinId flinid = new FacturasLinId();
                FacturasLin flin = new FacturasLin();
                flinid.setNumfac(fcb.getNumfac());
                flin.setFacturasCab(fcb);
                int x;
                for (x = 0; x < auxLin.length - 1; x++) {
                    String datos = auxLin[x].split("\\,")[0].split("\\:")[1].replaceAll("\\s", "").replaceAll("\"", "").replaceAll("\\}", "").replaceAll("\\]", "");
                    if (i < lienasFacturas.length - 1) {
                        switch (x) {
                            case 0:
                                flinid.setLineafac(Long.parseLong(datos));
                                break;
                            case 1:
                                Articulos a = fa.obtenerArticuloId(datos);
                                flin.setArticulos(a);
                                break;
                            case 3:
                                flin.setPrecio(new BigDecimal(datos));
                                break;
                            case 4:
                                flin.setDtolinea(new BigDecimal(datos));
                                break;
                            case 5:
                                flin.setIvalinea(new BigDecimal(datos));
                                break;
                            case 6:
                                flin.setCantidad(new BigDecimal(datos));
                                break;
                        }
                    }
                }
                if (flin.getCantidad() != null) {
                    flin.setId(flinid);
                    listaFlin.add(flin);
                }

            }
            System.out.println(listaFlin.size());
            for (Iterator it = listaFlin.iterator(); it.hasNext();) {
                FacturasLin flin = (FacturasLin) it.next();
                Articulos articulos = fa.obtenerArticuloId(flin.getArticulos().getReferencia());
                if (articulos.getStock().compareTo(flin.getCantidad()) == 1) {                    
                    ff.guardarFacturasLin(flin);
                    articulos.setStock(articulos.getStock().subtract(flin.getCantidad()));                    
                    fa.actualizarArticulos(articulos);
                    
                } else {
                    noInsertar = true;
                }

            }
            if (noInsertar) {
                JOptionPane.showMessageDialog(component, "Algunas lineas excenden el stock", "Error", JOptionPane.ERROR_MESSAGE);
            }

            exito = true;

        } catch (FileNotFoundException ex) {
            exito = false;
        } catch (IOException ex) {
            exito = false;
        } catch (ArrayIndexOutOfBoundsException e) {
            exito = false;
        }
        return exito;
    }

}
