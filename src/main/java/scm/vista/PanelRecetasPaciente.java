/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.vista;

import scm.controlador.ControladorConsulta;
import scm.modelo.Consulta;

/**
 *
 * @author wilson
 */
public class PanelRecetasPaciente extends javax.swing.JPanel {

    private int idConsultaElegida;
    
    public PanelRecetasPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtIndicaciones = new javax.swing.JTextArea();

        jLabel1.setText("Receta:");

        txtReceta.setColumns(20);
        txtReceta.setRows(5);
        jScrollPane1.setViewportView(txtReceta);

        jLabel2.setText("Indicaciones:");

        txtIndicaciones.setColumns(20);
        txtIndicaciones.setRows(5);
        jScrollPane2.setViewportView(txtIndicaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void setIDConsultaElegida(int idConsultaElegida) {
        this.idConsultaElegida = idConsultaElegida;
        Consulta consulta = ControladorConsulta.buscar(idConsultaElegida);
        if (consulta != null) {
            consulta.setReceta(txtReceta.getText());
            consulta.setIndicaciones(txtIndicaciones.getText());
            ControladorConsulta.modificar(consulta);
        }
    }
    
    public int getIDConsultaElegida() {
        return idConsultaElegida;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtIndicaciones;
    private javax.swing.JTextArea txtReceta;
    // End of variables declaration//GEN-END:variables
}
