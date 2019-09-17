package scm.vista;

import scm.controlador.ControladorConsulta;
import scm.modelo.Consulta;

/**
 *
 * @author wilson
 */
public class PanelRecetasPaciente extends javax.swing.JPanel {

    private Consulta consultaFinal;
    
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
        txtReceta.setEnabled(false);
        jScrollPane1.setViewportView(txtReceta);

        jLabel2.setText("Indicaciones:");

        txtIndicaciones.setColumns(20);
        txtIndicaciones.setRows(5);
        txtIndicaciones.setEnabled(false);
        jScrollPane2.setViewportView(txtIndicaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void agregarReceta(int idConsultaElegida) {
        Consulta consulta = ControladorConsulta.buscar(idConsultaElegida);
        txtReceta.setText(consulta.getReceta());
        txtIndicaciones.setText(consulta.getIndicaciones());
    }

    public void generarReceta(int idConsultaElegida) {
        consultaFinal = ControladorConsulta.buscar(idConsultaElegida);
        if (consultaFinal != null) {
            consultaFinal.setReceta(txtReceta.getText());
            consultaFinal.setIndicaciones(txtIndicaciones.getText());
            ControladorConsulta.modificar(consultaFinal);
            imprimirReceta();
        }
    }
    
    private void imprimirReceta() {
        PanelExportarReceta panel = new PanelExportarReceta(consultaFinal);
        panel.setVisible(true);
        panel.imprimirImagen();
        panel.dispose();
    }
    
    public void limpiarCampos() {
        txtReceta.setText("");
        txtIndicaciones.setText("");
    }
    
    public void activarCampos() {
        txtReceta.setEnabled(true);
        txtIndicaciones.setEnabled(true);
    }
    
    public void desactivarCampos() {
        txtReceta.setEnabled(false);
        txtIndicaciones.setEnabled(false);
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
