package interfaces;
import clases.Conexion;
import javax.swing.JOptionPane;
public class Agregar extends javax.swing.JDialog {
   static String codigo_ws="";
   static String ap_ws="";
   static String am_ws="";
   static String nom_ws="";
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
        Tabla1.setValueAt(dato.cad3[j], j,2);  // am
        Tabla1.setValueAt(dato.cad4[j], j,3);  // nom
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
        Tpaterno = new javax.swing.JTextField();
        Tmaterno = new javax.swing.JTextField();
        Tnombres = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Maestro de Clientes");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Ap. Paterno", "Ap. Materno", "Nombres"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Apellido Paterno");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Apellido Materno");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("Nombres");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel5))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(Tpaterno)
                            .addComponent(Tmaterno)
                            .addComponent(Tnombres)
                            .addComponent(btnAdicionar))))
                .addContainerGap(20, Short.MAX_VALUE))
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
                        .addComponent(Tpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
    codigo_ws=Tcodigo.getText().trim();
    ap_ws=Tpaterno.getText().trim();
    am_ws=Tmaterno.getText().trim();
    nom_ws=Tnombres.getText().trim();
    validar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

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
    private javax.swing.JTextField Tcodigo;
    private javax.swing.JTextField Tmaterno;
    private javax.swing.JTextField Tnombres;
    private javax.swing.JTextField Tpaterno;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
           Conexion dato_2=new Conexion(codigo_ws,ap_ws,am_ws,nom_ws);
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