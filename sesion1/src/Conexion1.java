import java.sql.*;
public class Conexion1 {
    public static void main(String[] args) {
       Connection con;
       try{
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           System.out.println("Driver definido correctamente");
       }catch(ClassNotFoundException e1){
           System.out.println("Error en el driver "+e1);
       }
       try{
           con=DriverManager.getConnection("jdbc:odbc:X");
           System.out.println("Conexion establecida correctamente");
       }catch(SQLException e2){
           System.out.println("Error en la conexion "+e2);
       }
    }
}
