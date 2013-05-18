import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion7 {
    public static void main(String[] args) {
        Connection con;
        Statement sen;
        ResultSet res;
        String driver="oracle.jdbc.driver.OracleDriver";
        String cadena="jdbc:oracle:thin:@localhost:1521:XE";
        String usuario="hr";
        String clave="hr";
        try{
            Class.forName(driver);
            con=DriverManager.getConnection(cadena,usuario,clave);
            sen=con.createStatement();
            JOptionPane.showMessageDialog(null,"Conexion OK");
            res=sen.executeQuery("select * from employees");
            while(res.next()){
                System.out.print(res.getInt(1)+ " ");
                System.out.print(res.getString(2)+ " ");
                System.out.println(res.getString(3));
            }
            res.close();
            sen.close();
            con.close();
        }catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null,"Error en el driver");
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null,"Error en la conexion");
        }
    }
}
