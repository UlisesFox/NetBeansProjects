package newpackage;

public class NewJFrame extends javax.swing.JFrame {

int tam = 10;
Computadora[] aCompus = new Computadora[tam];

    public NewJFrame() {
        initComponents();

    for (int k = 0; k < tam; k++);{   
        aCompus[k] = new Computadora();

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

        Jlol = new javax.swing.JLabel();
        jSerie = new javax.swing.JLabel();
        jMarca = new javax.swing.JLabel();
        jModelo = new javax.swing.JLabel();
        jProcesador = new javax.swing.JLabel();
        jRam = new javax.swing.JLabel();
        jTextSerie = new javax.swing.JTextField();
        jTextMarca = new javax.swing.JTextField();
        jTextModelo = new javax.swing.JTextField();
        jTextProcesador = new javax.swing.JTextField();
        jTextRam = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jRegistrarse = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jTextMensaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));

        Jlol.setBackground(new java.awt.Color(204, 204, 255));
        Jlol.setForeground(new java.awt.Color(255, 153, 51));
        Jlol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlol.setText("Formulario de Computadoras");
        Jlol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSerie.setForeground(new java.awt.Color(255, 153, 51));
        jSerie.setText("Serie:");

        jMarca.setForeground(new java.awt.Color(255, 153, 51));
        jMarca.setText("Marca:");

        jModelo.setForeground(new java.awt.Color(255, 153, 51));
        jModelo.setText("Modelo:");

        jProcesador.setForeground(new java.awt.Color(255, 153, 51));
        jProcesador.setText("Procesador:");

        jRam.setForeground(new java.awt.Color(255, 153, 51));
        jRam.setText("Ram:");

        jTextSerie.setBackground(new java.awt.Color(204, 204, 255));
        jTextSerie.setForeground(new java.awt.Color(255, 153, 51));
        jTextSerie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextMarca.setBackground(new java.awt.Color(204, 204, 255));
        jTextMarca.setForeground(new java.awt.Color(255, 153, 51));
        jTextMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextModelo.setBackground(new java.awt.Color(204, 204, 255));
        jTextModelo.setForeground(new java.awt.Color(255, 153, 51));
        jTextModelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextProcesador.setBackground(new java.awt.Color(204, 204, 255));
        jTextProcesador.setForeground(new java.awt.Color(255, 153, 51));
        jTextProcesador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextRam.setBackground(new java.awt.Color(204, 204, 255));
        jTextRam.setForeground(new java.awt.Color(255, 153, 51));
        jTextRam.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBuscar.setForeground(new java.awt.Color(255, 153, 51));
        jBuscar.setText("Buscar");
        jBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jRegistrarse.setForeground(new java.awt.Color(255, 153, 51));
        jRegistrarse.setText("Registarse");
        jRegistrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLimpiar.setForeground(new java.awt.Color(255, 153, 51));
        jLimpiar.setText("Limpiar");
        jLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSalir.setForeground(new java.awt.Color(255, 153, 51));
        jSalir.setText("Salir");
        jSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextMensaje.setBackground(new java.awt.Color(204, 255, 204));
        jTextMensaje.setForeground(new java.awt.Color(255, 153, 51));
        jTextMensaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextMensaje.setText("Mensaje");
        jTextMensaje.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextModelo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextMarca))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextSerie))
                    .addComponent(Jlol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProcesador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextRam, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextMensaje))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Jlol, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSerie)
                    .addComponent(jTextSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMarca)
                    .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jModelo)
                    .addComponent(jTextModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProcesador)
                    .addComponent(jTextProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRam)
                    .addComponent(jTextRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jTextMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlol;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel jModelo;
    private javax.swing.JLabel jProcesador;
    private javax.swing.JLabel jRam;
    private javax.swing.JButton jRegistrarse;
    private javax.swing.JButton jSalir;
    private javax.swing.JLabel jSerie;
    private javax.swing.JTextField jTextMarca;
    private javax.swing.JTextField jTextMensaje;
    private javax.swing.JTextField jTextModelo;
    private javax.swing.JTextField jTextProcesador;
    private javax.swing.JTextField jTextRam;
    private javax.swing.JTextField jTextSerie;
    // End of variables declaration//GEN-END:variables
}
