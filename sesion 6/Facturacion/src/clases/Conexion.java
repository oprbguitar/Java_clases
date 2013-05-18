package clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion
{
 public Connection con;//conexion
 public Statement stat;
 public ResultSet r;


 public Integer codigook;
 public String descripcionok= "";
 public Integer cantidadok;
 public Double preciook;
  public String suspendidook="";

public Integer codigo_bd=0;//busquedas para filtrar datos, actualziar consultar y eliminar
public String descripcion_bd="";//guarda un apellido paterno
public Integer cantidad_bd=0;//guarda apellido materno, solo un dato
public Double precio_bd=0.00;//guarda nombre
public String suspendido_bd="";
public String cadena="";//se encarga de concatenar los ap,am,nom
public String []cad=new String[20];//bucles y vacias las cadena
public Integer []cad1=new Integer[20];//genera bucle y guarda el codigo
public String []cad2=new String[20];
public Integer []cad3=new Integer[20];
public Double []cad4=new Double[20];
public String []cad5=new String[20];



public static int i=0;
public int i2=0;
////////////////////////////////////////
// constructor sin parametros
public Conexion()
{
  VerificarDriver();
  VerificarODBC();
  VerificarSQL();  // leer todo el file

}
//////////  constructor con 1 parametro
public Conexion(Integer codigows)  // codigo de llegada
{
  codigook= codigows;
  VerificarDriver();
  VerificarODBC();
  VerificarSQL2();  // busca codigo
}
//////////  constructor con 2 parametro
/*public Conexion(String userws,String passws)  // user de llegada
{
  userok= userws;
  pasok=passws;
  VerificarDriver();
  VerificarODBC();
  VerificarSQL1();
}*/
//////////  constructor con 3 parametro
public Conexion(Integer codigows,String descripcionws,Integer cantidadws,Double preciows,String suspendidows)
{
  codigook= codigows;
 descripcionok=descripcionws;
 cantidadok=cantidadws;
 preciook=preciows;
 suspendidook=suspendidows;

   VerificarDriver();
  VerificarODBC();
  VerificarSQL2();  // busca codigo
}

//////////////////////////////
public void VerificarDriver(){
try
{
Class.forName("com.mysql.jdbc.Driver"); //("sun.jdbc.odbc.JdbcOdbcDriver");
//System.out.println("OK----------driver");
/*msg1ws="OK----------driver";*/
}
catch(Exception e1)
{
// System.out.println("ERROR----------driver no existe "+e1);

}
}
////////////////////////////// ODBC
public void VerificarODBC()
{
try
{
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturacion","root","uni");
//("jdbc:odbc:ODBC_SQL", "", "");
//System.out.println("OK----------ODBC");


}
catch(Exception e2)
{
 //System.out.println("ERROR----------ODBC no existe "+e2);

}
}
////////////////////////////// SQL
public void VerificarSQL(){
try{
stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
r=stat.executeQuery("SELECT  *  FROM productos");

i=0;
while(r.next())
{// hay datos
codigo_bd=r.getInt("codigo");
descripcion_bd=r.getString("descripcion");
cantidad_bd=r.getInt("cantidad");
precio_bd=r.getDouble("precio");
suspendido_bd=r.getString("suspendido");
cadena= codigo_bd+" "+descripcion_bd+" "+cantidad_bd+"" +precio_bd+""+suspendido_bd;
cad[i]=cadena;
cad1[i]=codigo_bd;
cad2[i]=descripcion_bd;
cad3[i]=cantidad_bd;
cad4[i]=precio_bd;
cad5[i]=suspendido_bd;
i++;

System.out.println(cadena);
}
} // try
catch(Exception e3)
{
 System.out.println("ERROR----------ODBC no existe "+e3);
}
}
/////////////////////////////
////////////////////////////// SQL1


public void VerificarSQL2(){
try{
stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
r=stat.executeQuery("SELECT  *  FROM productos WHERE codigo="+codigook);

i2=0;
if(r.next())
{// existe usuario
codigo_bd=r.getInt("codigo");
descripcion_bd=r.getString("descripcion");
cantidad_bd=r.getInt("cantidad");
precio_bd=r.getDouble("precio");
suspendido_bd=r.getString("suspendido");
cadena= codigo_bd+" "+descripcion_bd+" "+cantidad_bd+"" +precio_bd+""+suspendido_bd;
cad[i2]=cadena;
cad1[i2]=codigo_bd;
cad2[i2]=descripcion_bd;
cad3[i2]=cantidad_bd;
cad4[i2]=precio_bd;
cad5[i2]=suspendido_bd;
i2++;
}

}
catch(Exception e3)
{
 
}
}

/////////////////////////// MODIFICAR
public void Modificar()
{
    try
    {
     VerificarDriver();
       VerificarODBC();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Update productos Set descripcion='"+descripcionok+"',cantidad="+cantidadok+",precio="+preciook+",suspendido='"+suspendidook+"' WHERE codigo="+codigook);
    //System.out.println("LA MODIFICACION FUE UN EXITO");
     JOptionPane.showMessageDialog(null, "La actualizacion fue un exito");
    }
    catch(Exception e15)
    {
    //System.out.println("ERROR....NO procede LA MODIFICACION.."+e15);
    }
}

public void Eliminar()
{
    try
    {
        VerificarDriver();
       VerificarODBC();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Delete from productos WHERE codigo="+codigook);
        JOptionPane.showMessageDialog(null,"La Eliminacion fue un exito");
    }
    catch(Exception e16)
    {
    //System.out.println("ERROR....NO procede LA Eliminacion.."+e16);
    }
}

public void Adicionar()
{
    try
    {
     VerificarDriver();
      VerificarODBC();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Insert Into productos Values("+codigook+",'"+descripcionok+"',"+cantidadok+","+preciook+",'"+suspendidook+"')");
      JOptionPane.showMessageDialog(null,"La Insercion fue un exito");

    }
    catch(Exception e17)
    {
    //System.out.println("ERROR....NO procede LA Adicion.."+e17);
    }
}

}// clase
