/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.mdlVehiculo;

/**
 *
 * @author alsan
 */
public class frmVistaVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form vistaVehiculo
     */
    public frmVistaVehiculo() {
        initComponents();
        mostrar("");
        this.setLocationRelativeTo(null);
    }

    void ocultar_columnas() {
        tblListadoVehiculos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblListadoVehiculos.getColumnModel().getColumn(0).setMinWidth(0);
        tblListadoVehiculos.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    void mostrar(String buscar){
        try {
            DefaultTableModel modelo;
            //Inicializo el modelo de vehículo para acceder a la función mostrar
            mdlVehiculo func = new mdlVehiculo();
            modelo = func.mostrar(buscar);
            
            // agregamos el modelo a la tabla tblListadoVehiculos
            tblListadoVehiculos.setModel(modelo);
            ocultar_columnas();
            lblTotalRegistros.setText("Total Registros " + Integer.toString(func.totalregistros));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
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

        borderPanel1 = new components.BorderPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarVehiculo = new javax.swing.JTextField();
        borderPanel2 = new components.BorderPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadoVehiculos = new javax.swing.JTable();
        lblTotalRegistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        borderPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vehiculos"));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        borderPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblListadoVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblListadoVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadoVehiculosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblListadoVehiculosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblListadoVehiculos);

        lblTotalRegistros.setText("Total registros: ");

        javax.swing.GroupLayout borderPanel2Layout = new javax.swing.GroupLayout(borderPanel2);
        borderPanel2.setLayout(borderPanel2Layout);
        borderPanel2Layout.setHorizontalGroup(
            borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalRegistros)
                .addGap(268, 268, 268))
        );
        borderPanel2Layout.setVerticalGroup(
            borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalRegistros)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout borderPanel1Layout = new javax.swing.GroupLayout(borderPanel1);
        borderPanel1.setLayout(borderPanel1Layout);
        borderPanel1Layout.setHorizontalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(borderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        borderPanel1Layout.setVerticalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(borderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListadoVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoVehiculosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblListadoVehiculosMouseClicked

    private void tblListadoVehiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoVehiculosMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila = tblListadoVehiculos.getSelectedRow();
            String idV;
            String pla;
            String mar;
            String lin;
            String mod;
            String colo;

            idV = tblListadoVehiculos.getValueAt(fila, 0).toString();
            pla = tblListadoVehiculos.getValueAt(fila, 3).toString();
            mar = tblListadoVehiculos.getValueAt(fila, 4).toString();
            lin = tblListadoVehiculos.getValueAt(fila, 5).toString();
            mod = tblListadoVehiculos.getValueAt(fila, 6).toString();
            colo = tblListadoVehiculos.getValueAt(fila, 7).toString();
            
            /*
            * Para poder accedar estas variables desde otro formulario, debo modificar las variables del otro
            * formulario y colocarlas públicas y estaticas
            */
            frmCotizar.txtIdVehiculo.setText(idV);
            frmCotizar.txtPlaca.setText(pla);
            frmCotizar.txtMarca.setText(mar);
            frmCotizar.txtLinea.setText(lin);
            frmCotizar.txtModelo.setText(mod);
            frmCotizar.txtColor.setText(colo);
            
            this.dispose();

        }
    }//GEN-LAST:event_tblListadoVehiculosMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmVistaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVistaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVistaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVistaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVistaVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.BorderPanel borderPanel1;
    private components.BorderPanel borderPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTable tblListadoVehiculos;
    private javax.swing.JTextField txtBuscarVehiculo;
    // End of variables declaration//GEN-END:variables
}
