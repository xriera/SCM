package scm.vista;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import scm.controlador.ControladorCita;
import scm.modelo.Cita;
import scm.modelo.Medico;

/**
 *
 * @author wilson
 */
public class PanelCitasPaciente extends javax.swing.JPanel {

    public PanelCitasPaciente() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCitas = new javax.swing.JTable();

        tbCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Motivo", "Medico", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCitas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setDatosCita(String idPaciente) {
        DefaultTableModel modelo = (DefaultTableModel) tbCitas.getModel();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-YYYY");
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm");
        List<Cita> lista = ControladorCita.listarCitasEspecificas(idPaciente);
        for (Cita cita : lista) {
            String fecha = formatoFecha.format(cita.getFecha());
            String hora = formatoHora.format(new Date(Long.valueOf(cita.getHora())));
            String motivo = cita.getMotivo();
            Medico medico = cita.getMedico();
            String nombreMedico = medico.getNombre() + " " + medico.getApellido();
            String estado = cita.getEstado();
            modelo.addRow(new Object[]{fecha, hora, motivo, nombreMedico, estado});
        }
        tbCitas.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCitas;
    // End of variables declaration//GEN-END:variables
}