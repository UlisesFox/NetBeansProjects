package Biblioteca;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

public class JLibro extends javax.swing.JFrame {

    Pila Alumno; 
    Pila prestamo;
    Pila libro;

    ImagenFondo Fondo;

    public JLibro(Pila alumno,Pila prestamo,Pila libro) {

        Fondo = new  ImagenFondo("src/Icon/Libro.jpg");
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

        jLabel2 = new javax.swing.JLabel();
        Regreso = new javax.swing.JButton();
        CL = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        NomLi = new javax.swing.JTextField();
        NL = new javax.swing.JLabel();
        gene = new javax.swing.JLabel();
        Numpag = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        numpag = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TextModif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libros.exe");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu de ingreso de datos de Libro");

        Regreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Regreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/volver.png"))); // NOI18N
        Regreso.setText("Regresar");
        Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresoActionPerformed(evt);
            }
        });

        CL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CL.setForeground(new java.awt.Color(255, 255, 255));
        CL.setText("Codigo del Libro:");

        Codigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CodigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CodigoMouseExited(evt);
            }
        });

        NomLi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NomLi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NomLiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NomLiMouseExited(evt);
            }
        });

        NL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NL.setForeground(new java.awt.Color(255, 255, 255));
        NL.setText("Nombre del libro:");

        gene.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gene.setForeground(new java.awt.Color(255, 255, 255));
        gene.setText("Genero:");

        Numpag.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Numpag.setToolTipText("");
        Numpag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NumpagMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NumpagMouseExited(evt);
            }
        });

        genero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        genero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generoMouseExited(evt);
            }
        });

        numpag.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numpag.setForeground(new java.awt.Color(255, 255, 255));
        numpag.setText("Numero  de paginas:");
        numpag.setToolTipText("");

        Agregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/verificado.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/basura.png"))); // NOI18N
        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TextModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(gene)
                                    .addGap(18, 18, 18)
                                    .addComponent(genero))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(NL)
                                    .addGap(18, 18, 18)
                                    .addComponent(NomLi))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CL)
                                    .addGap(18, 18, 18)
                                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(numpag)
                                    .addGap(18, 18, 18)
                                    .addComponent(Numpag)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Agregar)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regreso)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NL)
                    .addComponent(NomLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gene))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numpag)
                    .addComponent(Numpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TextModif)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Regreso, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresoActionPerformed
        MenuPrincipal menu = new MenuPrincipal(Alumno,prestamo,libro);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        Libro book = new Libro();
        book.setCodigoL(Integer.parseInt(Codigo.getText()));
        book.setNombreL(NomLi.getText());
        book.setGenero(genero.getText());
        book.setNumeroPag(Integer.parseInt(Numpag.getText()));

            TextModif.setText("Datos Guardados");
            libro.push(book);


        Codigo.setText("");
        NomLi.setText("");
        genero.setText("");
        Numpag.setText("");
        Codigo.requestFocus();  
    }//GEN-LAST:event_AgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       libro.eliminar();
        TextModif.setText("Se a eliminado los datos correctamente");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoMouseEntered
        Codigo.setBackground(Color.lightGray);
    }//GEN-LAST:event_CodigoMouseEntered

    private void CodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoMouseExited
        Codigo.setBackground(Color.white);
    }//GEN-LAST:event_CodigoMouseExited

    private void NomLiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomLiMouseEntered
        NomLi.setBackground(Color.lightGray);
    }//GEN-LAST:event_NomLiMouseEntered

    private void NomLiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomLiMouseExited
        NomLi.setBackground(Color.white);
    }//GEN-LAST:event_NomLiMouseExited

    private void generoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoMouseEntered
        genero.setBackground(Color.lightGray);
    }//GEN-LAST:event_generoMouseEntered

    private void generoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoMouseExited
        genero.setBackground(Color.white);
    }//GEN-LAST:event_generoMouseExited

    private void NumpagMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumpagMouseEntered
        Numpag.setBackground(Color.lightGray);
    }//GEN-LAST:event_NumpagMouseEntered

    private void NumpagMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumpagMouseExited
        Numpag.setBackground(Color.white);
    }//GEN-LAST:event_NumpagMouseExited

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
            java.util.logging.Logger.getLogger(JLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLibro(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel CL;
    private javax.swing.JTextField Codigo;
    private javax.swing.JLabel NL;
    private javax.swing.JTextField NomLi;
    private javax.swing.JTextField Numpag;
    private javax.swing.JButton Regreso;
    private javax.swing.JLabel TextModif;
    private javax.swing.JLabel gene;
    private javax.swing.JTextField genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel numpag;
    // End of variables declaration//GEN-END:variables
}
