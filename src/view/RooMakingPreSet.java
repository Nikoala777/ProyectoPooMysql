package view;

import controller.implement.Item;
import controller.implement.Room;
import controller.services.ServicesJavaFX;
import controller.services.ServicesItem;
import controller.services.ServicesRoom;
import controller.services.ServicesUsuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julia
 */
public class RooMakingPreSet extends javax.swing.JFrame {

    List<Item> itemSeleccionados = new ArrayList<>();
    Room roomSeleccionado;
    public RooMakingPreSet() {
        initComponents();
        itemSeleccionados.clear();
        roomSeleccionado= null;
        ServicesJavaFX.setItemsSeleccionados(itemSeleccionados);
        ServicesJavaFX.setRoomSeleccionada(roomSeleccionado);
        DefaultTableModel tablaRooms = (DefaultTableModel) tablaMostrarRooms.getModel();
        tablaRooms.setRowCount(0);
        for (Room room : ServicesRoom.getRooms()) {
            tablaRooms.addRow(new Object[]{
                ServicesUsuario.getUsuario(),
                room.getNombreObjeto(),
                room.getBase(),
                room.getAltura(),
                room.getProfundidad(),
                "No aplica"
            });
        }
        DefaultTableModel tablaItems = (DefaultTableModel) tablaMostrarItems.getModel();
        tablaItems.setRowCount(0);
        for (Item item : ServicesItem.getItems()) {
            tablaItems.addRow(new Object[]{
                ServicesUsuario.getUsuario(),
                item.getNombreObjeto(),
                item.getBase(),
                item.getAltura(),
                item.getProfundidad(),
                "No aplica"
            });

        tablaMostrarItems.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Agregar MouseListener para la selección/deselección con un clic
        tablaMostrarItems.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tablaMostrarItems.rowAtPoint(e.getPoint());
                if (row != -1) {
                    if (tablaMostrarItems.isRowSelected(row)) {
                        tablaMostrarItems.removeRowSelectionInterval(row, row);
                    } else {
                        tablaMostrarItems.addRowSelectionInterval(row, row);
                    }
                }
            }
        });

        // Personalizar el renderer para cambiar el color de las filas seleccionadas
        tablaMostrarItems.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (isSelected) {
                    cellComponent.setBackground(Color.LIGHT_GRAY);
                } else {
                    cellComponent.setBackground(Color.WHITE);
                }
                return cellComponent;
            }
        });

        // Obtener y guardar los animales seleccionados
        tablaMostrarItems.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) {
                itemSeleccionados.clear();
                int[] selectedRows = tablaMostrarItems.getSelectedRows();
                for (int rowIndex : selectedRows) {
                    String nombreObjeto = (String) tablaItems.getValueAt(rowIndex, 1);  // Columna 1: nombre del objeto
                    double base = (Double) tablaItems.getValueAt(rowIndex, 2);
                    double altura = (Double) tablaItems.getValueAt(rowIndex, 3);
                    double profundidad = (Double) tablaItems.getValueAt(rowIndex, 4);

                    // Buscar el objeto en tu colección usando estos valores
                    for (Item items : ServicesItem.getItems()) {
                        if (items.getNombreObjeto().equals(nombreObjeto) &&
                            items.getBase() == base &&
                            items.getAltura() == altura &&
                            items.getProfundidad() == profundidad) {

                            itemSeleccionados.add(items);
                            ServicesJavaFX.setItemsSeleccionados(itemSeleccionados);
                            break;  // Salir del loop interno una vez que el item es encontrado
                        }
                    }
                }
            }
        });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panelDiseños = new javax.swing.JPanel();
        textoDiseños = new javax.swing.JLabel();
        scrollTabla = new javax.swing.JScrollPane();
        tablaMostrarRooms = new javax.swing.JTable();
        botonVolver = new javax.swing.JButton();
        roomsText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scrollTabla1 = new javax.swing.JScrollPane();
        tablaMostrarItems = new javax.swing.JTable();
        botonRooMade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(245, 245, 220));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDiseños.setBackground(new java.awt.Color(126, 188, 137));

        textoDiseños.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        textoDiseños.setForeground(new java.awt.Color(255, 245, 255));
        textoDiseños.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDiseños.setText("Mis Diseños");

        javax.swing.GroupLayout panelDiseñosLayout = new javax.swing.GroupLayout(panelDiseños);
        panelDiseños.setLayout(panelDiseñosLayout);
        panelDiseñosLayout.setHorizontalGroup(
            panelDiseñosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñosLayout.createSequentialGroup()
                .addComponent(textoDiseños, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDiseñosLayout.setVerticalGroup(
            panelDiseñosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoDiseños, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        mainPanel.add(panelDiseños, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        tablaMostrarRooms.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        tablaMostrarRooms.setForeground(new java.awt.Color(102, 102, 102));
        tablaMostrarRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Room", "Base", "Altura", "Profundidad", "# De Objetos"
            }
        ));
        tablaMostrarRooms.setGridColor(new java.awt.Color(102, 102, 102));
        tablaMostrarRooms.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tablaMostrarRooms.setShowGrid(true);
        tablaMostrarRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMostrarRoomsMouseClicked(evt);
            }
        });
        scrollTabla.setViewportView(tablaMostrarRooms);

        mainPanel.add(scrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 660, 110));

        botonVolver.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(104, 104, 104));
        botonVolver.setText("Volver...");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        mainPanel.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        roomsText.setText("Elija la Room sobre la cual trabajará:");
        mainPanel.add(roomsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel1.setText("Elija los Items que le agregará:");
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        tablaMostrarItems.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        tablaMostrarItems.setForeground(new java.awt.Color(102, 102, 102));
        tablaMostrarItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Room", "Base", "Altura", "Profundidad", "# De Objetos"
            }
        ));
        tablaMostrarItems.setGridColor(new java.awt.Color(102, 102, 102));
        tablaMostrarItems.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tablaMostrarItems.setShowGrid(true);
        scrollTabla1.setViewportView(tablaMostrarItems);

        mainPanel.add(scrollTabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 660, 110));

        botonRooMade.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        botonRooMade.setForeground(new java.awt.Color(104, 104, 104));
        botonRooMade.setText("¡¡¡RooMade!!!");
        botonRooMade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRooMadeActionPerformed(evt);
            }
        });
        mainPanel.add(botonRooMade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonRooMadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRooMadeActionPerformed
        for(Item item: itemSeleccionados){
            System.out.println(item);
        }
        System.out.println(roomSeleccionado);
        RooMaking roomaking = new RooMaking();
        roomaking.setVisible(true);
        roomaking.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botonRooMadeActionPerformed

    private void tablaMostrarRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMostrarRoomsMouseClicked
        int row = tablaMostrarRooms.rowAtPoint(evt.getPoint());
        DefaultTableModel tablaRooms = (DefaultTableModel) tablaMostrarRooms.getModel();
                if (row != -1) {
                    String nombreObjeto = (String) tablaRooms.getValueAt(row, 1);
                    double base = (double) tablaRooms.getValueAt(row, 2);
                    double altura = (double) tablaRooms.getValueAt(row, 3);
                    double profundidad = (double) tablaRooms.getValueAt(row, 4);

                    // Buscar el objeto Room en tu lista
                    for (Room room : ServicesRoom.getRooms()) {
                        if (room.getNombreObjeto().equals(nombreObjeto) &&
                            room.getBase() == base &&
                            room.getAltura() == altura &&
                            room.getProfundidad() == profundidad) {

                            // Guardar el objeto Room en la variable estática
                            roomSeleccionado = room;
                            ServicesJavaFX.setRoomSeleccionada(roomSeleccionado);
                            break;
                        }
                    }
                }
    }//GEN-LAST:event_tablaMostrarRoomsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRooMade;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelDiseños;
    private javax.swing.JLabel roomsText;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JScrollPane scrollTabla1;
    private javax.swing.JTable tablaMostrarItems;
    private javax.swing.JTable tablaMostrarRooms;
    private javax.swing.JLabel textoDiseños;
    // End of variables declaration//GEN-END:variables
}
