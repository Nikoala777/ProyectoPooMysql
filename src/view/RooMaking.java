package view;

/**
 *
 * @author julia
 */

import controller.services.ServicesJavaFX;
import view.JavaFX.RooMakingJFX3D;
import java.awt.BorderLayout;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;

public class RooMaking extends javax.swing.JFrame {
    
    private JFXPanel fxPanel;

    public RooMaking() {

        initComponents(); // Inicializa los componentes de Swing
        initFXPanel(); // Inicializa el JFXPanel y agrega la escena de JavaFX
    }
    
    private void initFXPanel() {
        // Inicializa el JFXPanel
        fxPanel = new JFXPanel();
        javaFXPanel.setLayout(new BorderLayout());
        javaFXPanel.add(fxPanel, BorderLayout.CENTER);  // Añade el JFXPanel al contenedor Swing

        // Crea la escena JavaFX en el hilo de JavaFX
        Platform.runLater(() -> {
            try {
                RooMakingJFX3D app = new RooMakingJFX3D();
                Scene scene = app.createScene();
                fxPanel.setScene(scene);  // Establece la escena en el JFXPanel
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
    
    @Override
    public void dispose() {
        // Limpia todo antes de cerrar la ventana para evitar problemas al volver a abrir
        Platform.runLater(() -> {
            fxPanel.setScene(null);
            javaFXPanel.removeAll();
        });
        super.dispose();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolver = new javax.swing.JButton();
        javaFXPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout javaFXPanelLayout = new javax.swing.GroupLayout(javaFXPanel);
        javaFXPanel.setLayout(javaFXPanelLayout);
        javaFXPanelLayout.setHorizontalGroup(
            javaFXPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        javaFXPanelLayout.setVerticalGroup(
            javaFXPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(javaFXPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(471, Short.MAX_VALUE)
                        .addComponent(botonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(javaFXPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed

        Platform.runLater(() -> {
            fxPanel.setScene(null);  // Limpia la escena actual
            fxPanel.removeAll();     // Remueve todos los componentes
        });
        setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel javaFXPanel;
    // End of variables declaration//GEN-END:variables
}