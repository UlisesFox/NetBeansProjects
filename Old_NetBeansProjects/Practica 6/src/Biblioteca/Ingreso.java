package Biblioteca;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class Ingreso extends javax.swing.JFrame {

    Pila Alumno = new Pila();
    Pila prestamo = new Pila();
    Pila libro = new Pila();

    Usuario Usuarios[] = new Usuario[5];

    ImagenFondo Fondo;

    public Ingreso() {

        Fondo = new  ImagenFondo("src/Icon/puerta.jpg");
        this.setContentPane(Fondo);

        initComponents();
    }

    @Override
    public Image getIconImage(){

    Image valorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Icon/logozorro.png"));
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
        Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextModi1 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Contraseña = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingeso.exe");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio de Sesion");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        Usuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Usuario.setText("Invitado");
        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuarioMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        TextModi1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TextModi1.setForeground(new java.awt.Color(255, 255, 255));
        TextModi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextModi1.setText("Ingrese como invitado o ingrese usuario y contraseña");

        Cancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cancelar.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Contraseña.setText("0");
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContraseñaMouseExited(evt);
            }
        });

        Ingresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CaraZorro.png"))); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextModi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Contraseña)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Ingresar)
                        .addGap(58, 58, 58)
                        .addComponent(Cancelar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(TextModi1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
         for(int i = 0; i<5; i++){
            Usuarios[i] = new Usuario();
         }
        
        Usuarios[0].setNombreU("Neos");
        Usuarios[0].setContraseña(202);
        
        Usuarios[1].setNombreU("Alexs");
        Usuarios[1].setContraseña(707);
        
        Usuarios[2].setNombreU("Zule");
        Usuarios[2].setContraseña(606);
        
        Usuarios[3].setNombreU("DokyLoky");
        Usuarios[3].setContraseña(909);
        
        Usuarios[4].setNombreU("Invitado");
        Usuarios[4].setContraseña(0);
        
        String usuario = Usuario.getText();
        int contraseña = Integer.parseInt(Contraseña.getText());
        
        for(int i = 0; i<5; i++){

        if(usuario.equals(Usuarios[i].getNombreU()) && contraseña == Usuarios[i].getContraseña() ){

            MenuPrincipal Biblioteca = new MenuPrincipal(Alumno,prestamo,libro);
            Biblioteca.setVisible(true);
            this.setVisible(false);

            break;

        }else{

            TextModi1.setText("Usuario no encontrado,Verifique los datos");
            Usuario.requestFocus();
        }
      }
    }//GEN-LAST:event_IngresarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
    this.dispose(); 
    }//GEN-LAST:event_CancelarActionPerformed

    private void UsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMouseEntered
        Usuario.setBackground(Color.lightGray);
    }//GEN-LAST:event_UsuarioMouseEntered

    private void UsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMouseExited
        Usuario.setBackground(Color.white);
    }//GEN-LAST:event_UsuarioMouseExited

    private void ContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseEntered
        Contraseña.setBackground(Color.lightGray);
    }//GEN-LAST:event_ContraseñaMouseEntered

    private void ContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseExited
        Contraseña.setBackground(Color.white);
    }//GEN-LAST:event_ContraseñaMouseExited

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JButton Ingresar;
    private javax.swing.JLabel TextModi1;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}