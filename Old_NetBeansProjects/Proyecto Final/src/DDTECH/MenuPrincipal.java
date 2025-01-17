package DDTECH;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    Pila Valoracione;
    Lista Queja;
    Pila Tarjeta;
    Lista Producto;
    Pila dato;

    ImagenFondo Fondo;

    public MenuPrincipal(Pila valoracione,Lista queja,Pila tarjeta,Lista producto,Pila dato) {
        
        Fondo = new  ImagenFondo("src/Imagenes/Menu Principal.jpg");
        this.setContentPane(Fondo);

        initComponents();

        this.Valoracione = valoracione;
        this.Queja = queja;
        this.Tarjeta = tarjeta;
        this.Producto = producto;
        this.dato = dato;

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

        TextModi = new javax.swing.JLabel();
        Resu = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Datos = new javax.swing.JMenu();
        RegistroD = new javax.swing.JMenuItem();
        MostrarD = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenu();
        RegistroP = new javax.swing.JMenuItem();
        MostrarP = new javax.swing.JMenuItem();
        Tarjetas = new javax.swing.JMenu();
        RegistroT = new javax.swing.JMenuItem();
        MostrarT = new javax.swing.JMenuItem();
        Quejas = new javax.swing.JMenu();
        RegistroQ = new javax.swing.JMenuItem();
        MostrarQ = new javax.swing.JMenuItem();
        Valoraciones = new javax.swing.JMenu();
        RegistroV = new javax.swing.JMenuItem();
        MostrarV = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setIconImage(getIconImage());
        setResizable(false);

        TextModi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TextModi.setForeground(new java.awt.Color(255, 255, 255));
        TextModi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextModi.setText("Bienvenido al menu, que desea hacer hoy?");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Resu.setViewportView(Tabla);

        Datos.setText("Datos");
        Datos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        RegistroD.setText("Registro");
        RegistroD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDActionPerformed(evt);
            }
        });
        Datos.add(RegistroD);

        MostrarD.setText("Mostrar");
        MostrarD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarDActionPerformed(evt);
            }
        });
        Datos.add(MostrarD);

        jMenuBar1.add(Datos);

        Productos.setText("Productos");
        Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        RegistroP.setText("Registro");
        RegistroP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroPActionPerformed(evt);
            }
        });
        Productos.add(RegistroP);

        MostrarP.setText("Mostrar");
        MostrarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPActionPerformed(evt);
            }
        });
        Productos.add(MostrarP);

        jMenuBar1.add(Productos);

        Tarjetas.setText("Tajetas");
        Tarjetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        RegistroT.setText("Registro");
        RegistroT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroTActionPerformed(evt);
            }
        });
        Tarjetas.add(RegistroT);

        MostrarT.setText("Mostrar");
        MostrarT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTActionPerformed(evt);
            }
        });
        Tarjetas.add(MostrarT);

        jMenuBar1.add(Tarjetas);

        Quejas.setText("Quejas");
        Quejas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        RegistroQ.setText("Registro");
        RegistroQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroQActionPerformed(evt);
            }
        });
        Quejas.add(RegistroQ);

        MostrarQ.setText("Mostrar");
        MostrarQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarQActionPerformed(evt);
            }
        });
        Quejas.add(MostrarQ);

        jMenuBar1.add(Quejas);

        Valoraciones.setText("Valoraciones");
        Valoraciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        RegistroV.setText("Registro");
        RegistroV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistroV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroVActionPerformed(evt);
            }
        });
        Valoraciones.add(RegistroV);

        MostrarV.setText("Mostrar");
        MostrarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarVActionPerformed(evt);
            }
        });
        Valoraciones.add(MostrarV);

        jMenuBar1.add(Valoraciones);

        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Resu)
                    .addComponent(TextModi, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Resu, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextModi)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(650, 351));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDActionPerformed
       JDatos reg = new JDatos(Valoracione,Queja,Tarjeta,Producto,dato);
       reg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_RegistroDActionPerformed

    private void MostrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarDActionPerformed
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Mostrando datos guardados de Usuarios", "Mostrando...", JOptionPane.WARNING_MESSAGE, icono);

        NodoPila arregloNodo[] = new NodoPila[dato.getcn()];
                
            arregloNodo = dato.imprimirLista();        
            DefaultTableModel tabla = new DefaultTableModel();

                String[] cabecera = {"Nombre","Género","Edad","Telefono","Correo","Dominio"};        
                tabla.setColumnIdentifiers(cabecera);        
                Object[] datos = new Object[6];

                    for(int i =0; i<dato.getcn();i++){
                        datos[0] = arregloNodo[i].getDato().getNombre();
                        datos[1] = arregloNodo[i].getDato().getGénero();
                        datos[2] = arregloNodo[i].getDato().getEdad();
                        datos[3] = arregloNodo[i].getDato().getTelefono();
                        datos[4] = arregloNodo[i].getDato().getCorreo();
                        datos[5] = arregloNodo[i].getDato().getDomi();
           
            tabla.addRow(datos);
            
        }
        Tabla.setModel(tabla);
    }//GEN-LAST:event_MostrarDActionPerformed

    private void RegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroPActionPerformed
       JProductos reg = new JProductos(Valoracione,Queja,Tarjeta,Producto,dato);
       reg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_RegistroPActionPerformed

    private void MostrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPActionPerformed
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Mostrando datos guardados de Productos", "Mostrando...", JOptionPane.WARNING_MESSAGE, icono);

        NodoLista arregloLista[] = new NodoLista[Producto.getCantNodo()];
                
            arregloLista = Producto.imprimirLista();        
            DefaultTableModel tabla = new DefaultTableModel();

                String[] cabecera = {"Código","Nombre","Cantidad","Entrega","Pago"};        
                tabla.setColumnIdentifiers(cabecera);        
                Object[] datos = new Object[5];

                    for(int i =0; i<Producto.getCantNodo();i++){
                        datos[0] = arregloLista[i].getPro().getCódigoP();
                        datos[1] = arregloLista[i].getPro().getNombreP();
                        datos[2] = arregloLista[i].getPro().getCantidad();
                        datos[3] = arregloLista[i].getPro().getEntrega();
                        datos[4] = arregloLista[i].getPro().getPago();
           
            tabla.addRow(datos);
            
        }
        Tabla.setModel(tabla);
    }//GEN-LAST:event_MostrarPActionPerformed

    private void RegistroTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroTActionPerformed
       JTarjetas reg = new JTarjetas(Valoracione,Queja,Tarjeta,Producto,dato);
       reg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_RegistroTActionPerformed

    private void MostrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTActionPerformed
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Mostrando datos guardados de Tarjetas", "Mostrando...", JOptionPane.WARNING_MESSAGE, icono);

        NodoPila arregloNodo[] = new NodoPila[Tarjeta.getcn()];
                
            arregloNodo = Tarjeta.imprimirLista();        
            DefaultTableModel tabla = new DefaultTableModel();

                String[] cabecera = {"Tarjeta","Caducidad","Entrega","Codigo","Tipo Pago"};        
                tabla.setColumnIdentifiers(cabecera);        
                Object[] datos = new Object[5];

                    for(int i =0; i<Tarjeta.getcn();i++){
                        datos[0] = arregloNodo[i].getTarjeta().getTarjeta();
                        datos[1] = arregloNodo[i].getTarjeta().getTransacción();
                        datos[2] = arregloNodo[i].getTarjeta().getEntregaT();
                        datos[3] = arregloNodo[i].getTarjeta().getCodigoP();
                        datos[4] = arregloNodo[i].getTarjeta().getPagoT();
           
            tabla.addRow(datos);
            
        }
        Tabla.setModel(tabla);
    }//GEN-LAST:event_MostrarTActionPerformed

    private void RegistroQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroQActionPerformed
       JQuejas reg = new JQuejas(Valoracione,Queja,Tarjeta,Producto,dato);
       reg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_RegistroQActionPerformed

    private void MostrarQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarQActionPerformed
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Mostrando datos guardados de Quejas", "Mostrando...", JOptionPane.WARNING_MESSAGE, icono);

        NodoLista arregloLista[] = new NodoLista[Queja.getCantNodo()];
                
            arregloLista = Queja.imprimirLista();        
            DefaultTableModel tabla = new DefaultTableModel();

                String[] cabecera = {"Dia de queja","Motivo","Queja","Seccion de Empresa","Dirijido a"};        
                tabla.setColumnIdentifiers(cabecera);        
                Object[] datos = new Object[5];

                    for(int i =0; i<Queja.getCantNodo();i++){
                        datos[0] = arregloLista[i].getQue().getDiaQ();
                        datos[1] = arregloLista[i].getQue().getMotivoQ();
                        datos[2] = arregloLista[i].getQue().getTipoQ();
                        datos[3] = arregloLista[i].getQue().getSecciónE();
                        datos[4] = arregloLista[i].getQue().getPersonaD();
           
            tabla.addRow(datos);
            
        }
        Tabla.setModel(tabla);
    }//GEN-LAST:event_MostrarQActionPerformed

    private void RegistroVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroVActionPerformed
       JValoraciones reg = new JValoraciones(Valoracione,Queja,Tarjeta,Producto,dato);
       reg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_RegistroVActionPerformed

    private void MostrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarVActionPerformed
        ImageIcon icono = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Mostrando datos guardados de Valoraciones", "Mostrando...", JOptionPane.WARNING_MESSAGE, icono);

        NodoPila arregloNodo[] = new NodoPila[Valoracione.getcn()];
                
            arregloNodo = Valoracione.imprimirLista();        
            DefaultTableModel tabla = new DefaultTableModel();

                String[] cabecera = {"Apodo de usuario","Puntuación","Comentario","Dirijido a","Recomendación"};        
                tabla.setColumnIdentifiers(cabecera);        
                Object[] datos = new Object[5];

                    for(int i =0; i<Valoracione.getcn();i++){
                        datos[0] = arregloNodo[i].getValoracione().getApodo();
                        datos[1] = arregloNodo[i].getValoracione().getPuntuación();
                        datos[2] = arregloNodo[i].getValoracione().getComentario();
                        datos[3] = arregloNodo[i].getValoracione().getPersonaD();
                        datos[4] = arregloNodo[i].getValoracione().getRecomendación();
           
            tabla.addRow(datos);
            
        }
        Tabla.setModel(tabla);
    }//GEN-LAST:event_MostrarVActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
    int valor;

    ImageIcon icono = new ImageIcon("src/Imagenes/informacion.png");
    valor = JOptionPane.showConfirmDialog(this, "¿Quieres salir?", "Regresando a Incio de Sesion...", JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, icono);

        if(valor == 0){

       Registro ingreso = new Registro();
       ingreso.setVisible(true);
       this.setVisible(false);

        }else{

        ImageIcon icono2 = new ImageIcon("src/Imagenes/advertencia.png");
        JOptionPane.showMessageDialog(null, "Regresando al Programa", "Cancelando. . .", JOptionPane.WARNING_MESSAGE, icono2);

        }
    }//GEN-LAST:event_SalirMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Datos;
    private javax.swing.JMenuItem MostrarD;
    private javax.swing.JMenuItem MostrarP;
    private javax.swing.JMenuItem MostrarQ;
    private javax.swing.JMenuItem MostrarT;
    private javax.swing.JMenuItem MostrarV;
    private javax.swing.JMenu Productos;
    private javax.swing.JMenu Quejas;
    private javax.swing.JMenuItem RegistroD;
    private javax.swing.JMenuItem RegistroP;
    private javax.swing.JMenuItem RegistroQ;
    private javax.swing.JMenuItem RegistroT;
    private javax.swing.JMenuItem RegistroV;
    private javax.swing.JScrollPane Resu;
    private javax.swing.JMenu Salir;
    private javax.swing.JTable Tabla;
    private javax.swing.JMenu Tarjetas;
    public javax.swing.JLabel TextModi;
    private javax.swing.JMenu Valoraciones;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
