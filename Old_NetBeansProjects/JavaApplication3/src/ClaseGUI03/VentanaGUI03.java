/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ClaseGUI03;

import javax.swing.DefaultListModel;

/**
 *
 * @author yazminurzuac
 */
public class VentanaGUI03 extends javax.swing.JFrame {

    //Declarar la lista de destinos
    private listaDestinos lista;
    /**
     * Creates new form VentanaGUI03
     */
    public VentanaGUI03() {
        initComponents();
        //Borrar todos los elementos de la Lista
        jcbPais.removeAllItems();
        //Agregando opciones a la lista desplegable (JComboBox)
        jcbPais.addItem("Argentina");
        jcbPais.addItem("Chile");
        jcbPais.addItem("Colombia");
        jcbPais.addItem("Mexico");
        jcbPais.addItem("Brasil");
        jcbPais.addItem("Paraguay");
        //Incializar lista
        lista = new listaDestinos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbPais = new javax.swing.JLabel();
        jcbPais = new javax.swing.JComboBox<>();
        jlbCiudad = new javax.swing.JLabel();
        jlbResultado = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaResultado = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlsCiudad = new javax.swing.JList<>();
        jsbBarra2 = new javax.swing.JScrollBar();
        jlbBarra1 = new javax.swing.JLabel();
        jlbBarra2 = new javax.swing.JLabel();
        jsbBarra1 = new javax.swing.JScrollBar();
        jbnRegistrar = new javax.swing.JButton();
        jbnConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbPais.setText("País:");

        jcbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "" }));
        jcbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPaisActionPerformed(evt);
            }
        });

        jlbCiudad.setText("Ciudad:");

        jlbResultado.setText("Relacion del pais con ciudad");

        jtaResultado.setColumns(20);
        jtaResultado.setLineWrap(true);
        jtaResultado.setRows(5);
        jScrollPane3.setViewportView(jtaResultado);

        jlsCiudad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Elige: " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlsCiudad.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlsCiudadValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlsCiudad);

        jsbBarra2.setMaximum(10);
        jsbBarra2.setMinimum(1);
        jsbBarra2.setVisibleAmount(1);
        jsbBarra2.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jsbBarra2AdjustmentValueChanged(evt);
            }
        });

        jlbBarra1.setText("Valor:");

        jlbBarra2.setText("Valor:");

        jsbBarra1.setBlockIncrement(1);
        jsbBarra1.setMaximum(10);
        jsbBarra1.setMinimum(1);
        jsbBarra1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jsbBarra1.setVisibleAmount(1);
        jsbBarra1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jsbBarra1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jsbBarra1AdjustmentValueChanged(evt);
            }
        });

        jbnRegistrar.setText("Registrar");
        jbnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarActionPerformed(evt);
            }
        });

        jbnConsultar.setText("Consultar");
        jbnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnConsultarActionPerformed(evt);
            }
        });

        jtaDatos.setColumns(20);
        jtaDatos.setRows(5);
        jScrollPane2.setViewportView(jtaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jsbBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbCiudad)
                                            .addComponent(jlbResultado)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(50, 50, 50)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jlbPais)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jsbBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbBarra2)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jbnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnConsultar)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jlbBarra1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsbBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jlbBarra2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlbPais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbCiudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jsbBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbBarra1)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbnRegistrar)
                            .addComponent(jbnConsultar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(494, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPaisActionPerformed
        // Crear el onjeto del modelo agregar a componentes a JList
        DefaultListModel modelo = new DefaultListModel();
        //String nomPais = jcb.Pais.getSelectedItem().toString() retorna la posicion de la lista desplegable ComboBox
        //getSelectedInde() retorna la posicion de la lista deplegable (ComboBox)
        switch(jcbPais.getSelectedIndex()){
           case 0:
            //Borrar todos los componentes
            jlsCiudad.removeAll();
            //Agregar al modelo las opciones
            modelo.addElement("Buenos Aires");
            modelo.addElement("Cordoba");
            modelo.addElement("Rosario");
            modelo.addElement("Mar de plata");
            //Asociar el modelo de la lista
            jlsCiudad.setModel(modelo);
            break;
           
           case 1:
             //Borrar todos los componentes
            jlsCiudad.removeAll();
            //Agregar al modelo las opciones
            modelo.addElement("Santiago");
            modelo.addElement("Concepcion");
            modelo.addElement("Viña del mar");
            modelo.addElement("Iquique");
            //Asociar el modelo de la lista
            jlsCiudad.setModel(modelo);
            break;
            
           case 2:
            //Borrar todos los componentes
            jlsCiudad.removeAll();
            //Agregar al modelo las opciones
            modelo.addElement("Barranquilla");
            modelo.addElement("Cartagena");
            modelo.addElement("Cali");
            modelo.addElement("Bogota");
            //Asociar el modelo de la lista
            jlsCiudad.setModel(modelo);
            break;
            
           case 3:
               //Borrar todos los componentes
            jlsCiudad.removeAll();
            //Agregar al modelo las opciones
            modelo.addElement("Guadalajara");
            modelo.addElement("Cdmx");
            modelo.addElement("Monterrey");
            //Asociar el modelo de la lista
            jlsCiudad.setModel(modelo);
            break;
            
           case 4:
               //Borrar todos los componentes
            jlsCiudad.removeAll();
            //Agregar al modelo las opciones
            modelo.addElement("Sao Paulo ");
            modelo.addElement("Rio de Janeiro");
            modelo.addElement("Brasilia");
            modelo.addElement("Manaos");
            //Asociar el modelo de la lista
            jlsCiudad.setModel(modelo);
            break;
            
           case 5:
            //Borrar todos los componentes
            jlsCiudad.removeAll();
            //Agregar al modelo las opciones
            modelo.addElement("MonteVideo");
            modelo.addElement("Maldonado");
            modelo.addElement("Rivera");
            modelo.addElement("Ciudad de la costa");
            //Asociar el modelo de la lista
            jlsCiudad.setModel(modelo);
            break;

        }
    }//GEN-LAST:event_jcbPaisActionPerformed

    private void jlsCiudadValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlsCiudadValueChanged
        // Obtener el valor de la lista desplegable y lista
        String pais = jcbPais.getSelectedItem().toString();
        String ciudad = jlsCiudad.getSelectedValue().toString();
        //Agregar los valores a la caja de texto multilinea
        jtaResultado.setText("\n"+pais +"-"+ ciudad +"\n");
    }//GEN-LAST:event_jlsCiudadValueChanged

    private void jsbBarra1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jsbBarra1AdjustmentValueChanged
        // Colocar el valor de la barra dentro de una etiqueta
        jlbBarra1.setText("\nValor: " + String.valueOf(jsbBarra1.getValue()));
    }//GEN-LAST:event_jsbBarra1AdjustmentValueChanged

    private void jsbBarra2AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jsbBarra2AdjustmentValueChanged
        // Colocar el valor de la barra dentro de una etiqueta
        jlbBarra2.setText("\nValor: " + String.valueOf(jsbBarra2.getValue()));
    }//GEN-LAST:event_jsbBarra2AdjustmentValueChanged

    private void jbnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarActionPerformed
        // Agregar la informacion a la lista de destinos
        lista.agregarDestinos(jsbBarra1.getValue(),jcbPais.getSelectedItem().toString(),
        jlsCiudad.getSelectedValue().toString());
        
    }//GEN-LAST:event_jbnRegistrarActionPerformed

    private void jbnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnConsultarActionPerformed
        // Mostrar los datos registrados
        if(lista.estaVacia()){
            //Mensjae en caso de estar vacia la lista
            jtaDatos.setText("Sin datos resgistrados");
        } else{
            //Mostrar los datos que han sido registrados
            jtaDatos.setText(lista.recorrerDestinos());
        }
    }//GEN-LAST:event_jbnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaGUI03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGUI03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGUI03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGUI03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGUI03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbnConsultar;
    private javax.swing.JButton jbnRegistrar;
    private javax.swing.JComboBox<String> jcbPais;
    private javax.swing.JLabel jlbBarra1;
    private javax.swing.JLabel jlbBarra2;
    private javax.swing.JLabel jlbCiudad;
    private javax.swing.JLabel jlbPais;
    private javax.swing.JLabel jlbResultado;
    private javax.swing.JList<String> jlsCiudad;
    private javax.swing.JScrollBar jsbBarra1;
    private javax.swing.JScrollBar jsbBarra2;
    private javax.swing.JTextArea jtaDatos;
    private javax.swing.JTextArea jtaResultado;
    // End of variables declaration//GEN-END:variables
}
