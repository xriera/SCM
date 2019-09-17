/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.vista;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;
import scm.controlador.ControladorConsulta;
import scm.modelo.Consulta;

/**
 *
 * @author wilson
 */
public class PanelConsultasPaciente extends javax.swing.JPanel {
    
    private Consulta consultaTemporal;
    
    public PanelConsultasPaciente() {
        initComponents();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        txtFecha.setText(formato.format(Date.from(Instant.now())));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPA = new javax.swing.JFormattedTextField();
        txtFC = new javax.swing.JFormattedTextField();
        txtFR = new javax.swing.JFormattedTextField();
        txtTemperatura = new javax.swing.JFormattedTextField();
        txtPeso = new javax.swing.JFormattedTextField();
        txtTalla = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSintomas = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(520, 300));

        txtFecha.setEnabled(false);

        jLabel1.setText("Fecha:");

        jLabel2.setText("PA:");

        txtPA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtFC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtFR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtTemperatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtTalla.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel3.setText("FC:");

        jLabel4.setText("FR:");

        jLabel5.setText("Tmp:");

        jLabel6.setText("Talla:");

        jLabel7.setText("Peso:");

        txtSintomas.setColumns(20);
        txtSintomas.setLineWrap(true);
        txtSintomas.setRows(5);
        jScrollPane1.setViewportView(txtSintomas);

        jLabel8.setText("Sintomas:");

        jLabel9.setText("I.M.C:");

        txtIMC.setEnabled(false);

        jLabel10.setText("Diagnostico:");

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setLineWrap(true);
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33))))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setDatos(Consulta consulta) {
        this.consultaTemporal = consulta;
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        Date fecha = consulta.getCita().getFecha();
        txtFecha.setText(formato.format(fecha));
        txtPA.setText(consulta.getPresionArterial() + "");
        txtFC.setText(consulta.getFrecuenciaCardiaca() + "");
        txtFR.setText(consulta.getFrecuenciaRespiratoria() + "");
        txtTemperatura.setText(consulta.getTemperaturaCorporal() + "");
        txtPeso.setText(consulta.getPeso() + "");
        txtTalla.setText(consulta.getAltura() + "");
        txtIMC.setText(consulta.getIndiceMasa() + "");
        txtSintomas.setText(consulta.getSintomas());
    }

    public void configurarPanel(String accion) {
        int id = 0;
        if (accion.equals("insertar")) {
            activarCampos();
            id = ControladorConsulta.generarID();        
        } else if (accion.equals("modificar")) {
            activarCampos();
            id = consultaTemporal.getId();
        } else if (accion.equals("eliminar")) {
            desactivarCampos();
        } else if (accion.equals("guardar")) {
            Date fecha = Date.from(Instant.now());
            float pa = Float.valueOf(txtPA.getText());
            float fc = Float.valueOf(txtFC.getText());
            float fr = Float.valueOf(txtFR.getText());
            float tc = Float.valueOf(txtTemperatura.getText());
            float talla = Float.valueOf(txtTalla.getText());
            float peso = Float.valueOf(txtPeso.getText());
            String sintomas = txtSintomas.getText();
            String diagnostico = txtDiagnostico.getText();
            if (accion.equals("insertar")) {
                Consulta consulta = new Consulta(id, consultaTemporal.getCita(), sintomas, diagnostico,
                                                 pa, fc, fr, tc, peso, talla, "", "");
                if (ControladorConsulta.agregar(consulta)) {
                    JOptionPane.showMessageDialog(null, "Operacion exitosa:\n" + 
                                                  "La consulta ha sido agregada con exito!");
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion fallida:\n" + 
                                                  "La consulta no ha sido agregada!");
                }
            } else if (accion.equals("modificar")) {
                Consulta consulta = new Consulta(id, consultaTemporal.getCita(), sintomas, diagnostico,
                                                 pa, fc, fr, tc, peso, talla, 
                                                 consultaTemporal.getReceta(), consultaTemporal.getIndicaciones());
                if (ControladorConsulta.modificar(consultaTemporal)) {
                    JOptionPane.showMessageDialog(null, "Operacion exitosa:\n" + 
                                                  "La consulta ha sido modificada con exito!");
                }
            } else if (accion.equals("eliminar")) {
                if (ControladorConsulta.eliminar(consultaTemporal.getId())) {
                    JOptionPane.showMessageDialog(null, "Operacion exitosa:\n" + 
                                                  "La consulta ha sido eliminada con exito!");
                }
            }
            limpiarCampos();
            desactivarCampos();
        }
    }
    
    private void limpiarCampos() {
        
    }
    
    private void activarCampos() {
        txtFecha.setEnabled(true);
        txtPA.setEnabled(true);
        txtFC.setEnabled(true);
        txtFR.setEnabled(true);
        txtTemperatura.setEnabled(true);
        txtPeso.setEnabled(true);
        txtTalla.setEnabled(true);
        txtIMC.setEnabled(true);
        txtSintomas.setEnabled(true);
    }
    
    private void desactivarCampos() {
        txtFecha.setEnabled(false);
        txtPA.setEnabled(false);
        txtFC.setEnabled(false);
        txtFR.setEnabled(false);
        txtTemperatura.setEnabled(false);
        txtPeso.setEnabled(false);
        txtTalla.setEnabled(false);
        txtIMC.setEnabled(false);
        txtSintomas.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JFormattedTextField txtFC;
    private javax.swing.JFormattedTextField txtFR;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JFormattedTextField txtPA;
    private javax.swing.JFormattedTextField txtPeso;
    private javax.swing.JTextArea txtSintomas;
    private javax.swing.JFormattedTextField txtTalla;
    private javax.swing.JFormattedTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
