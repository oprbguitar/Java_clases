import java.sql.*;
public class Conexion3 {
    public static void main(String[] args) {
       Connection con;
       Statement sen;
       ResultSet res;
       try{
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           System.out.println("Driver definido correctamente");
       }catch(ClassNotFoundException e1){
           System.out.println("Error en el driver "+e1);
       }
       try{
           con=DriverManager.getConnection("jdbc:odbc:X");
           System.out.println("Conexion establecida correctamente");
           sen=con.createStatement();
           res=sen.executeQuery("select * from productos");
           while(res.next()){
               System.out.print(res.getInt("codigo")+ " ");
               System.out.print(res.getString("descripcion")+ " ");
               System.out.print(res.getInt(3)+ " ");
               System.out.println(res.getDouble(4));
           }
           res.close();
           sen.close();
           con.close();
       }catch(SQLException e2){
           System.out.println("Error en la conexion "+e2);
       }
    }
}
