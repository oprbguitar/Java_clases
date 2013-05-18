import java.sql.*;
public class ejemplo1 {

    public static void main(String[] args) {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario","root","uni");
            System.out.println("Conexion ok");
        } catch (ClassNotFoundException e1) {
            System.out.println("error en el driver");
        }catch (SQLException e2) {
            System.out.println("error en la conexion");
        }
    }
}
