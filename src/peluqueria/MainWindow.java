package peluqueria;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class MainWindow extends javax.swing.JFrame {

    private Stylist stylistRoberto;
    private Stylist stylistAna;
    private Stylist stylistJose;
    private Stylist stylistLucrecia;
    private Stylist controller;
    private int a; 

    public int getA() {
        return a;
    }

    public void setA(double a) {
        this.a = (int) a;
    }

    public MainWindow() {

        initComponents();
        
        stylistAna = new Stylist("Ana", 25, "estilista", 1, "cortes Dama", quantityCutsManAna, quantityCutsWomenAna, quantityTinctureAna, quantityHairstyleAna, totalServicesAna, totalCollectionAna, cutManAna, cutWomanAna, hairdoAna, dyeHairAna);
        stylistRoberto = new Stylist("Roberto", 28, "Barbero", 2, "cortes Hombre", quantityCutsManRoberto, quantityCutsWomenRoberto, quantityTinctureRoberto, quantityHairstyleRoberto, totalServicesRoberto, totalCollectionRoberto, cutManRoberto, cutWomanRoberto, hairdoRoberto, dyeHairRoberto);
        stylistJose = new Stylist("Jose", 30, "Barbero", 3, "tinturar cabello", quantityCutsManJose, quantityCutsWomenJose, quantityTinctureJose, quantityHairstyleJose, totalServicesJose, totalCollectionJose, cutManJose, cutWomanJose, hairdoJose, dyeHairJose);
        stylistLucrecia = new Stylist("Lucrecia", 22, "estilista", 4, "peinados", quantityCutsManLucrecia, quantityCutsWomenLucrecia, quantityTinctureLucrecia, quantityHairstyleLucrecia, totalServicesLucrecia, totalCollectionLucrecia, cutManLucrecia, cutWomanLucrecia, hairdoLucrecia, dyeHairLucrecia);

        String nombreEstilistaAna = stylistAna.getName(); 
        panelStylistAna.setBorder(BorderFactory.createTitledBorder(nombreEstilistaAna));
        
        String nombreEstilistaRoberto = stylistRoberto.getName(); 
        panelStylistRoberto.setBorder(BorderFactory.createTitledBorder(nombreEstilistaRoberto));
        
        String nombreEstilistaJose = stylistJose.getName(); 
        panelStylistJose.setBorder(BorderFactory.createTitledBorder(nombreEstilistaJose));
        
        String nombreEstilistaLucrecia = stylistLucrecia.getName(); 
        panelStylistLucrecia.setBorder(BorderFactory.createTitledBorder(nombreEstilistaLucrecia));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seeTotals = new javax.swing.JButton();
        panelStylistRoberto = new javax.swing.JPanel();
        quantityCutsWomenRoberto = new javax.swing.JSpinner();
        totalServicesRoberto = new javax.swing.JLabel();
        quantityTinctureRoberto = new javax.swing.JSpinner();
        totalCollectionRoberto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantityHairstyleRoberto = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        cutManRoberto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cutWomanRoberto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hairdoRoberto = new javax.swing.JLabel();
        quantityCutsManRoberto = new javax.swing.JSpinner();
        dyeHairRoberto = new javax.swing.JLabel();
        panelStylistJose = new javax.swing.JPanel();
        quantityCutsWomenJose = new javax.swing.JSpinner();
        totalServicesJose = new javax.swing.JLabel();
        quantityTinctureJose = new javax.swing.JSpinner();
        totalCollectionJose = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        quantityHairstyleJose = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        cutManJose = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cutWomanJose = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        hairdoJose = new javax.swing.JLabel();
        quantityCutsManJose = new javax.swing.JSpinner();
        dyeHairJose = new javax.swing.JLabel();
        panelStylistLucrecia = new javax.swing.JPanel();
        quantityCutsWomenLucrecia = new javax.swing.JSpinner();
        totalServicesLucrecia = new javax.swing.JLabel();
        quantityTinctureLucrecia = new javax.swing.JSpinner();
        totalCollectionLucrecia = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        quantityHairstyleLucrecia = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        cutManLucrecia = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cutWomanLucrecia = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        hairdoLucrecia = new javax.swing.JLabel();
        quantityCutsManLucrecia = new javax.swing.JSpinner();
        dyeHairLucrecia = new javax.swing.JLabel();
        checkInAna = new javax.swing.JButton();
        checkInRoberto = new javax.swing.JButton();
        checkInJose = new javax.swing.JButton();
        checkInLucrecia = new javax.swing.JButton();
        start = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        panelStylistAna = new javax.swing.JPanel();
        quantityCutsWomenAna = new javax.swing.JSpinner();
        totalServicesAna = new javax.swing.JLabel();
        quantityTinctureAna = new javax.swing.JSpinner();
        totalCollectionAna = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        quantityHairstyleAna = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        cutManAna = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cutWomanAna = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hairdoAna = new javax.swing.JLabel();
        quantityCutsManAna = new javax.swing.JSpinner();
        dyeHairAna = new javax.swing.JLabel();
        imageJose = new javax.swing.JLabel();
        imageRoberto = new javax.swing.JLabel();
        imageAna = new javax.swing.JLabel();
        imageLucrecia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seeTotals.setText("Ver Totales");
        seeTotals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeTotalsActionPerformed(evt);
            }
        });
        getContentPane().add(seeTotals, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, -1, -1));

        panelStylistRoberto.setBackground(new java.awt.Color(153, 153, 153));
        panelStylistRoberto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        quantityCutsWomenRoberto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityCutsWomenRoberto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityCutsWomenRobertoStateChanged(evt);
            }
        });

        totalServicesRoberto.setText("0");

        quantityTinctureRoberto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityTinctureRoberto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityTinctureRobertoStateChanged(evt);
            }
        });

        totalCollectionRoberto.setText("$ 0.00");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Corte Caballero:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Corte Dama:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tintura Cabello:");

        quantityHairstyleRoberto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityHairstyleRoberto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityHairstyleRobertoStateChanged(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Peinado:");

        cutManRoberto.setText("$ 0.00");
        cutManRoberto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cutManRobertoComponentHidden(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total Servicios:");

        cutWomanRoberto.setText("$ 0.00");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Recaudo:");

        hairdoRoberto.setText("$ 0.00");

        quantityCutsManRoberto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityCutsManRoberto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityCutsManRobertoStateChanged(evt);
            }
        });

        dyeHairRoberto.setText("$ 0.00");

        javax.swing.GroupLayout panelStylistRobertoLayout = new javax.swing.GroupLayout(panelStylistRoberto);
        panelStylistRoberto.setLayout(panelStylistRobertoLayout);
        panelStylistRobertoLayout.setHorizontalGroup(
            panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStylistRobertoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStylistRobertoLayout.createSequentialGroup()
                        .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityCutsManRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cutManRoberto))
                    .addGroup(panelStylistRobertoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantityCutsWomenRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTinctureRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityHairstyleRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cutWomanRoberto)
                            .addComponent(hairdoRoberto)
                            .addComponent(dyeHairRoberto)))
                    .addGroup(panelStylistRobertoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServicesRoberto))
                    .addGroup(panelStylistRobertoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalCollectionRoberto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStylistRobertoLayout.setVerticalGroup(
            panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStylistRobertoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cutManRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(quantityCutsManRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantityCutsWomenRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutWomanRoberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantityTinctureRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hairdoRoberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(quantityHairstyleRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dyeHairRoberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalServicesRoberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalCollectionRoberto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelStylistRoberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 250, 240));
        panelStylistRoberto.getAccessibleContext().setAccessibleName("");

        panelStylistJose.setBackground(new java.awt.Color(153, 153, 153));
        panelStylistJose.setBorder(new javax.swing.border.MatteBorder(null));

        quantityCutsWomenJose.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityCutsWomenJose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityCutsWomenJoseStateChanged(evt);
            }
        });

        totalServicesJose.setText("0");

        quantityTinctureJose.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityTinctureJose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityTinctureJoseStateChanged(evt);
            }
        });

        totalCollectionJose.setText("$ 0.00");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Corte Caballero:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Corte Dama:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tintura Cabello:");

        quantityHairstyleJose.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityHairstyleJose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityHairstyleJoseStateChanged(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Peinado:");

        cutManJose.setText("$ 0.00");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Total Servicios:");

        cutWomanJose.setText("$ 0.00");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Total Recaudo:");

        hairdoJose.setText("$ 0.00");

        quantityCutsManJose.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityCutsManJose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityCutsManJoseStateChanged(evt);
            }
        });

        dyeHairJose.setText("$ 0.00");

        javax.swing.GroupLayout panelStylistJoseLayout = new javax.swing.GroupLayout(panelStylistJose);
        panelStylistJose.setLayout(panelStylistJoseLayout);
        panelStylistJoseLayout.setHorizontalGroup(
            panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStylistJoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStylistJoseLayout.createSequentialGroup()
                        .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15))
                            .addComponent(jLabel17)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStylistJoseLayout.createSequentialGroup()
                                .addComponent(quantityCutsManJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cutManJose))
                            .addComponent(quantityTinctureJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelStylistJoseLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantityCutsWomenJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityHairstyleJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cutWomanJose)
                            .addComponent(hairdoJose)
                            .addComponent(dyeHairJose)))
                    .addGroup(panelStylistJoseLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServicesJose))
                    .addGroup(panelStylistJoseLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalCollectionJose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStylistJoseLayout.setVerticalGroup(
            panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStylistJoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(quantityCutsManJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutManJose))
                .addGap(6, 6, 6)
                .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(quantityCutsWomenJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutWomanJose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(quantityTinctureJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hairdoJose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(quantityHairstyleJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dyeHairJose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(totalServicesJose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(totalCollectionJose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelStylistJose, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 200));

        panelStylistLucrecia.setBackground(new java.awt.Color(153, 153, 153));
        panelStylistLucrecia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        quantityCutsWomenLucrecia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityCutsWomenLucrecia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityCutsWomenLucreciaStateChanged(evt);
            }
        });

        totalServicesLucrecia.setText("0");

        quantityTinctureLucrecia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityTinctureLucrecia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityTinctureLucreciaStateChanged(evt);
            }
        });

        totalCollectionLucrecia.setText("$ 0.00");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Corte Caballero:");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Corte Dama:");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tintura Cabello:");

        quantityHairstyleLucrecia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityHairstyleLucrecia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityHairstyleLucreciaStateChanged(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Peinado:");

        cutManLucrecia.setText("$ 0.00");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Total Servicios:");

        cutWomanLucrecia.setText("$ 0.00");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Total Recaudo:");

        hairdoLucrecia.setText("$ 0.00");

        quantityCutsManLucrecia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityCutsManLucrecia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityCutsManLucreciaStateChanged(evt);
            }
        });

        dyeHairLucrecia.setText("$ 0.00");

        javax.swing.GroupLayout panelStylistLucreciaLayout = new javax.swing.GroupLayout(panelStylistLucrecia);
        panelStylistLucrecia.setLayout(panelStylistLucreciaLayout);
        panelStylistLucreciaLayout.setHorizontalGroup(
            panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStylistLucreciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStylistLucreciaLayout.createSequentialGroup()
                        .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelStylistLucreciaLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quantityCutsWomenLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelStylistLucreciaLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityCutsManLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cutManLucrecia)
                            .addComponent(cutWomanLucrecia)))
                    .addGroup(panelStylistLucreciaLayout.createSequentialGroup()
                        .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStylistLucreciaLayout.createSequentialGroup()
                                .addComponent(quantityHairstyleLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dyeHairLucrecia))
                            .addGroup(panelStylistLucreciaLayout.createSequentialGroup()
                                .addComponent(quantityTinctureLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hairdoLucrecia))))
                    .addGroup(panelStylistLucreciaLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServicesLucrecia))
                    .addGroup(panelStylistLucreciaLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalCollectionLucrecia)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelStylistLucreciaLayout.setVerticalGroup(
            panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStylistLucreciaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(quantityCutsManLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutManLucrecia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(quantityCutsWomenLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutWomanLucrecia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(quantityTinctureLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hairdoLucrecia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityHairstyleLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dyeHairLucrecia)))
                .addGap(18, 18, 18)
                .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(totalServicesLucrecia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(totalCollectionLucrecia))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(panelStylistLucrecia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 260, 250));

        checkInAna.setText("Registrar Anita");
        checkInAna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInAnaActionPerformed(evt);
            }
        });
        getContentPane().add(checkInAna, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, -1, -1));

        checkInRoberto.setText("Registrar Roberto");
        checkInRoberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInRobertoActionPerformed(evt);
            }
        });
        getContentPane().add(checkInRoberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, -1, -1));

        checkInJose.setText("Registrar Jose");
        checkInJose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInJoseActionPerformed(evt);
            }
        });
        getContentPane().add(checkInJose, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, -1, -1));

        checkInLucrecia.setText("Registrar Lucrecia");
        checkInLucrecia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInLucreciaActionPerformed(evt);
            }
        });
        getContentPane().add(checkInLucrecia, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, -1, -1));

        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton inicio.jpg"))); // NOI18N
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 60, 50));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton salida.jpg"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, 80, 30));

        panelStylistAna.setBackground(new java.awt.Color(153, 153, 153));
        panelStylistAna.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        quantityCutsWomenAna.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityCutsWomenAna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityCutsWomenAnaStateChanged(evt);
            }
        });

        totalServicesAna.setText("0");

        quantityTinctureAna.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityTinctureAna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityTinctureAnaStateChanged(evt);
            }
        });

        totalCollectionAna.setText("$ 0.00");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Corte Caballero:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Corte Dama:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tintura Cabello:");

        quantityHairstyleAna.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityHairstyleAna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityHairstyleAnaStateChanged(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Peinado:");

        cutManAna.setText("$ 0.00");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Total Servicios:");

        cutWomanAna.setText("$ 0.00");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total Recaudo:");

        hairdoAna.setText("$ 0.00");

        quantityCutsManAna.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        quantityCutsManAna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityCutsManAnaStateChanged(evt);
            }
        });

        dyeHairAna.setText("$ 0.00");

        javax.swing.GroupLayout panelStylistAnaLayout = new javax.swing.GroupLayout(panelStylistAna);
        panelStylistAna.setLayout(panelStylistAnaLayout);
        panelStylistAnaLayout.setHorizontalGroup(
            panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStylistAnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStylistAnaLayout.createSequentialGroup()
                        .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityCutsManAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cutManAna))
                    .addGroup(panelStylistAnaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantityCutsWomenAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTinctureAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityHairstyleAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cutWomanAna)
                            .addComponent(hairdoAna)
                            .addComponent(dyeHairAna)))
                    .addGroup(panelStylistAnaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServicesAna))
                    .addGroup(panelStylistAnaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalCollectionAna)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelStylistAnaLayout.setVerticalGroup(
            panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStylistAnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(quantityCutsManAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutManAna))
                .addGap(6, 6, 6)
                .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(quantityCutsWomenAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutWomanAna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(quantityTinctureAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hairdoAna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dyeHairAna)
                        .addComponent(quantityHairstyleAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(totalServicesAna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStylistAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(totalCollectionAna))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(panelStylistAna, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 240, 200));
        panelStylistAna.getAccessibleContext().setAccessibleName("");

        imageJose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.jpeg"))); // NOI18N
        imageJose.setText("\\");
            getContentPane().add(imageJose, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 230, 200));

            imageRoberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/69a0af10d11961de62d7ca5f94460b74.jpg"))); // NOI18N
            getContentPane().add(imageRoberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 210));

            imageAna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chica6.jpg"))); // NOI18N
            getContentPane().add(imageAna, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, 200));

            imageLucrecia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagen10.jpg"))); // NOI18N
            getContentPane().add(imageLucrecia, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, 220));

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stock-photo-top-view-various-professional-barber-tools-black-background.jpeg"))); // NOI18N
            getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -140, 1320, 960));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void quantityHairstyleRobertoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityHairstyleRobertoStateChanged
        stylistRoberto.calculatePriceHairstyle();
        
        
    }//GEN-LAST:event_quantityHairstyleRobertoStateChanged

    private void seeTotalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeTotalsActionPerformed

        double a = Total.calculate(totalCollectionAna, totalCollectionJose, totalCollectionRoberto, totalCollectionLucrecia);
        int entero = (int) a;
        Window2 window2 = new Window2();
        window2.setResultado(entero);
        window2.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_seeTotalsActionPerformed

    public JButton getjButton7() {
        return exit;
    }

    public void setjButton7(JButton jButton7) {
        this.exit = jButton7;
    }

    private void quantityCutsManRobertoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityCutsManRobertoStateChanged
        stylistRoberto.calculatePriceCutMan();
    }//GEN-LAST:event_quantityCutsManRobertoStateChanged

    private void quantityCutsWomenRobertoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityCutsWomenRobertoStateChanged
        stylistRoberto.calculatePriceCutWoman();
    }//GEN-LAST:event_quantityCutsWomenRobertoStateChanged

    private void quantityTinctureRobertoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityTinctureRobertoStateChanged
        stylistRoberto.calculatePriceTincture();
    }//GEN-LAST:event_quantityTinctureRobertoStateChanged

    private void quantityCutsWomenAnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityCutsWomenAnaStateChanged
        stylistAna.calculatePriceCutWoman();
    }//GEN-LAST:event_quantityCutsWomenAnaStateChanged

    private void quantityTinctureAnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityTinctureAnaStateChanged
        stylistAna.calculatePriceTincture();
    }//GEN-LAST:event_quantityTinctureAnaStateChanged

    private void quantityHairstyleAnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityHairstyleAnaStateChanged
        stylistAna.calculatePriceHairstyle();
    }//GEN-LAST:event_quantityHairstyleAnaStateChanged

    private void quantityCutsManAnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityCutsManAnaStateChanged
        stylistAna.calculatePriceCutMan();
    }//GEN-LAST:event_quantityCutsManAnaStateChanged

    private void quantityCutsWomenJoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityCutsWomenJoseStateChanged
        stylistJose.calculatePriceCutWoman();
    }//GEN-LAST:event_quantityCutsWomenJoseStateChanged

    private void quantityTinctureJoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityTinctureJoseStateChanged
        stylistJose.calculatePriceTincture();
    }//GEN-LAST:event_quantityTinctureJoseStateChanged

    private void quantityHairstyleJoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityHairstyleJoseStateChanged
        stylistJose.calculatePriceHairstyle();
    }//GEN-LAST:event_quantityHairstyleJoseStateChanged

    private void quantityCutsManJoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityCutsManJoseStateChanged
        stylistJose.calculatePriceCutMan();
    }//GEN-LAST:event_quantityCutsManJoseStateChanged

    private void quantityCutsWomenLucreciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityCutsWomenLucreciaStateChanged
        stylistLucrecia.calculatePriceCutWoman();
    }//GEN-LAST:event_quantityCutsWomenLucreciaStateChanged

    private void quantityTinctureLucreciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityTinctureLucreciaStateChanged
        stylistLucrecia.calculatePriceTincture();
    }//GEN-LAST:event_quantityTinctureLucreciaStateChanged

    private void quantityHairstyleLucreciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityHairstyleLucreciaStateChanged
        stylistLucrecia.calculatePriceHairstyle();
    }//GEN-LAST:event_quantityHairstyleLucreciaStateChanged

    private void quantityCutsManLucreciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityCutsManLucreciaStateChanged
        stylistLucrecia.calculatePriceCutMan();
    }//GEN-LAST:event_quantityCutsManLucreciaStateChanged

    private void checkInAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInAnaActionPerformed
        stylistAna.totalServices();
        stylistAna.totalCollection();
    }//GEN-LAST:event_checkInAnaActionPerformed

    private void checkInRobertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInRobertoActionPerformed
        stylistRoberto.totalServices();
        stylistRoberto.totalCollection();
    }//GEN-LAST:event_checkInRobertoActionPerformed

    private void checkInJoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInJoseActionPerformed
        stylistJose.totalServices();
        stylistJose.totalCollection();
    }//GEN-LAST:event_checkInJoseActionPerformed

    private void checkInLucreciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInLucreciaActionPerformed
        stylistLucrecia.totalServices();
        stylistLucrecia.totalCollection();

    }//GEN-LAST:event_checkInLucreciaActionPerformed

    private void cutManRobertoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cutManRobertoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_cutManRobertoComponentHidden

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        stylistAna.startDay();
        stylistJose.startDay();
        stylistLucrecia.startDay();
        stylistRoberto.startDay();
    }//GEN-LAST:event_startActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();

    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkInAna;
    private javax.swing.JButton checkInJose;
    private javax.swing.JButton checkInLucrecia;
    private javax.swing.JButton checkInRoberto;
    private javax.swing.JLabel cutManAna;
    private javax.swing.JLabel cutManJose;
    private javax.swing.JLabel cutManLucrecia;
    private javax.swing.JLabel cutManRoberto;
    private javax.swing.JLabel cutWomanAna;
    private javax.swing.JLabel cutWomanJose;
    private javax.swing.JLabel cutWomanLucrecia;
    private javax.swing.JLabel cutWomanRoberto;
    private javax.swing.JLabel dyeHairAna;
    private javax.swing.JLabel dyeHairJose;
    private javax.swing.JLabel dyeHairLucrecia;
    private javax.swing.JLabel dyeHairRoberto;
    private javax.swing.JButton exit;
    private javax.swing.JLabel hairdoAna;
    private javax.swing.JLabel hairdoJose;
    private javax.swing.JLabel hairdoLucrecia;
    private javax.swing.JLabel hairdoRoberto;
    private javax.swing.JLabel imageAna;
    private javax.swing.JLabel imageJose;
    private javax.swing.JLabel imageLucrecia;
    private javax.swing.JLabel imageRoberto;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelStylistAna;
    private javax.swing.JPanel panelStylistJose;
    private javax.swing.JPanel panelStylistLucrecia;
    private javax.swing.JPanel panelStylistRoberto;
    private javax.swing.JSpinner quantityCutsManAna;
    private javax.swing.JSpinner quantityCutsManJose;
    private javax.swing.JSpinner quantityCutsManLucrecia;
    private javax.swing.JSpinner quantityCutsManRoberto;
    private javax.swing.JSpinner quantityCutsWomenAna;
    private javax.swing.JSpinner quantityCutsWomenJose;
    private javax.swing.JSpinner quantityCutsWomenLucrecia;
    private javax.swing.JSpinner quantityCutsWomenRoberto;
    private javax.swing.JSpinner quantityHairstyleAna;
    private javax.swing.JSpinner quantityHairstyleJose;
    private javax.swing.JSpinner quantityHairstyleLucrecia;
    private javax.swing.JSpinner quantityHairstyleRoberto;
    private javax.swing.JSpinner quantityTinctureAna;
    private javax.swing.JSpinner quantityTinctureJose;
    private javax.swing.JSpinner quantityTinctureLucrecia;
    private javax.swing.JSpinner quantityTinctureRoberto;
    private javax.swing.JButton seeTotals;
    private javax.swing.JButton start;
    private javax.swing.JLabel totalCollectionAna;
    private javax.swing.JLabel totalCollectionJose;
    private javax.swing.JLabel totalCollectionLucrecia;
    private javax.swing.JLabel totalCollectionRoberto;
    private javax.swing.JLabel totalServicesAna;
    private javax.swing.JLabel totalServicesJose;
    private javax.swing.JLabel totalServicesLucrecia;
    private javax.swing.JLabel totalServicesRoberto;
    // End of variables declaration//GEN-END:variables

    public Double coinC(String precio) {

        String cleanedPrecio = precio.replaceAll("[^\\d.]", "");
        return Double.valueOf(cleanedPrecio);
    }
}
