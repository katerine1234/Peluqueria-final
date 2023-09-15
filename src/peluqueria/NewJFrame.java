package peluqueria;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import peluqueria.Estilista;
import static peluqueria.ventana2.nuevoFrame;

public class NewJFrame extends javax.swing.JFrame {

    public static NewJFrame create() {
        return new NewJFrame();
    }

    private Estilista estilistaRoberto;
    private Estilista estilistaAna;
    private Estilista estilistaJose;
    private Estilista estilistaLucrecia;
    private Estilista controlador;
    private double a; 

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    private NewJFrame() {

        initComponents();
        
        estilistaAna = new Estilista("Ana", 25, "estilista", 1, "cortes Dama", cantidadCortesCaballeroAna, cantidadCortesDamaAna, cantidadTinturaCabelloAna, cantidadPeinadoAna, totalServiciosAna, totalRecaudoAna, corteCaballeroAna, corteDamaAna, tinturaCabelloAna, peinadoAna);
        estilistaRoberto = new Estilista("Roberto", 28, "Barbero", 2, "cortes Hombre", cantidadCortesCaballeroRoberto, cantidadCortesDamaRoberto, cantidadTinturaCabelloRoberto, cantidadPeinadoRoberto, totalServiciosRoberto, totalRecaudoRoberto, corteCaballeroRoberto, corteDamaRoberto, tinturaCabelloRoberto, peinadoRoberto);
        estilistaJose = new Estilista("Jose", 30, "Barbero", 3, "tinturar cabello", cantidadCortesCaballeroJose, cantidadCortesDamaJose, cantidadTinturaCabelloJose, cantidadPeinadoJose, totalServiciosJose, totalRecaudoJose, corteCaballeroJose, corteDamaJose, tinturaCabelloJose, peinadoJose);
        estilistaLucrecia = new Estilista("Lucrecia", 22, "estilista", 4, "peinados", cantidadCortesCaballeroLucrecia, cantidadCortesDamaLucrecia, cantidadTinturaCabelloLucrecia, cantidadPeinadoLucrecia, totalServiciosLucrecia, totalRecaudoLucrecia, corteCaballeroLucrecia, corteDamaLucrecia, tinturaCabelloLucrecia, peinadoLucrecia);

        String nombreEstilistaAna = estilistaAna.getNombre(); 
        panelEstilistaAna.setBorder(BorderFactory.createTitledBorder(nombreEstilistaAna));
        
        String nombreEstilistaRoberto = estilistaRoberto.getNombre(); 
        panelEstilistaRoberto.setBorder(BorderFactory.createTitledBorder(nombreEstilistaRoberto));
        
        String nombreEstilistaJose = estilistaJose.getNombre(); 
        panelEstilistaJose.setBorder(BorderFactory.createTitledBorder(nombreEstilistaJose));
        
        String nombreEstilistaLucrecia = estilistaLucrecia.getNombre(); 
        panelEstilistaLucrecia.setBorder(BorderFactory.createTitledBorder(nombreEstilistaLucrecia));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelEstilistaRoberto = new javax.swing.JPanel();
        cantidadCortesDamaRoberto = new javax.swing.JSpinner();
        totalServiciosRoberto = new javax.swing.JLabel();
        cantidadTinturaCabelloRoberto = new javax.swing.JSpinner();
        totalRecaudoRoberto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cantidadPeinadoRoberto = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        corteCaballeroRoberto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        corteDamaRoberto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tinturaCabelloRoberto = new javax.swing.JLabel();
        cantidadCortesCaballeroRoberto = new javax.swing.JSpinner();
        peinadoRoberto = new javax.swing.JLabel();
        panelEstilistaAna = new javax.swing.JPanel();
        cantidadCortesDamaAna = new javax.swing.JSpinner();
        totalServiciosAna = new javax.swing.JLabel();
        cantidadTinturaCabelloAna = new javax.swing.JSpinner();
        totalRecaudoAna = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cantidadPeinadoAna = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        corteCaballeroAna = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        corteDamaAna = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tinturaCabelloAna = new javax.swing.JLabel();
        cantidadCortesCaballeroAna = new javax.swing.JSpinner();
        peinadoAna = new javax.swing.JLabel();
        panelEstilistaJose = new javax.swing.JPanel();
        cantidadCortesDamaJose = new javax.swing.JSpinner();
        totalServiciosJose = new javax.swing.JLabel();
        cantidadTinturaCabelloJose = new javax.swing.JSpinner();
        totalRecaudoJose = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cantidadPeinadoJose = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        corteCaballeroJose = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        corteDamaJose = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tinturaCabelloJose = new javax.swing.JLabel();
        cantidadCortesCaballeroJose = new javax.swing.JSpinner();
        peinadoJose = new javax.swing.JLabel();
        panelEstilistaLucrecia = new javax.swing.JPanel();
        cantidadCortesDamaLucrecia = new javax.swing.JSpinner();
        totalServiciosLucrecia = new javax.swing.JLabel();
        cantidadTinturaCabelloLucrecia = new javax.swing.JSpinner();
        totalRecaudoLucrecia = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cantidadPeinadoLucrecia = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        corteCaballeroLucrecia = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        corteDamaLucrecia = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tinturaCabelloLucrecia = new javax.swing.JLabel();
        cantidadCortesCaballeroLucrecia = new javax.swing.JSpinner();
        peinadoLucrecia = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ver Totales");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelEstilistaRoberto.setBackground(new java.awt.Color(204, 255, 204));
        panelEstilistaRoberto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cantidadCortesDamaRoberto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadCortesDamaRoberto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadCortesDamaRobertoStateChanged(evt);
            }
        });

        totalServiciosRoberto.setText("0");

        cantidadTinturaCabelloRoberto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadTinturaCabelloRoberto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadTinturaCabelloRobertoStateChanged(evt);
            }
        });

        totalRecaudoRoberto.setText("$ 0.00");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Corte Caballero:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Corte Dama:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tintura Cabello:");

        cantidadPeinadoRoberto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadPeinadoRoberto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadPeinadoRobertoStateChanged(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Peinado:");

        corteCaballeroRoberto.setText("$ 0.00");
        corteCaballeroRoberto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                corteCaballeroRobertoComponentHidden(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total Servicios:");

        corteDamaRoberto.setText("$ 0.00");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Recaudo:");

        tinturaCabelloRoberto.setText("$ 0.00");

        cantidadCortesCaballeroRoberto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadCortesCaballeroRoberto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadCortesCaballeroRobertoStateChanged(evt);
            }
        });

        peinadoRoberto.setText("$ 0.00");

        javax.swing.GroupLayout panelEstilistaRobertoLayout = new javax.swing.GroupLayout(panelEstilistaRoberto);
        panelEstilistaRoberto.setLayout(panelEstilistaRobertoLayout);
        panelEstilistaRobertoLayout.setHorizontalGroup(
            panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstilistaRobertoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstilistaRobertoLayout.createSequentialGroup()
                        .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadCortesCaballeroRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(corteCaballeroRoberto))
                    .addGroup(panelEstilistaRobertoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cantidadCortesDamaRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadTinturaCabelloRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadPeinadoRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corteDamaRoberto)
                            .addComponent(tinturaCabelloRoberto)
                            .addComponent(peinadoRoberto)))
                    .addGroup(panelEstilistaRobertoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServiciosRoberto))
                    .addGroup(panelEstilistaRobertoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalRecaudoRoberto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstilistaRobertoLayout.setVerticalGroup(
            panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstilistaRobertoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corteCaballeroRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cantidadCortesCaballeroRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cantidadCortesDamaRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corteDamaRoberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cantidadTinturaCabelloRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tinturaCabelloRoberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cantidadPeinadoRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(peinadoRoberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalServiciosRoberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaRobertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalRecaudoRoberto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEstilistaAna.setBackground(new java.awt.Color(204, 255, 204));
        panelEstilistaAna.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cantidadCortesDamaAna.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadCortesDamaAna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadCortesDamaAnaStateChanged(evt);
            }
        });

        totalServiciosAna.setText("0");

        cantidadTinturaCabelloAna.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadTinturaCabelloAna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadTinturaCabelloAnaStateChanged(evt);
            }
        });

        totalRecaudoAna.setText("$ 0.00");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Corte Caballero:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Corte Dama:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tintura Cabello:");

        cantidadPeinadoAna.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadPeinadoAna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadPeinadoAnaStateChanged(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Peinado:");

        corteCaballeroAna.setText("$ 0.00");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Total Servicios:");

        corteDamaAna.setText("$ 0.00");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total Recaudo:");

        tinturaCabelloAna.setText("$ 0.00");

        cantidadCortesCaballeroAna.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadCortesCaballeroAna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadCortesCaballeroAnaStateChanged(evt);
            }
        });

        peinadoAna.setText("$ 0.00");

        javax.swing.GroupLayout panelEstilistaAnaLayout = new javax.swing.GroupLayout(panelEstilistaAna);
        panelEstilistaAna.setLayout(panelEstilistaAnaLayout);
        panelEstilistaAnaLayout.setHorizontalGroup(
            panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstilistaAnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstilistaAnaLayout.createSequentialGroup()
                        .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadCortesCaballeroAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(corteCaballeroAna))
                    .addGroup(panelEstilistaAnaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cantidadCortesDamaAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadTinturaCabelloAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadPeinadoAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corteDamaAna)
                            .addComponent(tinturaCabelloAna)
                            .addComponent(peinadoAna)))
                    .addGroup(panelEstilistaAnaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServiciosAna))
                    .addGroup(panelEstilistaAnaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalRecaudoAna)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstilistaAnaLayout.setVerticalGroup(
            panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstilistaAnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cantidadCortesCaballeroAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corteCaballeroAna))
                .addGap(6, 6, 6)
                .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cantidadCortesDamaAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corteDamaAna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cantidadTinturaCabelloAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tinturaCabelloAna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cantidadPeinadoAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(peinadoAna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(totalServiciosAna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaAnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(totalRecaudoAna))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEstilistaJose.setBackground(new java.awt.Color(204, 255, 204));
        panelEstilistaJose.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cantidadCortesDamaJose.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadCortesDamaJose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadCortesDamaJoseStateChanged(evt);
            }
        });

        totalServiciosJose.setText("0");

        cantidadTinturaCabelloJose.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadTinturaCabelloJose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadTinturaCabelloJoseStateChanged(evt);
            }
        });

        totalRecaudoJose.setText("$ 0.00");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Corte Caballero:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Corte Dama:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tintura Cabello:");

        cantidadPeinadoJose.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadPeinadoJose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadPeinadoJoseStateChanged(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Peinado:");

        corteCaballeroJose.setText("$ 0.00");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Total Servicios:");

        corteDamaJose.setText("$ 0.00");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Total Recaudo:");

        tinturaCabelloJose.setText("$ 0.00");

        cantidadCortesCaballeroJose.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadCortesCaballeroJose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadCortesCaballeroJoseStateChanged(evt);
            }
        });

        peinadoJose.setText("$ 0.00");

        javax.swing.GroupLayout panelEstilistaJoseLayout = new javax.swing.GroupLayout(panelEstilistaJose);
        panelEstilistaJose.setLayout(panelEstilistaJoseLayout);
        panelEstilistaJoseLayout.setHorizontalGroup(
            panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstilistaJoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstilistaJoseLayout.createSequentialGroup()
                        .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15))
                            .addComponent(jLabel17)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEstilistaJoseLayout.createSequentialGroup()
                                .addComponent(cantidadCortesCaballeroJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(corteCaballeroJose))
                            .addComponent(cantidadTinturaCabelloJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEstilistaJoseLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cantidadCortesDamaJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadPeinadoJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corteDamaJose)
                            .addComponent(tinturaCabelloJose)
                            .addComponent(peinadoJose)))
                    .addGroup(panelEstilistaJoseLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServiciosJose))
                    .addGroup(panelEstilistaJoseLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalRecaudoJose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstilistaJoseLayout.setVerticalGroup(
            panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstilistaJoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cantidadCortesCaballeroJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corteCaballeroJose))
                .addGap(6, 6, 6)
                .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cantidadCortesDamaJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corteDamaJose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cantidadTinturaCabelloJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tinturaCabelloJose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(cantidadPeinadoJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(peinadoJose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(totalServiciosJose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaJoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(totalRecaudoJose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEstilistaLucrecia.setBackground(new java.awt.Color(204, 255, 204));
        panelEstilistaLucrecia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cantidadCortesDamaLucrecia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadCortesDamaLucrecia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadCortesDamaLucreciaStateChanged(evt);
            }
        });

        totalServiciosLucrecia.setText("0");

        cantidadTinturaCabelloLucrecia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadTinturaCabelloLucrecia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadTinturaCabelloLucreciaStateChanged(evt);
            }
        });

        totalRecaudoLucrecia.setText("$ 0.00");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Corte Caballero:");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Corte Dama:");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tintura Cabello:");

        cantidadPeinadoLucrecia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadPeinadoLucrecia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadPeinadoLucreciaStateChanged(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Peinado:");

        corteCaballeroLucrecia.setText("$ 0.00");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Total Servicios:");

        corteDamaLucrecia.setText("$ 0.00");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Total Recaudo:");

        tinturaCabelloLucrecia.setText("$ 0.00");

        cantidadCortesCaballeroLucrecia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cantidadCortesCaballeroLucrecia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadCortesCaballeroLucreciaStateChanged(evt);
            }
        });

        peinadoLucrecia.setText("$ 0.00");

        javax.swing.GroupLayout panelEstilistaLucreciaLayout = new javax.swing.GroupLayout(panelEstilistaLucrecia);
        panelEstilistaLucrecia.setLayout(panelEstilistaLucreciaLayout);
        panelEstilistaLucreciaLayout.setHorizontalGroup(
            panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstilistaLucreciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstilistaLucreciaLayout.createSequentialGroup()
                        .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel21))
                            .addComponent(jLabel23)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadCortesCaballeroLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(corteCaballeroLucrecia))
                    .addGroup(panelEstilistaLucreciaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cantidadCortesDamaLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadTinturaCabelloLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadPeinadoLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corteDamaLucrecia)
                            .addComponent(tinturaCabelloLucrecia)
                            .addComponent(peinadoLucrecia)))
                    .addGroup(panelEstilistaLucreciaLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalServiciosLucrecia))
                    .addGroup(panelEstilistaLucreciaLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalRecaudoLucrecia)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstilistaLucreciaLayout.setVerticalGroup(
            panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstilistaLucreciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cantidadCortesCaballeroLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corteCaballeroLucrecia))
                .addGap(6, 6, 6)
                .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cantidadCortesDamaLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corteDamaLucrecia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cantidadTinturaCabelloLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tinturaCabelloLucrecia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(cantidadPeinadoLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(peinadoLucrecia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(totalServiciosLucrecia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstilistaLucreciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(totalRecaudoLucrecia)))
        );

        jButton2.setText("Registrar Anita");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar Roberto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Registrar Jose");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Registrar Lucrecia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Iniciar Dia");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(panelEstilistaAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEstilistaJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(275, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEstilistaRoberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelEstilistaLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(12, 12, 12)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelEstilistaJose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEstilistaAna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEstilistaRoberto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEstilistaLucrecia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        panelEstilistaRoberto.getAccessibleContext().setAccessibleName("");
        panelEstilistaAna.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadPeinadoRobertoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadPeinadoRobertoStateChanged
        estilistaRoberto.calcularPrecioPeinado();
        
        
    }//GEN-LAST:event_cantidadPeinadoRobertoStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventana2.nuevoFrame = new ventana2();
       nuevoFrame.setVisible(true);
       
        a = Double.parseDouble(String.valueOf( Total.calcular(totalRecaudoAna, totalRecaudoJose, totalRecaudoRoberto, totalRecaudoLucrecia)));
       

    
    
       
    }//GEN-LAST:event_jButton1ActionPerformed

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    private void cantidadCortesCaballeroRobertoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadCortesCaballeroRobertoStateChanged
        estilistaRoberto.calcularPrecioCorteCaballero();
    }//GEN-LAST:event_cantidadCortesCaballeroRobertoStateChanged

    private void cantidadCortesDamaRobertoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadCortesDamaRobertoStateChanged
        estilistaRoberto.calcularPrecioCorteDama();
    }//GEN-LAST:event_cantidadCortesDamaRobertoStateChanged

    private void cantidadTinturaCabelloRobertoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadTinturaCabelloRobertoStateChanged
        estilistaRoberto.calcularPrecioTinturaCabello();
    }//GEN-LAST:event_cantidadTinturaCabelloRobertoStateChanged

    private void cantidadCortesDamaAnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadCortesDamaAnaStateChanged
        estilistaAna.calcularPrecioCorteDama();
    }//GEN-LAST:event_cantidadCortesDamaAnaStateChanged

    private void cantidadTinturaCabelloAnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadTinturaCabelloAnaStateChanged
        estilistaAna.calcularPrecioTinturaCabello();
    }//GEN-LAST:event_cantidadTinturaCabelloAnaStateChanged

    private void cantidadPeinadoAnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadPeinadoAnaStateChanged
        estilistaAna.calcularPrecioPeinado();
    }//GEN-LAST:event_cantidadPeinadoAnaStateChanged

    private void cantidadCortesCaballeroAnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadCortesCaballeroAnaStateChanged
        estilistaAna.calcularPrecioCorteCaballero();
    }//GEN-LAST:event_cantidadCortesCaballeroAnaStateChanged

    private void cantidadCortesDamaJoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadCortesDamaJoseStateChanged
        estilistaJose.calcularPrecioCorteDama();
    }//GEN-LAST:event_cantidadCortesDamaJoseStateChanged

    private void cantidadTinturaCabelloJoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadTinturaCabelloJoseStateChanged
        estilistaJose.calcularPrecioTinturaCabello();
    }//GEN-LAST:event_cantidadTinturaCabelloJoseStateChanged

    private void cantidadPeinadoJoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadPeinadoJoseStateChanged
        estilistaJose.calcularPrecioPeinado();
    }//GEN-LAST:event_cantidadPeinadoJoseStateChanged

    private void cantidadCortesCaballeroJoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadCortesCaballeroJoseStateChanged
        estilistaJose.calcularPrecioCorteCaballero();
    }//GEN-LAST:event_cantidadCortesCaballeroJoseStateChanged

    private void cantidadCortesDamaLucreciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadCortesDamaLucreciaStateChanged
        estilistaLucrecia.calcularPrecioCorteDama();
    }//GEN-LAST:event_cantidadCortesDamaLucreciaStateChanged

    private void cantidadTinturaCabelloLucreciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadTinturaCabelloLucreciaStateChanged
        estilistaLucrecia.calcularPrecioTinturaCabello();
    }//GEN-LAST:event_cantidadTinturaCabelloLucreciaStateChanged

    private void cantidadPeinadoLucreciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadPeinadoLucreciaStateChanged
        estilistaLucrecia.calcularPrecioPeinado();
    }//GEN-LAST:event_cantidadPeinadoLucreciaStateChanged

    private void cantidadCortesCaballeroLucreciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadCortesCaballeroLucreciaStateChanged
        estilistaLucrecia.calcularPrecioCorteCaballero();
    }//GEN-LAST:event_cantidadCortesCaballeroLucreciaStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        estilistaAna.totalServicios();
        estilistaAna.totalRecaudo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        estilistaRoberto.totalServicios();
        estilistaRoberto.totalRecaudo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        estilistaJose.totalServicios();
        estilistaJose.totalRecaudo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        estilistaLucrecia.totalServicios();
        estilistaLucrecia.totalRecaudo();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void corteCaballeroRobertoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_corteCaballeroRobertoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_corteCaballeroRobertoComponentHidden

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        estilistaAna.iniciarDia();
        estilistaJose.iniciarDia();
        estilistaLucrecia.iniciarDia();
        estilistaRoberto.iniciarDia();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();

    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame.create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner cantidadCortesCaballeroAna;
    private javax.swing.JSpinner cantidadCortesCaballeroJose;
    private javax.swing.JSpinner cantidadCortesCaballeroLucrecia;
    private javax.swing.JSpinner cantidadCortesCaballeroRoberto;
    private javax.swing.JSpinner cantidadCortesDamaAna;
    private javax.swing.JSpinner cantidadCortesDamaJose;
    private javax.swing.JSpinner cantidadCortesDamaLucrecia;
    private javax.swing.JSpinner cantidadCortesDamaRoberto;
    private javax.swing.JSpinner cantidadPeinadoAna;
    private javax.swing.JSpinner cantidadPeinadoJose;
    private javax.swing.JSpinner cantidadPeinadoLucrecia;
    private javax.swing.JSpinner cantidadPeinadoRoberto;
    private javax.swing.JSpinner cantidadTinturaCabelloAna;
    private javax.swing.JSpinner cantidadTinturaCabelloJose;
    private javax.swing.JSpinner cantidadTinturaCabelloLucrecia;
    private javax.swing.JSpinner cantidadTinturaCabelloRoberto;
    private javax.swing.JLabel corteCaballeroAna;
    private javax.swing.JLabel corteCaballeroJose;
    private javax.swing.JLabel corteCaballeroLucrecia;
    private javax.swing.JLabel corteCaballeroRoberto;
    private javax.swing.JLabel corteDamaAna;
    private javax.swing.JLabel corteDamaJose;
    private javax.swing.JLabel corteDamaLucrecia;
    private javax.swing.JLabel corteDamaRoberto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JPanel panelEstilistaAna;
    private javax.swing.JPanel panelEstilistaJose;
    private javax.swing.JPanel panelEstilistaLucrecia;
    private javax.swing.JPanel panelEstilistaRoberto;
    private javax.swing.JLabel peinadoAna;
    private javax.swing.JLabel peinadoJose;
    private javax.swing.JLabel peinadoLucrecia;
    private javax.swing.JLabel peinadoRoberto;
    private javax.swing.JLabel tinturaCabelloAna;
    private javax.swing.JLabel tinturaCabelloJose;
    private javax.swing.JLabel tinturaCabelloLucrecia;
    private javax.swing.JLabel tinturaCabelloRoberto;
    private javax.swing.JLabel totalRecaudoAna;
    private javax.swing.JLabel totalRecaudoJose;
    private javax.swing.JLabel totalRecaudoLucrecia;
    private javax.swing.JLabel totalRecaudoRoberto;
    private javax.swing.JLabel totalServiciosAna;
    private javax.swing.JLabel totalServiciosJose;
    private javax.swing.JLabel totalServiciosLucrecia;
    private javax.swing.JLabel totalServiciosRoberto;
    // End of variables declaration//GEN-END:variables

    public Double monedaD(String precio) {

        String cleanedPrecio = precio.replaceAll("[^\\d.]", "");
        return Double.valueOf(cleanedPrecio);
    }
}
