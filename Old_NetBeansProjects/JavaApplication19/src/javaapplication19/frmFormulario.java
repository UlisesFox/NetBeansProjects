/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author alond
 */
public class frmFormulario extends javax.swing.JFrame {

    /**
     * Creates new form frmFormulario
     */
    //Modifico el constructor para recibir el parámetro de tipo cadena (String)
    public frmFormulario(String usr) {
        initComponents();
        
        //Colocar componente el valor del parámetro recibido
        jtfNombre.setText(usr);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jlbTitulo = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlbTipo = new javax.swing.JLabel();
        jrbOpcion1 = new javax.swing.JRadioButton();
        jrbOpcion2 = new javax.swing.JRadioButton();
        jrbOpcion3 = new javax.swing.JRadioButton();
        jlbCarrera = new javax.swing.JLabel();
        jcbpOpcion1 = new javax.swing.JCheckBox();
        jcbpOpcion2 = new javax.swing.JCheckBox();
        jcbpOpcion3 = new javax.swing.JCheckBox();
        jlbComentarios = new javax.swing.JLabel();
        jbnRegistrar = new javax.swing.JButton();
        jbnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaComentarios = new javax.swing.JTextArea();
        jlbContenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbTitulo.setText("Formulario de ingreso");

        jtfNombre.setToolTipText("Ingresa apellidos y nombre");

        jlbTipo.setText("Tipo de beca");

        buttonGroup1.add(jrbOpcion1);
        jrbOpcion1.setText("Federal");

        buttonGroup1.add(jrbOpcion2);
        jrbOpcion2.setText("Estatal");

        buttonGroup1.add(jrbOpcion3);
        jrbOpcion3.setText("Institucional");

        jlbCarrera.setText("Carrera");

        jcbpOpcion1.setText("Industrial");

        jcbpOpcion2.setText("Desarrollo Software");
        jcbpOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbpOpcion2ActionPerformed(evt);
            }
        });

        jcbpOpcion3.setText("Mecatronica");

        jlbComentarios.setText("Escribe tus comentarios");

        jbnRegistrar.setText("Registrar");
        jbnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarActionPerformed(evt);
            }
        });

        jbnRegresar.setText("Salir");
        jbnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegresarActionPerformed(evt);
            }
        });

        jtaComentarios.setColumns(20);
        jtaComentarios.setRows(5);
        jScrollPane2.setViewportView(jtaComentarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbOpcion3)
                                    .addComponent(jrbOpcion2)
                                    .addComponent(jlbTipo)
                                    .addComponent(jrbOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbpOpcion2)
                                            .addComponent(jcbpOpcion1)
                                            .addComponent(jcbpOpcion3)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbCarrera)
                                        .addGap(76, 76, 76))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(jlbComentarios))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addComponent(jlbTitulo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbnRegistrar)
                        .addGap(33, 33, 33)
                        .addComponent(jbnRegresar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlbContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTipo)
                    .addComponent(jlbCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOpcion1)
                    .addComponent(jcbpOpcion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbpOpcion2)
                    .addComponent(jrbOpcion2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOpcion3)
                    .addComponent(jcbpOpcion3))
                .addGap(37, 37, 37)
                .addComponent(jlbComentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnRegistrar)
                    .addComponent(jbnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbpOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbpOpcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbpOpcion2ActionPerformed

    private void jbnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarActionPerformed
        // Evaluar la seleccion de un JRadioButton
        if(jrbOpcion1.isSelected()){
           jlbContenido.setText("\nSeleccionado beca Federal.\n");
        }else if(jrbOpcion2.isSelected()){
           jlbContenido.setText("\nSeleccionado beca Estatal.\n");
        } else if(jrbOpcion3.isSelected()){
           jlbContenido.setText("\nSeleccionado beca Institucional.\n");
        }else {
         jlbContenido.setText("\nNinguna beca seleccionada. \n");
        }
        //Evaluar la selección de un JCheckBox
        if(jcbpOpcion1.isSelected()){
          jlbContenido.setText(jlbContenido.getText() + "\nSelecciono Industrial.\n");
        }
        if(jcbpOpcion2.isSelected()){
          jlbContenido.setText(jlbContenido.getText() + "\nSelecciono Desarrollo Software.\n");
        }
        if(jcbpOpcion3.isSelected()){
          jlbContenido.setText(jlbContenido.getText() + "\nSelecciono Mecatronica.\n");
        }
        if(!jcbpOpcion1.isSelected() && !jcbpOpcion2.isSelected() && !jcbpOpcion3.isSelected()){
            jlbContenido.setText(jlbContenido.getText()+ "Ninguna carrera seleccionada.\n");
    }//GEN-LAST:event_jbnRegistrarActionPerformed
    //Obtener información de la caja de texto multilinea
    jlbContenido.setText(jlbContenido.getText() + 
            jtaComentarios.getText());
    }
    
    private void jbnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegresarActionPerformed
        // TODO add your handling code here:
        frmInicio ini = new frmInicio();
        ini.setVisible(true);
        this.dispose(); //Libera la memoria y elimina el objeto de la ventana
    }//GEN-LAST:event_jbnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFormulario(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbnRegistrar;
    private javax.swing.JButton jbnRegresar;
    private javax.swing.JCheckBox jcbpOpcion1;
    private javax.swing.JCheckBox jcbpOpcion2;
    private javax.swing.JCheckBox jcbpOpcion3;
    private javax.swing.JLabel jlbCarrera;
    private javax.swing.JLabel jlbComentarios;
    private javax.swing.JLabel jlbContenido;
    private javax.swing.JLabel jlbTipo;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JRadioButton jrbOpcion1;
    private javax.swing.JRadioButton jrbOpcion2;
    private javax.swing.JRadioButton jrbOpcion3;
    private javax.swing.JTextArea jtaComentarios;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
