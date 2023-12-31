/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labherencia;

/**
 *
 * @author dell
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AhorcadoFijo = new javax.swing.JButton();
        JugarAhorcadoAlAzar = new javax.swing.JButton();
        InicializarPalabras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AhorcadoFijo.setText("Jugar Ahorcado Fijo");
        AhorcadoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AhorcadoFijoActionPerformed(evt);
            }
        });
        getContentPane().add(AhorcadoFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 180, -1));

        JugarAhorcadoAlAzar.setText("Jugar Ahorcado al Azar");
        JugarAhorcadoAlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarAhorcadoAlAzarActionPerformed(evt);
            }
        });
        getContentPane().add(JugarAhorcadoAlAzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 180, -1));

        InicializarPalabras.setText("Inicializar Palabras");
        InicializarPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicializarPalabrasActionPerformed(evt);
            }
        });
        getContentPane().add(InicializarPalabras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 180, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabel2.setText("AHORCADOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, -1, -1));

        jButton1.setText("Agregar palabras para modo azar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AhorcadoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AhorcadoFijoActionPerformed
       JuegoAhorcadoFijo AhorcadoFijoJuego= new JuegoAhorcadoFijo(InicializarPalabrasFijo.palabraDef);
       AhorcadoFijoJuego.jugar();
    }//GEN-LAST:event_AhorcadoFijoActionPerformed

    private void InicializarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicializarPalabrasActionPerformed
        InicializarPalabrasFijo inicializar = new InicializarPalabrasFijo();
        inicializar.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_InicializarPalabrasActionPerformed

    private void JugarAhorcadoAlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarAhorcadoAlAzarActionPerformed
        JuegoAhorcadoAzar juegoAhorcadoAzar = new JuegoAhorcadoAzar(AdminPalabrasSecretas.getpalabrasSecretas());
        juegoAhorcadoAzar.jugar();
        System.out.println(AdminPalabrasSecretas.getpalabrasSecretas());
    }//GEN-LAST:event_JugarAhorcadoAlAzarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AgregarPalabras agregarPalabras = new AgregarPalabras();
    agregarPalabras.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AhorcadoFijo;
    private javax.swing.JButton InicializarPalabras;
    private javax.swing.JButton JugarAhorcadoAlAzar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
