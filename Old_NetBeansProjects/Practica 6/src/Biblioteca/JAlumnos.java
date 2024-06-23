package Biblioteca;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class JAlumnos extends javax.swing.JFrame {

    Pila Alumno;
    Pila prestamo;
    Pila libro;

    ImagenFondo Fondo;

    public JAlumnos(Pila alumno,Pila prestamo,Pila libro) {

        Fondo = new  ImagenFondo("src/Icon/Alumno.png");
        this.setContentPane(Fondo);

        initComponents();

        this.Alumno = alumno;
        this.prestamo = prestamo;
        this.libro = libro;

    }

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
        Regi = new javax.swing.JTextField();
        NomA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        vcre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Regreso = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        TextModif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DatosAlumnos.exe");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu de ingreso de datos de Alumno");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro:");

        Regi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Regi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegiMouseExited(evt);
            }
        });

        NomA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NomA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NomAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NomAMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora de llegada:");

        hora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hora.setToolTipText("");
        hora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                horaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                horaMouseExited(evt);
            }
        });

        vcre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        vcre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vcreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vcreMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vigencia de Credencial:");
        jLabel5.setToolTipText("");

        Agregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/verificado.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Regreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Regreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/volver.png"))); // NOI18N
        Regreso.setText("Regresar");
        Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresoActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/basura.png"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        TextModif.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TextModif.setForeground(new java.awt.Color(255, 255, 255));
        TextModif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextModif.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Agregar)
                .addGap(45, 45, 45)
                .addComponent(Borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regreso)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(vcre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(hora))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Regi, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(NomA, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(20, 20, 20)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomA)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vcre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TextModif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresoActionPerformed
        MenuPrincipal Biblioteca = new MenuPrincipal(Alumno,prestamo,libro);
        Biblioteca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

            Alumnos alumno = new Alumnos();
            alumno.setRegistro(Integer.parseInt(Regi.getText()));
            alumno.setNombre(NomA.getText());
            alumno.setHora(hora.getText());
            alumno.setVC(vcre.getText());

                TextModif.setText("Datos Guardados");
                Alumno.push(alumno);

        Regi.setText("");
        NomA.setText("");
        hora.setText("");
        vcre.setText("");
        Regi.requestFocus();  
    }//GEN-LAST:event_AgregarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Alumno.eliminar();
        TextModif.setText("Se a eliminado los datos correctamente");
    }//GEN-LAST:event_BorrarActionPerformed

    private void RegiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegiMouseEntered
        Regi.setBackground(Color.lightGray);
    }//GEN-LAST:event_RegiMouseEntered

    private void RegiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegiMouseExited
        Regi.setBackground(Color.white);
    }//GEN-LAST:event_RegiMouseExited

    private void NomAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomAMouseEntered
        NomA.setBackground(Color.lightGray);
    }//GEN-LAST:event_NomAMouseEntered

    private void NomAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomAMouseExited
        NomA.setBackground(Color.white);
    }//GEN-LAST:event_NomAMouseExited

    private void horaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaMouseEntered
        hora.setBackground(Color.lightGray);
    }//GEN-LAST:event_horaMouseEntered

    private void horaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaMouseExited
        hora.setBackground(Color.white);
    }//GEN-LAST:event_horaMouseExited

    private void vcreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vcreMouseEntered
        vcre.setBackground(Color.lightGray);
    }//GEN-LAST:event_vcreMouseEntered

    private void vcreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vcreMouseExited
        vcre.setBackground(Color.white);
    }//GEN-LAST:event_vcreMouseExited

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
            java.util.logging.Logger.getLogger(JAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAlumnos(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField NomA;
    private javax.swing.JTextField Regi;
    private javax.swing.JButton Regreso;
    private javax.swing.JLabel TextModif;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField vcre;
    // End of variables declaration//GEN-END:variables
}