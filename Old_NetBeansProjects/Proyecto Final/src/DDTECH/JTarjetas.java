package DDTECH;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JTarjetas extends javax.swing.JFrame {

    Pila Valoracione;
    Lista Queja;
    Pila Tarjeta;
    Lista Producto;
    Pila Datos;

    ImagenFondo Fondo;

    public JTarjetas(Pila valoracione,Lista queja,Pila tarjeta,Lista producto,Pila dato) {

        Fondo = new  ImagenFondo("src/Imagenes/rob.jpg");
        this.setContentPane(Fondo);

        initComponents();

        this.Valoracione = valoracione;
        this.Queja = queja;
        this.Tarjeta = tarjeta;
        this.Producto = producto;
        this.Datos = dato;
    
    }

    public Image getIconImage(){

    Image valorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logoG.jpeg"));
    return valorRetorno;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Borrar = new javax.swing.JButton();
        Postal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Pago = new javax.swing.JComboBox<>();
        Entrega = new javax.swing.JComboBox<>();
        Trans = new javax.swing.JComboBox<>();
        TipoT = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarjetas");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu para optencion de Tarjetas");
        jLabel1.setToolTipText("");

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificado.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de entrega:");

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backspace.png"))); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo Postal:");
        jLabel5.setToolTipText("");

        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de pago:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de tarjeta:");

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Postal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Postal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PostalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PostalMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Caducidad de Tarjeta:");

        Pago.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Credito", "Debito" }));
        Pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Entrega.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Entrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Domicilio", "Cajas" }));
        Entrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Trans.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Trans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "3 Meses", "6 Meses", "9 Meses", "12 Meses", "18 Meses" }));
        Trans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TipoT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TipoT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Basica", "Normal", "Delux", "Sin Limites", "Cola Dorada", "ZorroCalipsis" }));
        TipoT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addGap(27, 27, 27)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Postal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Trans, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TipoT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TipoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Postal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(561, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
    int valor;

    ImageIcon icono = new ImageIcon("src/Imagenes/informacion.png");
    valor = JOptionPane.showConfirmDialog(this, "¿Quieres salir?", "Regresando al Menu Principal...", JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, icono);

        if(valor == 0){

        MenuPrincipal Menu = new MenuPrincipal(Valoracione,Queja,Tarjeta,Producto,Datos);
        Menu.setVisible(true);
        this.setVisible(false);

        }else{

        ImageIcon icono2 = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Regresando al Programa", "Cancelando. . .", JOptionPane.WARNING_MESSAGE, icono2);

        }
    }//GEN-LAST:event_RegresarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Tarjeta.eliminar();
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Se a eliminado los datos correctamente", "Eliminado...", JOptionPane.WARNING_MESSAGE, icono);
    }//GEN-LAST:event_BorrarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        TipoT.setSelectedIndex(0);
        Trans.setSelectedIndex(0);
        Entrega.setSelectedIndex(0);
        Postal.setText("");
        Pago.setSelectedIndex(0);
        requestFocus();
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Campos Limpiados", "Limpiando...", JOptionPane.WARNING_MESSAGE, icono);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
            Tarjetas Tra = new Tarjetas();
            Tra.setTarjeta(TipoT.getSelectedItem().toString());
            Tra.setTransacción(Trans.getSelectedItem().toString());
            Tra.setEntregaT(Entrega.getSelectedItem().toString());
            Tra.setCodigoP(Integer.parseInt(Postal.getText()));
            Tra.setPagoT(Pago.getSelectedItem().toString());

                ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
                JOptionPane.showMessageDialog(null, "Datos Guardados", "Guardando...", JOptionPane.WARNING_MESSAGE, icono);
                Tarjeta.push(Tra);
    }//GEN-LAST:event_AgregarActionPerformed

    private void PostalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostalMouseEntered
        Postal.setBackground(Color.lightGray);
    }//GEN-LAST:event_PostalMouseEntered

    private void PostalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostalMouseExited
        Postal.setBackground(Color.white);
    }//GEN-LAST:event_PostalMouseExited

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
            java.util.logging.Logger.getLogger(JTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTarjetas(null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Borrar;
    private javax.swing.JComboBox<String> Entrega;
    private javax.swing.JButton Limpiar;
    private javax.swing.JComboBox<String> Pago;
    private javax.swing.JTextField Postal;
    private javax.swing.JButton Regresar;
    private javax.swing.JComboBox<String> TipoT;
    private javax.swing.JComboBox<String> Trans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
