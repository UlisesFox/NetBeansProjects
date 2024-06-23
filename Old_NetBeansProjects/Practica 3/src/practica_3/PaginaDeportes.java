package practica_3;

public class PaginaDeportes extends javax.swing.JFrame {

int Regi = 20;
int Depor = 0;
Deportes[] depo = new Deportes[20];

    public PaginaDeportes() {
        initComponents();
            
        for(int k = 0; k <= 19; k++) {
            depo[k] = new Deportes();

        }
    }

    public void limpiarDatos(){

jTextCodigo.setText("");
jTextCamisa.setText("");
jTextEstado.setText("");
jTextGoles.setText("");
jMensaje.setText("Campos limpiados");
jTextCodigo.requestFocus();

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo = new javax.swing.JLabel();
        jCodigo = new javax.swing.JLabel();
        jNumero = new javax.swing.JLabel();
        jEstado = new javax.swing.JLabel();
        jGoles = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jTextCamisa = new javax.swing.JTextField();
        jTextEstado = new javax.swing.JTextField();
        jTextGoles = new javax.swing.JTextField();
        jToggleAñadir = new javax.swing.JToggleButton();
        jToggleBuscar = new javax.swing.JToggleButton();
        jToggleLimpiar = new javax.swing.JToggleButton();
        jToggleEliminar = new javax.swing.JToggleButton();
        jMensaje = new javax.swing.JLabel();
        jToggleSalir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro.exe");

        jTitulo.setForeground(new java.awt.Color(255, 102, 0));
        jTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo.setText("Registro de Jugadores");

        jCodigo.setForeground(new java.awt.Color(102, 102, 255));
        jCodigo.setText("Codigo del Jugador:");
        jCodigo.setToolTipText("Codigo del jugador (basado en numeros).");

        jNumero.setForeground(new java.awt.Color(102, 102, 255));
        jNumero.setText("No. de Camisa:");
        jNumero.setToolTipText("El numero que lleva el jugador en su camisa.");

        jEstado.setForeground(new java.awt.Color(102, 102, 255));
        jEstado.setText("Estado del Jugador:");
        jEstado.setToolTipText("El estado actual del jugador (Activo / Inactivo).");

        jGoles.setForeground(new java.awt.Color(102, 102, 255));
        jGoles.setText("Goles Optenidos:");
        jGoles.setToolTipText("Numero de goles por parte del jugador.");

        jTextCodigo.setForeground(new java.awt.Color(255, 153, 102));
        jTextCodigo.setCaretColor(new java.awt.Color(153, 153, 255));

        jTextCamisa.setForeground(new java.awt.Color(255, 153, 102));
        jTextCamisa.setCaretColor(new java.awt.Color(153, 153, 255));

        jTextEstado.setForeground(new java.awt.Color(255, 153, 102));
        jTextEstado.setCaretColor(new java.awt.Color(153, 153, 255));

        jTextGoles.setForeground(new java.awt.Color(255, 153, 102));
        jTextGoles.setCaretColor(new java.awt.Color(153, 153, 255));

        jToggleAñadir.setForeground(new java.awt.Color(51, 51, 255));
        jToggleAñadir.setText("Añadir");
        jToggleAñadir.setToolTipText("Añade un nuevo regsitro a la lista.");
        jToggleAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleAñadirActionPerformed(evt);
            }
        });

        jToggleBuscar.setForeground(new java.awt.Color(51, 51, 255));
        jToggleBuscar.setText("Buscar");
        jToggleBuscar.setToolTipText("Busca algun registro ya existente.");
        jToggleBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleBuscarActionPerformed(evt);
            }
        });

        jToggleLimpiar.setForeground(new java.awt.Color(51, 51, 255));
        jToggleLimpiar.setText("Limpiar");
        jToggleLimpiar.setToolTipText("Restablesca el contenido de las tablas de texto.");
        jToggleLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleLimpiarActionPerformed(evt);
            }
        });

        jToggleEliminar.setForeground(new java.awt.Color(51, 51, 255));
        jToggleEliminar.setText("Eliminar");
        jToggleEliminar.setToolTipText("Elimina los registros (Todos).");
        jToggleEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleEliminarActionPerformed(evt);
            }
        });

        jMensaje.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jMensaje.setForeground(new java.awt.Color(51, 51, 51));
        jMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMensaje.setText("Bienvenidos a mi programa que desea hacer.");
        jMensaje.setToolTipText("");

        jToggleSalir.setForeground(new java.awt.Color(51, 51, 255));
        jToggleSalir.setText("Salir");
        jToggleSalir.setToolTipText("Salir del programa");
        jToggleSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jToggleAñadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCodigo)
                                        .addComponent(jNumero)
                                        .addComponent(jEstado)
                                        .addComponent(jGoles))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextCamisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                        .addComponent(jTextEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextGoles, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextCodigo))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCodigo)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNumero)
                    .addComponent(jTextCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEstado)
                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGoles)
                    .addComponent(jTextGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jMensaje)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleAñadir)
                    .addComponent(jToggleEliminar)
                    .addComponent(jToggleLimpiar)
                    .addComponent(jToggleSalir)
                    .addComponent(jToggleBuscar))
                .addGap(21, 21, 21))
        );

        setSize(new java.awt.Dimension(436, 361));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_jToggleLimpiarActionPerformed

    private void jToggleSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleSalirActionPerformed

    private void jToggleEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleEliminarActionPerformed

