/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueria;
/**
 *
 * @author Katerine Forero
 */
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Total {
    public static double calculate(JLabel totalCollectionAna, JLabel totalCollectionJose, JLabel totalCollectionRoberto, JLabel totalCollectionLucrecia) {
        double ana = coinC(totalCollectionAna.getText());
        double jose = coinC(totalCollectionJose.getText());
        double roberto = coinC(totalCollectionRoberto.getText());
        double lucrecia = coinC(totalCollectionLucrecia.getText());

        double suma = ana + jose + roberto + lucrecia;
        return suma;
        
    }

    public static Double coinC(String price) {
        String cleanedPrice = price.replaceAll("[^\\d.]", "");
        return Double.valueOf(cleanedPrice);
    }
}