/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peluqueria;


import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class Stylist extends Person implements service {

    private JLabel totalServicesLabel;
    private JLabel totalCollectionLabel;

    private JSpinner quantityCutsMan;
    private JSpinner quantityCutsWomen;
    private JSpinner quantityTincture;
    private JSpinner quantityHairstyle;

    private JLabel cutsManLabel;
    private JLabel cutsWomenLabel;
    private JLabel tinctureLabel;
    private JLabel hairstyleLabel;
    
    private DecimalFormat decimalFormat;
    
    private int numberIdentification;

    private String specialized;

    public Stylist(String name, int age,String profession, int numberIdentification,String specialized,JSpinner quantityCutsMan, JSpinner quantityCutsWomen, JSpinner quantityTincture, JSpinner quantityHairstyle, JLabel totalServicesLabel,
            JLabel totalCollectionLabel, JLabel cutsManLabel, JLabel cutsWomenLabel, JLabel tinctureLabel, JLabel hairstyleLabel) {
        super(name, 0, profession );
        
        this.numberIdentification = numberIdentification;
        this.specialized = specialized;
        
        this.quantityCutsMan = quantityCutsMan;
        this.quantityCutsWomen = quantityCutsWomen;
        this.quantityTincture = quantityTincture;
        this.quantityHairstyle = quantityHairstyle;
        this.totalServicesLabel = totalServicesLabel;
        this.totalCollectionLabel = totalCollectionLabel;
        this.cutsManLabel = cutsManLabel;
        this.cutsWomenLabel = cutsWomenLabel;
        this.tinctureLabel = tinctureLabel;
        this.hairstyleLabel = hairstyleLabel;
        
        decimalFormat = new DecimalFormat("#");

    }

    @Override
    public double calculatePriceCutMan() {
        int quantityCutsManValue = (int) quantityCutsMan.getValue();
        double priceCutsMan = 8000; // Precio por corte de caballero
        double total = priceCutsMan * quantityCutsManValue;
        cutsManLabel.setText("$" + decimalFormat.format(total));
        return total;
    }

    @Override
    public double calculatePriceCutWoman() {
        int quantityCutsWomenValue = (int) quantityCutsWomen.getValue();
        double priceCutsWomen = 10500; // Precio por corte de dama
        double total = priceCutsWomen * quantityCutsWomenValue;
        cutsWomenLabel.setText("$" + decimalFormat.format(total));
        return total;
    }

    @Override
    public double calculatePriceTincture() {
        int quantityTinctureValue = (int) quantityTincture.getValue();
        double priceTincture = 40000; // Precio por tintura de cabello
        double total = priceTincture * quantityTinctureValue;
        tinctureLabel.setText("$" + decimalFormat.format(total));
        return total;
    }

    @Override
    public double calculatePriceHairstyle() {
        int quantityHairstyleValue = (int) quantityHairstyle.getValue();
        double priceHairstyle = 15000; // Precio por peinado
        double total = priceHairstyle * quantityHairstyleValue;
        hairstyleLabel.setText("$" + decimalFormat.format(total));
        return total;
    }

    @Override
    public void totalServices() {
        int totalServices = (int) ((int) quantityCutsMan.getValue() + (int) quantityCutsWomen.getValue() + (int) quantityTincture.getValue() + (int) quantityHairstyle.getValue());
        totalServicesLabel.setText(String.valueOf(totalServices));
    }

    @Override
    public void totalCollection() {
        double totalCollection = coinC(cutsManLabel.getText()) + coinC(cutsWomenLabel.getText()) + coinC(tinctureLabel.getText()) + coinC(hairstyleLabel.getText());
        totalCollectionLabel.setText("$" + decimalFormat.format(totalCollection));
    }

    public double coinC(String price) {
        String cleanedPrice = price.replaceAll("[^\\d.]", "");
        return Double.parseDouble(cleanedPrice);
    }

    @Override
    public void startDay() {
        quantityCutsMan.setValue(0);
        quantityCutsWomen.setValue(0);
        quantityTincture.setValue(0);
        quantityHairstyle.setValue(0);
        cutsManLabel.setText("0.00");
        cutsWomenLabel.setText("0.00");
        tinctureLabel.setText("0.00");
        hairstyleLabel.setText("0.00");
        totalServicesLabel.setText("0");
        totalCollectionLabel.setText("0.00");

    }    
}

