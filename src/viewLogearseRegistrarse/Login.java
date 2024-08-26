package viewLogearseRegistrarse;

import controller.Usuario;
import controller.implement.Item;
import controller.implement.Room;
import controller.services.ServicesItem;
import controller.services.ServicesRoom;
import controller.services.ServicesUsuario;
import java.awt.Color;
import javafx.application.Platform;
import view.Menu;

/**
 *
 * @author julia
 */
public class Login extends javax.swing.JFrame {
    private Menu menu;
    private String usuario;
    public Login() {
        initComponents();   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panelVerde = new javax.swing.JPanel();
        textoRoomade = new javax.swing.JLabel();
        textoSlogan = new javax.swing.JLabel();
        panelInteriorCafe = new javax.swing.JPanel();
        BotonRegistro = new javax.swing.JButton();
        TextNuevoNombre = new javax.swing.JTextField();
        TextNuevoUsuario = new javax.swing.JTextField();
        TextConfirmNuevaContra = new javax.swing.JTextField();
        TextNuevoCorreo = new javax.swing.JTextField();
        TextNuevaContra = new javax.swing.JTextField();
        textoRegistrarse = new javax.swing.JLabel();
        panelCafe = new javax.swing.JPanel();
        textoIniciarSesion = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        BotonLogin = new javax.swing.JButton();
        TextContraseña = new javax.swing.JPasswordField();
        roomadeIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVerde.setBackground(new java.awt.Color(126, 188, 137));

        textoRoomade.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        textoRoomade.setForeground(new java.awt.Color(255, 245, 255));
        textoRoomade.setText("ROOMADE");

        textoSlogan.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        textoSlogan.setForeground(new java.awt.Color(255, 245, 255));
        textoSlogan.setText("¡Tu morada es nuestra inspiración!, ademas transforma tu interior :).");

        panelInteriorCafe.setBackground(new java.awt.Color(245, 245, 220));

        BotonRegistro.setBackground(new java.awt.Color(210, 180, 140));
        BotonRegistro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        BotonRegistro.setForeground(new java.awt.Color(255, 245, 255));
        BotonRegistro.setText("Registrar");
        BotonRegistro.setBorder(null);
        BotonRegistro.setBorderPainted(false);
        BotonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });

        TextNuevoNombre.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextNuevoNombre.setForeground(new java.awt.Color(204, 204, 204));
        TextNuevoNombre.setText("Nombre Completo");
        TextNuevoNombre.setBorder(null);
        TextNuevoNombre.setCaretColor(new java.awt.Color(204, 204, 204));
        TextNuevoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNuevoNombreMousePressed(evt);
            }
        });
        TextNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNuevoNombreActionPerformed(evt);
            }
        });

        TextNuevoUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextNuevoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TextNuevoUsuario.setText("Nuevo Usuario");
        TextNuevoUsuario.setBorder(null);
        TextNuevoUsuario.setCaretColor(new java.awt.Color(204, 204, 204));
        TextNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNuevoUsuarioMousePressed(evt);
            }
        });
        TextNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNuevoUsuarioActionPerformed(evt);
            }
        });

        TextConfirmNuevaContra.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextConfirmNuevaContra.setForeground(new java.awt.Color(204, 204, 204));
        TextConfirmNuevaContra.setText("Confirmar Contraseña");
        TextConfirmNuevaContra.setBorder(null);
        TextConfirmNuevaContra.setCaretColor(new java.awt.Color(204, 204, 204));
        TextConfirmNuevaContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextConfirmNuevaContraMousePressed(evt);
            }
        });

        TextNuevoCorreo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextNuevoCorreo.setForeground(new java.awt.Color(204, 204, 204));
        TextNuevoCorreo.setText("Correo Electrónico");
        TextNuevoCorreo.setBorder(null);
        TextNuevoCorreo.setCaretColor(new java.awt.Color(204, 204, 204));
        TextNuevoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNuevoCorreoMousePressed(evt);
            }
        });

        TextNuevaContra.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextNuevaContra.setForeground(new java.awt.Color(204, 204, 204));
        TextNuevaContra.setText("Contraseña");
        TextNuevaContra.setBorder(null);
        TextNuevaContra.setCaretColor(new java.awt.Color(204, 204, 204));
        TextNuevaContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextNuevaContraMousePressed(evt);
            }
        });

        textoRegistrarse.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        textoRegistrarse.setForeground(new java.awt.Color(102, 102, 102));
        textoRegistrarse.setText("¿No tienes Usuario? Registrate:");

        javax.swing.GroupLayout panelInteriorCafeLayout = new javax.swing.GroupLayout(panelInteriorCafe);
        panelInteriorCafe.setLayout(panelInteriorCafeLayout);
        panelInteriorCafeLayout.setHorizontalGroup(
            panelInteriorCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteriorCafeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelInteriorCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInteriorCafeLayout.createSequentialGroup()
                        .addGroup(panelInteriorCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextConfirmNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelInteriorCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextNuevaContra, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextNuevoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                            .addGroup(panelInteriorCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BotonRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextNuevoCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                            .addComponent(TextNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelInteriorCafeLayout.setVerticalGroup(
            panelInteriorCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInteriorCafeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(textoRegistrarse)
                .addGap(18, 18, 18)
                .addComponent(TextNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextConfirmNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(BotonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout panelVerdeLayout = new javax.swing.GroupLayout(panelVerde);
        panelVerde.setLayout(panelVerdeLayout);
        panelVerdeLayout.setHorizontalGroup(
            panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeLayout.createSequentialGroup()
                .addGroup(panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVerdeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoRoomade)
                            .addComponent(textoSlogan)))
                    .addGroup(panelVerdeLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(panelInteriorCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelVerdeLayout.setVerticalGroup(
            panelVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerdeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(textoRoomade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSlogan)
                .addGap(18, 18, 18)
                .addComponent(panelInteriorCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        Background.add(panelVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        panelCafe.setBackground(new java.awt.Color(245, 245, 220));
        panelCafe.setToolTipText("");

        textoIniciarSesion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        textoIniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        textoIniciarSesion.setText("Iniciar Sesión:");

        TextUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        TextUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TextUsuario.setText("Usuario");
        TextUsuario.setBorder(null);
        TextUsuario.setCaretColor(new java.awt.Color(204, 204, 204));
        TextUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextUsuarioMousePressed(evt);
            }
        });
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });

        BotonLogin.setBackground(new java.awt.Color(210, 180, 140));
        BotonLogin.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        BotonLogin.setForeground(new java.awt.Color(255, 245, 255));
        BotonLogin.setText("Login");
        BotonLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });

        TextContraseña.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        TextContraseña.setForeground(new java.awt.Color(204, 204, 204));
        TextContraseña.setText("**********");
        TextContraseña.setToolTipText("");
        TextContraseña.setBorder(null);
        TextContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextContraseñaMousePressed(evt);
            }
        });
        TextContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextContraseñaActionPerformed(evt);
            }
        });

        roomadeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan_\\Downloads\\logorealfinal (5).png")); // NOI18N

        javax.swing.GroupLayout panelCafeLayout = new javax.swing.GroupLayout(panelCafe);
        panelCafe.setLayout(panelCafeLayout);
        panelCafeLayout.setHorizontalGroup(
            panelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCafeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCafeLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoIniciarSesion)
                            .addGroup(panelCafeLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(roomadeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelCafeLayout.setVerticalGroup(
            panelCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCafeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(roomadeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        Background.add(panelCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 300, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void TextContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextContraseñaActionPerformed

    private void TextUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextUsuarioMousePressed
        if(TextUsuario.getText().equals("Usuario")){
            TextUsuario.setText("");
            TextUsuario.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextUsuarioMousePressed

    private void TextContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextContraseñaMousePressed
        if(String.valueOf(TextContraseña.getPassword()).equals("**********")){
            TextContraseña.setText("");
            TextContraseña.setForeground(Color.black);
        }
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
        
    }//GEN-LAST:event_TextContraseñaMousePressed

    private void TextNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNuevoNombreActionPerformed

    private void TextNuevoNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNuevoNombreMousePressed
        if(TextNuevoNombre.getText().equals("Nombre Completo")){
            TextNuevoNombre.setText("");
            TextNuevoNombre.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextNuevoNombreMousePressed

    private void TextNuevoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNuevoUsuarioMousePressed
        if(TextNuevoUsuario.getText().equals("Nuevo Usuario")){
            TextNuevoUsuario.setText("");
            TextNuevoUsuario.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextNuevoUsuarioMousePressed

    private void TextConfirmNuevaContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextConfirmNuevaContraMousePressed
        if(TextConfirmNuevaContra.getText().equals("Confirmar Contraseña")){
            TextConfirmNuevaContra.setText("");
            TextConfirmNuevaContra.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextConfirmNuevaContraMousePressed

    private void TextNuevoCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNuevoCorreoMousePressed
        if(TextNuevoCorreo.getText().equals("Correo Electrónico")){
            TextNuevoCorreo.setText("");
            TextNuevoCorreo.setForeground(Color.black);
        }
        
        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }
        
        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }
        
        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }
        
        if(TextNuevaContra.getText().equals("")){
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }
        
    }//GEN-LAST:event_TextNuevoCorreoMousePressed

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        ServicesUsuario servUsuario = new ServicesUsuario();
        if(TextNuevaContra.getText().equals(TextConfirmNuevaContra.getText())){
            Usuario newuser = new Usuario(TextNuevoUsuario.getText(), TextNuevaContra.getText(), TextNuevoCorreo.getText(), TextNuevoNombre.getText());
            servUsuario.guardar_usuario(newuser);
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario Registrado!");
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
            TextNuevaContra.setText("Contraseña");
            TextNuevaContra.setForeground(Color.lightGray);
        }
        
        
    }//GEN-LAST:event_BotonRegistroActionPerformed

    private void TextNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNuevoUsuarioActionPerformed

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed
        ServicesUsuario servUsuario = new ServicesUsuario();
        ServicesItem servItem= new ServicesItem();
        ServicesRoom servRoom= new ServicesRoom();
        if(servUsuario.Info_UsuarioLogin(TextUsuario.getText(), String.valueOf(TextContraseña.getPassword()))){
            String usuario= TextUsuario.getText();
            ServicesUsuario.setUsuario(usuario);
            javax.swing.JOptionPane.showMessageDialog(this, "Sesión Iniciada");
            menu = new Menu();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            this.dispose();
            for (Item itemsitos: servItem.getItemsByUsuario(ServicesUsuario.getUsuario())){
            ServicesItem.setItems(itemsitos);
            }
            for (Room romsitos: servRoom.getRoomsByUsuario(ServicesUsuario.getUsuario())){
                ServicesRoom.setRooms(romsitos);
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrectos. ");
        }
        Platform.startup(() -> {});
    }//GEN-LAST:event_BotonLoginActionPerformed

    private void TextNuevaContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextNuevaContraMousePressed
        if(TextNuevaContra.getText().equals("Contraseña")){
            TextNuevaContra.setText("");
            TextNuevaContra.setForeground(Color.black);
        }

        if(String.valueOf(TextContraseña.getPassword()).isEmpty()){
            TextContraseña.setText("**********");
            TextContraseña.setForeground(Color.lightGray);
        }

        if(TextUsuario.getText().equals("")){
            TextUsuario.setText("Usuario");
            TextUsuario.setForeground(Color.lightGray);
        }

        if(TextNuevoNombre.getText().equals("")){
            TextNuevoNombre.setText("Nombre Completo");
            TextNuevoNombre.setForeground(Color.lightGray);
        }

        if(TextNuevoUsuario.getText().equals("")){
            TextNuevoUsuario.setText("Nuevo Usuario");
            TextNuevoUsuario.setForeground(Color.lightGray);
        }

        if(TextConfirmNuevaContra.getText().equals("")){
            TextConfirmNuevaContra.setText("Confirmar Contraseña");
            TextConfirmNuevaContra.setForeground(Color.lightGray);
        }

        if(TextNuevoCorreo.getText().equals("")){
            TextNuevoCorreo.setText("Correo Electrónico");
            TextNuevoCorreo.setForeground(Color.lightGray);
        }

    }//GEN-LAST:event_TextNuevaContraMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JTextField TextConfirmNuevaContra;
    private javax.swing.JPasswordField TextContraseña;
    private javax.swing.JTextField TextNuevaContra;
    private javax.swing.JTextField TextNuevoCorreo;
    private javax.swing.JTextField TextNuevoNombre;
    private javax.swing.JTextField TextNuevoUsuario;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JPanel panelCafe;
    private javax.swing.JPanel panelInteriorCafe;
    private javax.swing.JPanel panelVerde;
    private javax.swing.JLabel roomadeIcon;
    private javax.swing.JLabel textoIniciarSesion;
    private javax.swing.JLabel textoRegistrarse;
    private javax.swing.JLabel textoRoomade;
    private javax.swing.JLabel textoSlogan;
    // End of variables declaration//GEN-END:variables
}
