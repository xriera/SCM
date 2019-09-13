package scm.vista;

import scm.controlador.ConexionDB;
import scm.modelo.Usuario;

/**
 *
 * @author wilson
 */
public class MenuSeleccion extends javax.swing.JFrame {

    private String rol;
    
    public MenuSeleccion() {
        initComponents();
        rol = ConexionDB.getUsuarioSesion().getRol();
        if (rol.equals("medico") || rol.equals("recepcionista")) {
            btUsuarios.setEnabled(false);
        }
        if (rol.equals("recepcionista")) {
            btMedicos.setEnabled(false);
        }
        if (rol.equals("medico")) {
            btCitas.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btUsuarios = new javax.swing.JButton();
        btMedicos = new javax.swing.JButton();
        btPacientes = new javax.swing.JButton();
        btCerrarSesion = new javax.swing.JButton();
        btCambiarClave = new javax.swing.JButton();
        btCitas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCM - Menu principal");
        setResizable(false);

        btUsuarios.setText("Usuarios");
        btUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariosActionPerformed(evt);
            }
        });

        btMedicos.setText("Medicos");
        btMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicosActionPerformed(evt);
            }
        });

        btPacientes.setText("Pacientes");
        btPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacientesActionPerformed(evt);
            }
        });

        btCerrarSesion.setText("Cerrar Sesión");
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });

        btCambiarClave.setText("Cambiar clave");
        btCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarClaveActionPerformed(evt);
            }
        });

        btCitas.setText("Citas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btCitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPacientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCambiarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUsuarios)
                    .addComponent(btMedicos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPacientes)
                    .addComponent(btCambiarClave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCitas)
                    .addComponent(btCerrarSesion))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        new InicioSesion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuariosActionPerformed
        new VentanaGestionUsuarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btUsuariosActionPerformed

    private void btMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicosActionPerformed
        if (rol.equals("medico")) {
            new VentanaDatosMedico().setVisible(true);
        } else {
            new VentanaGestionMedicos().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btMedicosActionPerformed

    private void btPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPacientesActionPerformed

    private void btCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiarClaveActionPerformed
        new VentanaCambioClave().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCambiarClaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCambiarClave;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btCitas;
    private javax.swing.JButton btMedicos;
    private javax.swing.JButton btPacientes;
    private javax.swing.JButton btUsuarios;
    // End of variables declaration//GEN-END:variables
}