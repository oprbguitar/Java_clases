import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion6 {
    public static void main(String[] args) {
        Connection con;
        String driver="oracle.jdbc.driver.OracleDriver";
        String cadena="jdbc:oracle:thin:@localhost:1521:XE";
        String usuario="hr";
        String clave="hr";
        try{
            Class.forName(driver);
            con=DriverManager.getConnection(cadena,usuario,clave);
            JOptionPane.showMessageDialog(null,"Conexion OK");
        }catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null,"Error en el driver");
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null,"Error en la conexion");
        }
    }
}
