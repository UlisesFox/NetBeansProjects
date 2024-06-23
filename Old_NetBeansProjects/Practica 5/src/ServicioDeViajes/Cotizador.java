package ServicioDeViajes;

import javax.swing.DefaultListModel;

public class Cotizador extends javax.swing.JFrame {

    private Lista lista;

    public Cotizador() {
        initComponents();

        Pais.removeAllItems();

        Pais.addItem("Chihuhua");
        Pais.addItem("Jalisco");
        Pais.addItem("Tepic");
        Pais.addItem("MexicoDF");
        Pais.addItem("La Paz");

        Habitacion.removeAllItems();

        Habitacion.addItem("Sencilla");
        Habitacion.addItem("Doble");
        Habitacion.addItem("Suite");

        Dias.removeAllItems();
        Dias.addItem("1");
        Dias.addItem("2");
        Dias.addItem("3");
        Dias.addItem("4");
        Dias.addItem("5");
        Dias.addItem("6");
        Dias.addItem("7");
        Dias.addItem("8");
        Dias.addItem("9");
        Dias.addItem("10");

        lista = new Lista();

    }

    public void limpiarDatos(){

TextoModi1.setText("Campos limpiados");
Dias.requestFocus();

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pais = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Habitacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Tarjeta = new javax.swing.JRadioButton();
        Mensualidad = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrecioDia = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        PrecioHabitacion = new javax.swing.JList<>();
        BarraVertical = new javax.swing.JScrollBar();
        TextoModi1 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Visualizar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextModi2 = new javax.swing.JLabel();
        Dias = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cotizador.exe");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al sistema de cotizador");

        jLabel2.setText("Dias de Hospedaje:");

        jLabel3.setText("Destino Turistico:");
        jLabel3.setToolTipText("");

        Pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chihuahua" }));
        Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaisActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de Habitacion:");

        Habitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sencilla" }));
        Habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabitacionActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de Pago");

        buttonGroup1.add(Tarjeta);
        Tarjeta.setText("Tarjeta");

        buttonGroup1.add(Mensualidad);
        Mensualidad.setText("Mensualidades");

        jScrollPane1.setViewportView(PrecioDia);

        jScrollPane2.setViewportView(PrecioHabitacion);

        BarraVertical.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                Valor(evt);
            }
        });

        TextoModi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoModi1.setText("...");

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Cancelar.setText("Regresar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Visualizar.setText("Visualizar");
        Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel8.setText("Costo por día:");

        jLabel9.setText("Precio de la Habitacion:");

        TextModi2.setText("Valor: ");

        Dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(TextoModi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Tarjeta)
                                .addGap(18, 18, 18)
                                .addComponent(Mensualidad))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Registrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Visualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpiar))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(BarraVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextModi2)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BarraVertical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Tarjeta)
                            .addComponent(Mensualidad))
                        .addGap(18, 18, 18)
                        .addComponent(TextoModi1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Registrar)
                            .addComponent(Cancelar)
                            .addComponent(Visualizar)
                            .addComponent(limpiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextModi2)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(443, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaisActionPerformed
        
        DefaultListModel modelo = new DefaultListModel();

        switch(Pais.getSelectedIndex()){
           case 0:
            PrecioDia.removeAll();
            modelo.addElement("$5000");
            PrecioDia.setModel(modelo);
            break;
           
           case 1:
            PrecioDia.removeAll();
            modelo.addElement("$6000");
            PrecioDia.setModel(modelo);
            break;
            
           case 2:
            PrecioDia.removeAll();
            modelo.addElement("$3000");
            PrecioDia.setModel(modelo);
            break;
            
           case 3:
            PrecioDia.removeAll();
            modelo.addElement("$10000");
            PrecioDia.setModel(modelo);
            break;
            
           case 4:
            PrecioDia.removeAll();
            modelo.addElement("$4000");
            PrecioDia.setModel(modelo);
            break;

        }
    }//GEN-LAST:event_PaisActionPerformed

    private void HabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabitacionActionPerformed
        
        DefaultListModel modelo = new DefaultListModel();

        switch(Habitacion.getSelectedIndex()){
           case 0:
            PrecioHabitacion.removeAll();
            modelo.addElement("$1200");
            PrecioHabitacion.setModel(modelo);
            break;
           
           case 1:
            PrecioHabitacion.removeAll();
            modelo.addElement("$2100");
            PrecioHabitacion.setModel(modelo);
            break;
            
           case 2:
            PrecioHabitacion.removeAll();
            modelo.addElement("$3500");
            PrecioHabitacion.setModel(modelo);
            break;

        }
    }//GEN-LAST:event_HabitacionActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        lista.agregarDestinos(BarraVertical.getValue(),Pais.getSelectedItem().toString(),
        Habitacion.getSelectedItem().toString());
        TextoModi1.setText("Datos Registrados");
    }//GEN-LAST:event_RegistrarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Ingreso ini = new Ingreso();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarActionPerformed
        Visualizar ini = new Visualizar();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VisualizarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void Valor(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_Valor
        TextModi2.setText("\nValor: " + String.valueOf(BarraVertical.getValue()));
    }//GEN-LAST:event_Valor

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
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cotizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar BarraVertical;
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> Dias;
    private javax.swing.JComboBox<String> Habitacion;
    private javax.swing.JRadioButton Mensualidad;
    private javax.swing.JComboBox<String> Pais;
    private javax.swing.JList<String> PrecioDia;
    private javax.swing.JList<String> PrecioHabitacion;
    private javax.swing.JButton Registrar;
    private javax.swing.JRadioButton Tarjeta;
    private javax.swing.JLabel TextModi2;
    private javax.swing.JLabel TextoModi1;
    private javax.swing.JButton Visualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    // End of variables declaration//GEN-END:variables
}
