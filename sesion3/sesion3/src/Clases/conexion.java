
package Clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    public Connection c;
    public Statement s;
    public ResultSet r;
    public ResultSetMetaData m; // variable que almacena toda la estructura de un conj. de datos
    public String userok;
    public String passok;
    public String clavebd;
    public int error= 0;
    public int error2= 0;
    public int num_campos;
    //============================================================== constructor que llama
    public conexion(){
      verificarDriver();
      conectarBD();
    }
    //==============================================================
    public conexion (String usuario, String clave){
        userok = usuario;
        passok = clave;
        verificarDriver();
        conectarBD();
        consulta();
    }
    //============================================================== metodo verificar driver
    public void verificarDriver(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    
        } catch (ClassNotFoundException e1) {
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }
     }
    //============================================================== mètodo conectar bd
    public void conectarBD(){
        try {
            c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null, "Error en la ssssssssssssss");
        }
    }
    //============================================================== mètodo consulta
    public void consulta(){
        try {
            s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            r=s.executeQuery("select * from usuarios where id_acceso='"+userok+"'");
            //===========================================
            if (r.next()) {
                error =0;// usuario correcto
                clavebd =r.getString("clave");
                //===================================
                if (passok.equals(clavebd)) {
                    error2=0;// usuario ok clave ok
                }
                else{
                    error2=1; //usuario ok clave incorrecto
                    }
                //======================================
                }else{
                   error=1;// usuario incorrecto
            }
            //=====================================
         }
         catch (SQLException e3) {
             JOptionPane.showMessageDialog(null, "Error en la consulta");
        }
    }
    //============================================================
    public ResultSet consulta2(String codigo){
        try {
           s=c.createStatement();
           r=s.executeQuery(codigo);
           m=r.getMetaData();
           num_campos=m.getColumnCount();
         }catch (SQLException e4) {
            JOptionPane.showMessageDialog(null, "Error en la consulta");
        }
        return r;
    }
    //============================================================
}
   