boolean eliminar = false;
        if(jTextCodigo.getText().isEmpty()){

        }
        else {
            for(int v = 0; v < Depor; v++){
                int ID = Integer.parseInt(jCodigo.getText());
                if(ID == depo[v].getCodigo()){
                    eliminar = true;
                    Depor--;
                    depo[v] = depo[v+1];
                    jMensaje.setText("Registro eliminado");
                }
                else if(eliminar == true){
                    depo[v] = depo[v+1];
                }
            }
        }
       jMensaje.setText("Registros eliminados");
    }//GEN-LAST:event_jToggleEliminarActionPerformed

    private void jToggleAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleAñadirActionPerformed

        if(jTextCodigo.getText().isEmpty() && jTextCamisa.getText().isEmpty() && 
                jTextEstado.getText().isEmpty() && jTextGoles.getText().isEmpty()){
            jMensaje.setText("Hay campos vacios, rellenelos para el registro");
            jTextCodigo.requestFocus();

        } else if (Depor < Regi) {

        float t = Integer.parseInt(jTextCodigo.getText());
        depo[Depor].setCodigo(t);
        int s = Integer.parseInt(jTextCamisa.getText());
        depo[Depor].setNumeroCamisa(s);
        depo[Depor].setEstado(jTextEstado.getText());
        int o = Integer.parseInt(jTextGoles.getText());
        depo[Depor].setGoles(o);
        Depor++;
        jMensaje.setText("Registro completado");
        jTextCodigo.requestFocus();

        } else {

        jMensaje.setText("No se aceptan mas registros");
        jTextCodigo.requestFocus();

        }
    }//GEN-LAST:event_jToggleAñadirActionPerformed

    private void jToggleBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleBuscarActionPerformed

boolean encontrado = false;
    if(!jTextCodigo.getText().isEmpty()){

        if(Depor > 0){

            int Codigop = Integer.parseInt(jTextCodigo.getText());
                for(int j = 0; j < Depor; j++){

                    if(depo[j].getCodigo()== Codigop){

                    encontrado = true;

                        jTextEstado.setText(depo[j].getEstado());

                        jTextGoles.setText(String.valueOf(depo[j].getGoles()));
                        jTextCamisa.setText(String.valueOf(depo[j].getNumeroCamisa()));

                        jMensaje.setText("Registro encontado");
                        jTextCodigo.requestFocus();

                        break;
                    }
                }

                if(!encontrado){

                jMensaje.setText("Registro no encontado");
                jTextCodigo.requestFocus();

                }

            } else {

            jMensaje.setText("El registro esta vacio");
            jTextCodigo.requestFocus();

            }

        } else {

        jMensaje.setText("Falta capturar el codigo del jugador");
        jTextCodigo.requestFocus();

        }
    }//GEN-LAST:event_jToggleBuscarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaDeportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaDeportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaDeportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaDeportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaDeportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCodigo;
    private javax.swing.JLabel jEstado;
    private javax.swing.JLabel jGoles;
    private javax.swing.JLabel jMensaje;
    private javax.swing.JLabel jNumero;
    private javax.swing.JTextField jTextCamisa;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextEstado;
    private javax.swing.JTextField jTextGoles;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JToggleButton jToggleAñadir;
    private javax.swing.JToggleButton jToggleBuscar;
    private javax.swing.JToggleButton jToggleEliminar;
    private javax.swing.JToggleButton jToggleLimpiar;
    private javax.swing.JToggleButton jToggleSalir;
    // End of variables declaration//GEN-END:variables
}
