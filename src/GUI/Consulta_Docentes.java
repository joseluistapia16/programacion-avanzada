package GUI;

import herramientas.Tablas;
import dominio.Docente_Auxiliar_Dominio;
import base_de_datos.Consultas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
 
public class Consulta_Docentes extends javax.swing.JDialog {

    DefaultTableModel model;
    String R, id, coA, Nom;
    int o = 0, Pos;
    String[] Filas = new String[4];
    ArrayList<Docente_Auxiliar_Dominio> lista = null;
    int c = 0;
    Docente_Auxiliar_Dominio objeto = null;

    public Consulta_Docentes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Control de Consulta Docente Auxiliar");
        initComponents();
        try {
            llenaTabla("SELECT * FROM docente_auxiliar");
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Docentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Todo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        Todo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Todo.setForeground(new java.awt.Color(255, 255, 255));
        Todo.setText("m");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de Docentes");
        setBounds(new java.awt.Rectangle(300, 130, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setEditingRow(0);
        Tabla.setFillsViewportHeight(true);
        Tabla.setRowHeight(25);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TablaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TablaMouseReleased(evt);
            }
        });
        Tabla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TablaFocusGained(evt);
            }
        });
        Tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 770, 330);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(440, 70, 90, 40);

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Cedula");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 10, 60, 40);

        Cedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });
        Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CedulaKeyTyped(evt);
            }
        });
        getContentPane().add(Cedula);
        Cedula.setBounds(270, 10, 230, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 70, 120, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 10, 73, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ////**

private void TablaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TablaFocusGained

}//GEN-LAST:event_TablaFocusGained

    private void llenaTabla(String query) throws SQLException {
        int[] a = {15, 120, 15, 110};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        model = Tablas.VaciarTabla(Tabla);
        Consultas consu = new Consultas();
        lista = consu.listaDocenteAuxiliar("academico", query);
        String[] Co = {"Cedula", "Nombre", "Tipo Docente", "Correo"};
        model = new DefaultTableModel(null, Co);
        Tabla.setShowGrid(true);
        for (int i = 0; i < lista.size(); i++) {
            Filas[0] = lista.get(i).getIdentificacion();
            Filas[1] = lista.get(i).getNombres();
            Filas[2] = lista.get(i).getTipo_persona();
            Filas[3] = lista.get(i).getCorreo();
            model.addRow(Filas);
            Tabla.setModel(model);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            Tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            Tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            Tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
        }

    }

private void TablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaKeyPressed
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        Object src = evt.getSource();
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(
                new ActionEvent(src, ActionEvent.ACTION_PERFORMED, "Enter"));
        int i = 0;
        try {
            i = Tabla.getSelectedRow();
            objeto= lista.get(i);
            Docente_Edicion gh = new Docente_Edicion(new javax.swing.JFrame(), true, objeto);
            gh.setVisible(true);
            try {
               llenaTabla("SELECT * FROM Docente_Auxiliar");
            } catch (SQLException ex) {
                Logger.getLogger(Consulta_Docentes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception e) {
        }

    }
}//GEN-LAST:event_TablaKeyPressed

private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
}//GEN-LAST:event_TablaMouseClicked

private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
    int i = 0;
    if (evt.getClickCount() == 2) {
        try {
            i = Tabla.getSelectedRow();
            objeto= lista.get(i);           
            Docente_Edicion gh = new Docente_Edicion(new javax.swing.JFrame(), true, objeto);
            gh.setVisible(true);
            try {
                llenaTabla("SELECT * FROM Docente_Auxiliar");
            } catch (SQLException ex) {
                Logger.getLogger(Consulta_Docentes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e) {
        }

    }
}//GEN-LAST:event_TablaMousePressed
    public String getNombre() {
        return Nom;
    }
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here

    dispose();


}//GEN-LAST:event_jButton5ActionPerformed

private void TablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseExited
// TODO add your handling code here:


}//GEN-LAST:event_TablaMouseExited

private void TablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseReleased
// TODO add your handling code here:

}//GEN-LAST:event_TablaMouseReleased

private void TablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseEntered
// TODO add your handling code here:


}//GEN-LAST:event_TablaMouseEntered

    private void CedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CedulaKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CedulaKeyReleased

    private void CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CedulaKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if (Cedula.getText().length() >= 10) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_CedulaKeyTyped

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        Docente_Nuevo in = new Docente_Nuevo(new javax.swing.JFrame(), true);
        in.setVisible(true);
        try {
            llenaTabla("SELECT * FROM Docente_Auxiliar");
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Docentes.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ap = Cedula.getText();
        try {
            llenaTabla("SELECT * FROM Docente_Auxiliar WHERE identificacion LIKE '%" + ap + "%'");
        } catch (SQLException ex) {
            Logger.getLogger(Consulta_Docentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

 

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
            java.util.logging.Logger.getLogger(Consulta_Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                Consulta_Docentes dialog = new Consulta_Docentes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Todo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
