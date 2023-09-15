/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peluqueria;

import peluqueria.Persona;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class Estilista extends Persona implements servicio {

    private JLabel totalServiciosLabel;
    private JLabel totalRecaudoLabel;

    private JSpinner cantidadCortesCaballero;
    private JSpinner cantidadCortesDama;
    private JSpinner cantidadTinturaCabello;
    private JSpinner cantidadPeinado;

    private JLabel corteCaballeroLabel;
    private JLabel corteDamaLabel;
    private JLabel tinturaCabelloLabel;
    private JLabel peinadoLabel;
    
    private DecimalFormat decimalFormat;
    
    private int numeroIdentificacion;

    private String especialidad;

    public Estilista(String nombre, int edad,String profesion, int numeroIdentificacion,String especialidad,JSpinner cantidadCortesCaballero, JSpinner cantidadCortesDama, JSpinner cantidadTinturaCabello, JSpinner cantidadPeinado, JLabel totalServicios,
            JLabel totalRecaudo, JLabel corteCaballeroLabel, JLabel corteDamaLabel, JLabel tinturaCabelloLabel, JLabel peinadoLabel) {
        super(nombre, 0, profesion );
        
        this.numeroIdentificacion = numeroIdentificacion;
        this.especialidad = especialidad;
        
        this.cantidadCortesCaballero = cantidadCortesCaballero;
        this.cantidadCortesDama = cantidadCortesDama;
        this.cantidadTinturaCabello = cantidadTinturaCabello;
        this.cantidadPeinado = cantidadPeinado;
        this.totalServiciosLabel = totalServicios;
        this.totalRecaudoLabel = totalRecaudo;
        this.corteCaballeroLabel = corteCaballeroLabel;
        this.corteDamaLabel = corteDamaLabel;
        this.tinturaCabelloLabel = tinturaCabelloLabel;
        this.peinadoLabel = peinadoLabel;
        
        decimalFormat = new DecimalFormat("#");

    }

    @Override
    public double calcularPrecioCorteCaballero() {
        int cantidadCortesCaballeroValue = (int) cantidadCortesCaballero.getValue();
        double precioCorteCaballero = 8000; // Precio por corte de caballero
        double total = precioCorteCaballero * cantidadCortesCaballeroValue;
        corteCaballeroLabel.setText("$" + decimalFormat.format(total));
        return total;
    }

    @Override
    public double calcularPrecioCorteDama() {
        int cantidadCortesDamaValue = (int) cantidadCortesDama.getValue();
        double precioCorteDama = 10500; // Precio por corte de dama
        double total = precioCorteDama * cantidadCortesDamaValue;
        corteDamaLabel.setText("$" + decimalFormat.format(total));
        return total;
    }

    @Override
    public double calcularPrecioTinturaCabello() {
        int cantidadTinturaCabelloValue = (int) cantidadTinturaCabello.getValue();
        double precioTinturaCabello = 40000; // Precio por tintura de cabello
        double total = precioTinturaCabello * cantidadTinturaCabelloValue;
        tinturaCabelloLabel.setText("$" + decimalFormat.format(total));
        return total;
    }

    @Override
    public double calcularPrecioPeinado() {
        int cantidadPeinadoValue = (int) cantidadPeinado.getValue();
        double precioPeinado = 15000; // Precio por peinado
        double total = precioPeinado * cantidadPeinadoValue;
        peinadoLabel.setText("$" + decimalFormat.format(total));
        return total;
    }

    @Override
    public void totalServicios() {
        int totalServicios = (int) ((int) cantidadCortesCaballero.getValue() + (int) cantidadCortesDama.getValue() + (int) cantidadTinturaCabello.getValue() + (int) cantidadPeinado.getValue());
        totalServiciosLabel.setText(String.valueOf(totalServicios));
    }

    @Override
    public void totalRecaudo() {
        double totalRecaudo = monedaD(corteCaballeroLabel.getText()) + monedaD(corteDamaLabel.getText()) + monedaD(tinturaCabelloLabel.getText()) + monedaD(peinadoLabel.getText());
        totalRecaudoLabel.setText("$" + decimalFormat.format(totalRecaudo));
    }

    public double monedaD(String precio) {
        String cleanedPrecio = precio.replaceAll("[^\\d.]", "");
        return Double.parseDouble(cleanedPrecio);
    }

    @Override
    public void iniciarDia() {
        cantidadCortesCaballero.setValue(0);
        cantidadCortesDama.setValue(0);
        cantidadTinturaCabello.setValue(0);
        cantidadPeinado.setValue(0);
        corteCaballeroLabel.setText("0.00");
        corteDamaLabel.setText("0.00");
        tinturaCabelloLabel.setText("0.00");
        peinadoLabel.setText("0.00");
        totalServiciosLabel.setText("0");
        totalRecaudoLabel.setText("0.00");

    }    
}

