package interfaces;
import clases.Conexion;
import javax.swing.JOptionPane;
public class Agregar extends javax.swing.JDialog {
   static Integer codigo_ws=0;
   static String descripcion_ws="";
   static Integer cantidad_ws=0;
   static Double precio_ws=0.00;
   static String suspendido_ws="";
   static String []cadw=new String[20];
    public Agregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Sistema: Facturacion");
        setLocation(150,80);
        Conexion dato=new Conexion();
        for(int  j=0;j<dato.i;j++)
        {// for
        Tabla1.setValueAt(dato.cad1[j], j,0);   //codigo
        Tabla1.setValueAt(dato.cad2[j], j,1);   // ap
        Tabla1.setValueAt(dato.cad3[j], j,2);  // am
        Tabla1.setValueAt(dato.cad4[j], j,3);  // nom
         Tabla1.setValueAt(dato.cad5[j], j,4);  // nom
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
        Tdescripcion = new javax.swing.JTextField();
        Tcantidad = new javax.swing.JTextField();
        Tprecio = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jsuspendido = new javax.swing.JComboBox();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mantenimiento de Productos");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Cantidad", "Precio", "Suspendido"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Precio");

        Tcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcodigoActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Suspendido");

        jsuspendido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(Tdescripcion)
                            .addComponent(Tcantidad)
                            .addComponent(Tprecio)
                            .addComponent(jsuspendido, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)))
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
                        .addComponent(Tdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jsuspendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
   codigo_ws=Integer.parseInt(Tcodigo.getText().trim());
   descripcion_ws=Tdescripcion.getText().trim();
    cantidad_ws=Integer.parseInt(Tcantidad.getText().trim());
   precio_ws=Double.parseDouble(Tprecio.getText().trim());
   suspendido_ws=String.valueOf(jsuspendido.getSelectedItem());
      validar();
      Conexion dato=new Conexion();
        for(int  j=0;j<dato.i;j++)
        {// for
        Tabla1.setValueAt(dato.cad1[j], j,0);   //codigo
        Tabla1.setValueAt(dato.cad2[j], j,1);   // ap
        Tabla1.setValueAt(dato.cad3[j], j,2);  // am
        Tabla1.setValueAt(dato.cad4[j], j,3);  // nom
         Tabla1.setValueAt(dato.cad5[j], j,4);  // nom}
        }
   
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void TcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcodigoActionPerformed
        // TODO add your handling code here:
       codigo_ws=Integer.parseInt(Tcodigo.getText().trim());
           
       verificar();
    }//GEN-LAST:event_TcodigoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
       codigo_ws=Integer.parseInt(Tcodigo.getText().trim());
        validar1();
            Conexion dato=new Conexion();
        for(int  j=0;j<dato.i;j++)
        {// for
        Tabla1.setValueAt(dato.cad1[j], j,0);   //codigo
        Tabla1.setValueAt(dato.cad2[j], j,1);   // ap
        Tabla1.setValueAt(dato.cad3[j], j,2);  // am
        Tabla1.setValueAt(dato.cad4[j], j,3);  // nom
         Tabla1.setValueAt(dato.cad5[j], j,4);  // nom}
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        codigo_ws=Integer.parseInt(Tcodigo.getText().trim());
        descripcion_ws=Tdescripcion.getText().trim();
        cantidad_ws=Integer.parseInt(Tcantidad.getText().trim());
        precio_ws=Double.parseDouble(Tprecio.getText().trim());
        suspendido_ws=String.valueOf(jsuspendido.getSelectedItem());
               validar2();
                   Conexion dato=new Conexion();
        for(int  j=0;j<dato.i;j++)
        {// for
        Tabla1.setValueAt(dato.cad1[j], j,0);   //codigo
        Tabla1.setValueAt(dato.cad2[j], j,1);   // ap
        Tabla1.setValueAt(dato.cad3[j], j,2);  // am
        Tabla1.setValueAt(dato.cad4[j], j,3);  // nom
         Tabla1.setValueAt(dato.cad5[j], j,4);  // nom}
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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
    private javax.swing.JTextField Tcantidad;
    private javax.swing.JTextField Tcodigo;
    private javax.swing.JTextField Tdescripcion;
    private javax.swing.JTextField Tprecio;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jsuspendido;
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
           Conexion dato_2=new Conexion(codigo_ws,descripcion_ws,cantidad_ws,precio_ws,suspendido_ws);
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
    public void verificar(){
    if(codigo_ws.equals("")){
        JOptionPane.showMessageDialog(null,
                "Error, codigo sin datos","Validacion de datos",
                JOptionPane.WARNING_MESSAGE);
        Tcodigo.requestFocus();
    }else{
        Conexion lib2=new Conexion(codigo_ws);
       
            Tdescripcion.setText(lib2.descripcion_bd);
            Tcantidad.setText(String.valueOf(lib2.cantidad_bd));
            Tprecio.setText(String.valueOf(lib2.precio_bd));
          jsuspendido.setSelectedItem(lib2.suspendido_bd);
          
            for(int j=0;j<lib2.i;j++){
                Tabla1.setValueAt(cadw[j], j, 0);
                Tabla1.setValueAt(cadw[j], j, 1);
                Tabla1.setValueAt(cadw[j], j, 2);
                Tabla1.setValueAt(cadw[j], j, 3);
                Tabla1.setValueAt(cadw[j], j, 4);
            }
            for(int j=0;j<lib2.i2;j++){
                Tabla1.setValueAt(lib2.cad1[j], j, 0);
                Tabla1.setValueAt(lib2.cad2[j], j, 1);
                Tabla1.setValueAt(lib2.cad3[j], j, 2);
                Tabla1.setValueAt(lib2.cad4[j], j, 3);
                Tabla1.setValueAt(lib2.cad5[j], j, 4);
            }
        }
    }
    public void validar1(){
    if(codigo_ws.equals("")){
        JOptionPane.showMessageDialog(null,
                "Error, codigo sin datos",
                "Validacion de datos",JOptionPane.WARNING_MESSAGE);;
        Tcodigo.requestFocus();
    }else{
        Conexion libe=new Conexion (codigo_ws,descripcion_ws,cantidad_ws,precio_ws,suspendido_ws);
        if(libe.i2==1){
            libe.Eliminar();
            for(int j=0;j<libe.i;j++){
                Tabla1.setValueAt(cadw[j], j, 0);
                Tabla1.setValueAt(cadw[j], j, 1);
                Tabla1.setValueAt(cadw[j], j, 2);
                Tabla1.setValueAt(cadw[j], j, 3);
            }
            Conexion lib=new Conexion();
            for(int j=0;j<lib.i2;j++){
                Tabla1.setValueAt(lib.cad1[j], j, 0);
                Tabla1.setValueAt(lib.cad2[j], j, 1);
                Tabla1.setValueAt(lib.cad3[j], j, 2);
                Tabla1.setValueAt(lib.cad4[j], j, 3);
            }
        }
    }
}
    public void validar2(){
    if(codigo_ws.equals("")){
        JOptionPane.showMessageDialog(this,
                "Error, codigo sin datos","Validacion de datos",
                JOptionPane.WARNING_MESSAGE);
        Tcodigo.requestFocus();
    }else{
        Conexion liba=new Conexion(codigo_ws,descripcion_ws,cantidad_ws,precio_ws,suspendido_ws);
        if(liba.i2==1){
                liba.Modificar();
             for(int j=0;j<liba.i;j++){
                Tabla1.setValueAt(cadw[j], j, 0);
                Tabla1.setValueAt(cadw[j], j, 1);
                Tabla1.setValueAt(cadw[j], j, 2);
                Tabla1.setValueAt(cadw[j], j, 3);
            }
             for(int j=0;j<liba.i2;j++){
                Tabla1.setValueAt(liba.cad1[j],j,0);
                Tabla1.setValueAt(liba.cad2[j],j,1);
                Tabla1.setValueAt(liba.cad3[j],j,2);
                Tabla1.setValueAt(liba.cad4[j],j,3);
            }
        }
    }
}
}