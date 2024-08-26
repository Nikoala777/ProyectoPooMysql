package view;

import java.awt.Color;
import viewConfiguracion.ConfiguracionView;
import viewLogearseRegistrarse.Login;

/**
 *
 * @author Grupo RooMade
 */
public class Menu extends javax.swing.JFrame {
    private CrearDiseño PaginaDiseño;
    private Login login;
    private MisDiseños misDiseños;
    private RooMakingPreSet rooMakingPreSet;
    private ConfiguracionView configuracion;
    
    public Menu(){
        initComponents();
    }        
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        CrearDiseño = new javax.swing.JButton();
        MisDiseños = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RooMaking = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextComentar = new javax.swing.JTextArea();
        Comentar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        Ayuda = new javax.swing.JButton();
        Configuracion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(125, 194, 160));

        CrearDiseño.setBackground(new java.awt.Color(245, 245, 220));
        CrearDiseño.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        CrearDiseño.setForeground(new java.awt.Color(102, 102, 102));
        CrearDiseño.setText("Crear Diseño");
        CrearDiseño.setBorder(null);
        CrearDiseño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearDiseño.setOpaque(true);
        CrearDiseño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearDiseñoActionPerformed(evt);
            }
        });

        MisDiseños.setBackground(new java.awt.Color(245, 245, 220));
        MisDiseños.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        MisDiseños.setForeground(new java.awt.Color(102, 102, 102));
        MisDiseños.setText("Mis Diseños");
        MisDiseños.setBorder(null);
        MisDiseños.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MisDiseños.setOpaque(true);
        MisDiseños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisDiseñosActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(162, 217, 206));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        RooMaking.setBackground(new java.awt.Color(162, 217, 206));
        RooMaking.setFont(new java.awt.Font("Roboto Black", 2, 36)); // NOI18N
        RooMaking.setForeground(new java.awt.Color(242, 242, 242));
        RooMaking.setText("RooMaking");
        RooMaking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RooMaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RooMakingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(CrearDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(MisDiseños, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(RooMaking, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearDiseño, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MisDiseños, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(RooMaking, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 370));

        jPanel5.setBackground(new java.awt.Color(245, 245, 220));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Comentarios:  (Nos esforzaremos en leerlos todos <3 ) ");

        TextComentar.setColumns(20);
        TextComentar.setForeground(new java.awt.Color(204, 204, 204));
        TextComentar.setRows(5);
        TextComentar.setText("(Ingresa cualquier critcia, opinion o felicitaciones que tengas de la app hacia nosotros).");
        TextComentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextComentarMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TextComentar);

        Comentar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Comentar.setForeground(new java.awt.Color(153, 153, 153));
        Comentar.setText("Comentar");
        Comentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(Comentar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comentar)
                .addGap(18, 18, 18))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 590, 150));

        jPanel4.setBackground(new java.awt.Color(162, 217, 206));

        jPanel7.setBackground(new java.awt.Color(245, 245, 220));

        Salir.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(153, 153, 153));
        Salir.setText("Salir");
        Salir.setDefaultCapable(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Ayuda.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Ayuda.setForeground(new java.awt.Color(153, 153, 153));
        Ayuda.setText("Ayuda");

        Configuracion.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Configuracion.setForeground(new java.awt.Color(153, 153, 153));
        Configuracion.setText("Configuración");
        Configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Configuracion.setDefaultCapable(false);
        Configuracion.setOpaque(false);
        Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Configuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(Ayuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(Configuracion)
                .addGap(18, 18, 18)
                .addComponent(Ayuda)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan_\\Downloads\\logorealfinal (5).png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 210, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearDiseñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearDiseñoActionPerformed
        PaginaDiseño = new CrearDiseño();
        PaginaDiseño.setVisible(true);
        PaginaDiseño.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_CrearDiseñoActionPerformed

    private void MisDiseñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MisDiseñosActionPerformed
        misDiseños = new MisDiseños();
        misDiseños.setVisible(true);
        misDiseños.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_MisDiseñosActionPerformed

    private void ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionActionPerformed
        configuracion = new ConfiguracionView();
        configuracion.setVisible(true);
        configuracion.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_ConfiguracionActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        login  = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_SalirActionPerformed

    private void RooMakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RooMakingActionPerformed
        rooMakingPreSet = new RooMakingPreSet();
        rooMakingPreSet.setVisible(true);
        rooMakingPreSet.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_RooMakingActionPerformed

    private void ComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentarActionPerformed
        if(TextComentar.getText().equals("")){
            TextComentar.setForeground(new java.awt.Color(204, 204, 204));
            TextComentar.setText("(Ingresa cualquier critcia, opinion o felicitaciones que tengas de la app hacia nosotros).");
        }
    }//GEN-LAST:event_ComentarActionPerformed

    private void TextComentarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextComentarMousePressed
        if(TextComentar.getText().equals("(Ingresa cualquier critcia, opinion o felicitaciones que tengas de la app hacia nosotros).")){
            TextComentar.setText("");
            TextComentar.setForeground(Color.black);
        }
    }//GEN-LAST:event_TextComentarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ayuda;
    private javax.swing.JButton Comentar;
    private javax.swing.JButton Configuracion;
    private javax.swing.JButton CrearDiseño;
    private javax.swing.JButton MisDiseños;
    private javax.swing.JButton RooMaking;
    private javax.swing.JButton Salir;
    private javax.swing.JTextArea TextComentar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
