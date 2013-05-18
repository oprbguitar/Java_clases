import java.sql.*;
public class Conexion2 {
    public static void main(String[] args) {
       Connection con;
       Statement sen;
       ResultSet res;
       ResultSetMetaData meta;
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
           meta=res.getMetaData();
           int num_campos=meta.getColumnCount();
           while(res.next()){
               for(int i=1;i<=num_campos;i++){
                   System.out.print(res.getString(i)+ " ");
               }
               System.out.println();
           }
           res.close();
           sen.close();
           con.close();
       }catch(SQLException e2){
           System.out.println("Error en la conexion "+e2);
       }
    }
}
