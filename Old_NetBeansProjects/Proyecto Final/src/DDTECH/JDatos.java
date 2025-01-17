package DDTECH;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JDatos extends javax.swing.JFrame {

    Pila Valoracione;
    Lista Queja;
    Pila Tarjeta;
    Lista Producto;
    Pila Datos;

    ImagenFondo Fondo;

    public JDatos(Pila valoracione,Lista queja,Pila tarjeta,Lista producto,Pila dato) {

        Fondo = new  ImagenFondo("src/Imagenes/ia-6.jpg");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NombreU = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Dominio = new javax.swing.JComboBox<>();
        Genero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu de ingreso de datos de Usuario");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Género:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de telefonico:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo electronico:");

        NombreU.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NombreU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NombreUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NombreUMouseExited(evt);
            }
        });

        Edad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Edad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EdadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EdadMouseExited(evt);
            }
        });

        Correo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CorreoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CorreoMouseExited(evt);
            }
        });

        Telefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TelefonoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TelefonoMouseExited(evt);
            }
        });

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificado.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backspace.png"))); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Dominio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Dominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dominio", "@gmail.com", "@hotmail.com", "@outlook.com", "@live.com" }));
        Dominio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Genero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Hombre", "Mujer", "Indeterminado", "Zorro" }));
        Genero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addGap(35, 35, 35)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(Regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Correo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Telefono))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Edad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(NombreU))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(NombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(561, 472));
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
        Datos.eliminar();
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Se a eliminado los datos correctamente", "Eliminado...", JOptionPane.WARNING_MESSAGE, icono);
    }//GEN-LAST:event_BorrarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        NombreU.setText("");
        Genero.setSelectedIndex(0);
        Edad.setText("");
        Telefono.setText("");
        Correo.setText("");
        Dominio.setSelectedIndex(0);
        requestFocus();
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Campos Limpiados", "Limpiando...", JOptionPane.WARNING_MESSAGE, icono);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
            Datos dato = new Datos();
            dato.setNombre(NombreU.getText());
            dato.setGénero(Genero.getSelectedItem().toString());
            dato.setEdad(Integer.parseInt(Edad.getText()));
            dato.setTelefono(Integer.parseInt(Telefono.getText()));
            dato.setCorreo(Correo.getText());
            dato.setDomi(Dominio.getSelectedItem().toString());

                ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
                JOptionPane.showMessageDialog(null, "Datos Guardados", "Guardando...", JOptionPane.WARNING_MESSAGE, icono);
                Datos.push(dato);
    }//GEN-LAST:event_AgregarActionPerformed

    private void NombreUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreUMouseEntered
        NombreU.setBackground(Color.lightGray);
    }//GEN-LAST:event_NombreUMouseEntered

    private void NombreUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreUMouseExited
        NombreU.setBackground(Color.white);
    }//GEN-LAST:event_NombreUMouseExited

    private void EdadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdadMouseEntered
        Edad.setBackground(Color.lightGray);
    }//GEN-LAST:event_EdadMouseEntered

    private void EdadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdadMouseExited
        Edad.setBackground(Color.white);
    }//GEN-LAST:event_EdadMouseExited

    private void TelefonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMouseEntered
        Telefono.setBackground(Color.lightGray);
    }//GEN-LAST:event_TelefonoMouseEntered

    private void TelefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMouseExited
        Telefono.setBackground(Color.white);
    }//GEN-LAST:event_TelefonoMouseExited

    private void CorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMouseEntered
        Correo.setBackground(Color.lightGray);
    }//GEN-LAST:event_CorreoMouseEntered

    private void CorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMouseExited
        Correo.setBackground(Color.white);
    }//GEN-LAST:event_CorreoMouseExited

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
            java.util.logging.Logger.getLogger(JDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDatos(null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField Correo;
    private javax.swing.JComboBox<String> Dominio;
    private javax.swing.JTextField Edad;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField NombreU;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
