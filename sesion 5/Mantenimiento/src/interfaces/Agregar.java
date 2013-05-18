package interfaces;
import clases.Conexion;
import javax.swing.JOptionPane;
public class Agregar extends javax.swing.JDialog {
   static String codigo_ws="";
   static String ap_ws="";
   static String nom_ws="";
   static String esp_ws="";
   static String cur_ws="";
   static String pen_ws="";
   
   static String []cadw=new String[20];
   
    public Agregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Sistema: Control de Inventario");
        setLocation(150,80);
        Conexion dato=new Conexion();
        for(int  j=0;j<dato.i;j++)
        {// for
        Tabla1.setValueAt(dato.cad1[j], j,0);   //codigo
        Tabla1.setValueAt(dato.cad2[j], j,1);   // ap
        Tabla1.setValueAt(dato.cad3[j], j,2);  // nom
        Tabla1.setValueAt(dato.cad4[j], j,3);   //esp
        Tabla1.setValueAt(dato.cad5[j], j,4);  //cur
        Tabla1.setValueAt(dato.cad6[j], j,5); // pen
        }//for
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tcodigo = new javax.swing.JTextField();
        Tapellido = new javax.swing.JTextField();
        Tnombre = new javax.swing.JTextField();
        Tespecialidad = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tcurso = new javax.swing.JTextField();
        Tpension = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Maestro de Clientes");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Apellido", "Nombre", "Especialidad", "curso", "pension"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellido ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Especialidad");

        Tcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcodigoActionPerformed(evt);
            }
        });

        Tespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TespecialidadActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Curso");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pension");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(Tapellido)
                            .addComponent(Tnombre)
                            .addComponent(Tespecialidad)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tcurso)
                            .addComponent(Tpension))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tpension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnAdicionar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
    codigo_ws=Tcodigo.getText().trim();
    ap_ws=Tapellido.getText().trim();
    nom_ws=Tnombre.getText().trim();
    esp_ws=Tespecialidad.getText().trim();
    cur_ws=Tcurso.getText().trim();
    pen_ws=Tpension.getText().trim();
    validar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void TcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcodigoActionPerformed

    private void TespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TespecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TespecialidadActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar dialog = new Agregar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JTextField Tapellido;
    private javax.swing.JTextField Tcodigo;
    private javax.swing.JTextField Tcurso;
    private javax.swing.JTextField Tespecialidad;
    private javax.swing.JTextField Tnombre;
    private javax.swing.JTextField Tpension;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
void validar()
 {
             if(codigo_ws.equals(""))
        {
        JOptionPane.showMessageDialog(null,
                                "ERROR.... Codigo sin datos.",
                                "Validacion de datos",
                                JOptionPane.WARNING_MESSAGE);
          Tcodigo.requestFocus();

        }
        else // digito
        {
           Conexion dato_2=new Conexion(codigo_ws,ap_ws,nom_ws,esp_ws,cur_ws,pen_ws);
           if(dato_2.i2==1)       // existe
           {
            JOptionPane.showMessageDialog(null,
                                "ERROR.... Codigo Ya existe.",
                                "Validacion de datos",
                                JOptionPane.WARNING_MESSAGE);
            Tcodigo.requestFocus();
           }
           else
           { // codigo NO existe  entonces se graba
         //  System.out.println("verifico contometro---"+dato_2.i);
         dato_2.Adicionar();
         System.out.println("Codigo  -"+codigo_ws+ "  se grabara");
           }

        }
 }
}
