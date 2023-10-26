/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.vistas;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import javax.swing.JInternalFrame;

/**
 *
 * @author Usuario
 */
public class menu_principal extends javax.swing.JFrame {

    /**
     * Creates new form menu_principal
     */
    public menu_principal() {
        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Gestion de Biblioteca");
        this.setResizable(false);
    }

    private void inicializarJInternalFrame(JInternalFrame internalFrame, String Titulo) {
        escritorio.removeAll();
        escritorio.repaint();

        internalFrame.setTitle(Titulo);
        internalFrame.setSize(800, 620);
        internalFrame.setVisible(true);
        escritorio.add(internalFrame);
        escritorio.moveToFront(internalFrame);

        int x = (escritorio.getWidth() - internalFrame.getWidth()) / 2;
        int y = (escritorio.getHeight() - internalFrame.getHeight()) / 2;
        internalFrame.setLocation(x, y);

        internalFrame.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mGestorLibros = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mGestorPrestamos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mCantidadEjemplares = new javax.swing.JMenuItem();
        mPrestamosVencidos = new javax.swing.JMenuItem();
        mLibrosXAutor = new javax.swing.JMenuItem();
        mConsultaPorPrestamos = new javax.swing.JMenuItem();
        mLibrosPrestadosXFecha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        mGestorLibros.setText("gestor de libros");
        mGestorLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGestorLibrosActionPerformed(evt);
            }
        });
        jMenu1.add(mGestorLibros);

        jMenuItem2.setText("gestor de ejemplares");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mGestorPrestamos.setText("gestor de prestamos");
        mGestorPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGestorPrestamosActionPerformed(evt);
            }
        });
        jMenu1.add(mGestorPrestamos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("gestor de usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        mCantidadEjemplares.setText("Consultar cantidad de ejemplares de un libro");
        mCantidadEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCantidadEjemplaresActionPerformed(evt);
            }
        });
        jMenu3.add(mCantidadEjemplares);

        mPrestamosVencidos.setText("Consultar lectores con prestamos vencidos");
        mPrestamosVencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPrestamosVencidosActionPerformed(evt);
            }
        });
        jMenu3.add(mPrestamosVencidos);

        mLibrosXAutor.setText("Consultar libros de un autor específico");
        mLibrosXAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLibrosXAutorActionPerformed(evt);
            }
        });
        jMenu3.add(mLibrosXAutor);

        mConsultaPorPrestamos.setText("Consultar lectores y libros de todos los prestamos");
        mConsultaPorPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultaPorPrestamosActionPerformed(evt);
            }
        });
        jMenu3.add(mConsultaPorPrestamos);

        mLibrosPrestadosXFecha.setText("Consultar libros prestados por fecha");
        jMenu3.add(mLibrosPrestadosXFecha);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VistaEjemplar gp = new VistaEjemplar();
        inicializarJInternalFrame(gp, "Gestion de Ejemplares");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mGestorLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGestorLibrosActionPerformed
        gestorLibros gp = new gestorLibros();
        inicializarJInternalFrame(gp, "Gestion de Libros");
    }//GEN-LAST:event_mGestorLibrosActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        proyectoFinalVistaUsuario usuarioVista = new proyectoFinalVistaUsuario();
        inicializarJInternalFrame(usuarioVista, "Gestion de Usuarios");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mGestorPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGestorPrestamosActionPerformed
        vistaGestorDePrestamos vgp = new vistaGestorDePrestamos();
        inicializarJInternalFrame(vgp, "Gestion de Prestamos");
    }//GEN-LAST:event_mGestorPrestamosActionPerformed

    private void mLibrosXAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLibrosXAutorActionPerformed
        VistaConsultarLibrosXAutor vla = new VistaConsultarLibrosXAutor();
        escritorio.removeAll();
        escritorio.repaint();
        
        vla.setVisible(true);
        escritorio.add(vla);
        escritorio.moveToFront(vla);
    }//GEN-LAST:event_mLibrosXAutorActionPerformed

    private void mCantidadEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCantidadEjemplaresActionPerformed
        v_ConsultarEjemplarLibro gp = new v_ConsultarEjemplarLibro();
        escritorio.removeAll();
        escritorio.repaint();
        
        gp.setVisible(true);
        escritorio.add(gp);
        escritorio.moveToFront(gp);


    }//GEN-LAST:event_mGestorLibrosActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
      
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        proyectoFinalVistaUsuario usuarioVista = new proyectoFinalVistaUsuario();
        escritorio.removeAll();
        escritorio.repaint();
        
        usuarioVista.setVisible(true);
        escritorio.add(usuarioVista);
        escritorio.moveToFront(usuarioVista);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mGestorPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGestorPrestamosActionPerformed
        vistaGestorDePrestamos vgp = new vistaGestorDePrestamos();
        escritorio.removeAll();
        escritorio.repaint();
        
        vgp.setVisible(true);
        escritorio.add(vgp);
        escritorio.moveToFront(vgp);
    }//GEN-LAST:event_mGestorPrestamosActionPerformed


    }//GEN-LAST:event_mCantidadEjemplaresActionPerformed
    private void mPrestamosVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPrestamosVencidosActionPerformed
        vistaLectoresConPrestamosVencidos vlcpv = new vistaLectoresConPrestamosVencidos();
        inicializarJInternalFrame(vlcpv, "Consulta de Prestamos");
    }//GEN-LAST:event_mPrestamosVencidosActionPerformed


    private void mConsultaPorPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultaPorPrestamosActionPerformed
       vistaConsultaLectoresYLibrosXPrestamo consultaLectorLibro = new vistaConsultaLectoresYLibrosXPrestamo();
        escritorio.removeAll();
        escritorio.repaint();
        
        consultaLectorLibro.setVisible(true);
        escritorio.add(consultaLectorLibro);
        escritorio.moveToFront(consultaLectorLibro);
    }//GEN-LAST:event_mConsultaPorPrestamosActionPerformed

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

//            UIManager.setLookAndFeel(new FlatLightLaf());
            FlatGradiantoDeepOceanIJTheme.setup();

        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem mCantidadEjemplares;
    private javax.swing.JMenuItem mConsultaPorPrestamos;
    private javax.swing.JMenuItem mGestorLibros;
    private javax.swing.JMenuItem mGestorPrestamos;
    private javax.swing.JMenuItem mLibrosPrestadosXFecha;
    private javax.swing.JMenuItem mLibrosXAutor;
    private javax.swing.JMenuItem mPrestamosVencidos;
    // End of variables declaration//GEN-END:variables
}
