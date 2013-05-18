package clases;
import java.sql.*;
public class Conexion{
 public Connection con;
 public Statement stat;
 public ResultSet r;
 public String codigook="";
 public String apok= "";
 public String amok= "";
 public String nomok="";
public String codigo_bd="";
public String ap_bd="";
public String am_bd="";
public String nom_bd="";
public String cadena="";
public String []cad=new String[20];
public String []cad1=new String[20];
public String []cad2=new String[20];
public String []cad3=new String[20];
public String []cad4=new String[20];


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
public Conexion(String codigows)  // codigo de llegada
{
  codigook= codigows;
  VerificarDriver();
  VerificarODBC();
  VerificarSQL2();  // busca codigo
}
//////////  constructor con 2 parametro
public Conexion(String userws,String passws)  // user de llegada
{
  userok= userws;
  pasok=passws;
  VerificarDriver();
  VerificarODBC();
  VerificarSQL1();
}
//////////  constructor con 3 parametro
public Conexion(String codigows,String apws,String amws,String nomws)
{
  codigook= codigows;
  apok= apws;
  amok= amws;
  nomok=nomws;

   VerificarDriver();
  VerificarODBC();
  VerificarSQL2();  // busca codigo
}
public void VerificarDriver(){
try{
Class.forName("com.mysql.jdbc.Driver");
}catch(Exception e1){ }
}
public void conectarBD(){
try{
con = DriverManager.getConnection("jdbc:mysql://localhost:3307/prueba","root","uni");
}catch(Exception e2){}
}
public void VerificarSQL()
{
try
{
stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
r=stat.executeQuery("SELECT  *  FROM Cliente");
System.out.println("OK----------SQL");
System.out.println();
System.out.println("DATOS DE LA TABLA CLIENTE");
System.out.println("========================");
i=0;
while(r.next())
{// hay datos
codigo_bd=r.getString("id_cliente");
ap_bd=r.getString("ap_cliente");
am_bd=r.getString("am_cliente");
nom_bd=r.getString("nom_cliente");
cadena= codigo_bd+" "+ap_bd +" "+am_bd +" "+nom_bd;
cad[i]=cadena;
cad1[i]=codigo_bd;
cad2[i]=ap_bd;
cad3[i]=am_bd;
cad4[i]=nom_bd;
i++;

System.out.println(cadena);
}
} // try
catch(Exception e3)
{
 System.out.println("ERROR----------SQL no existe "+e3);
msg3ws="ERROR----------SQL no existe ";
}
}
/////////////////////////////
////////////////////////////// SQL1


public void VerificarSQL2()
{
try
{
stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
r=stat.executeQuery("SELECT  *  FROM Cliente WHERE id_cliente='"+codigook+"' ");
System.out.println("OK----------SQL2");
i2=0;
if(r.next())
{// existe usuario
codigo_bd=r.getString("id_cliente");
ap_bd=r.getString("ap_cliente");
am_bd=r.getString("am_cliente");
nom_bd=r.getString("nom_cliente");
cadena= codigo_bd+" "+ap_bd +" "+am_bd +" "+nom_bd;
cad[i2]=cadena;
cad1[i2]=codigo_bd;
cad2[i2]=ap_bd;
cad3[i2]=am_bd;
cad4[i2]=nom_bd;
i2++;
}
else
{
error=1;     // user no existe
}
con.close();
stat.close();
}
catch(Exception e3)
{
 System.out.println("ERROR----------SQL no existe "+e3);
msg3ws="ERROR----------SQL no existe ";
}
}

/////////////////////////// MODIFICAR
public void Modificar()
{
    try
    {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con = DriverManager.getConnection("jdbc:odbc:ODBC_SQL", "", "");
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Update Cliente Set ap_cliente='"+apok+"',am_cliente='"+amok+"' WHERE id_cliente='"+codigook+"'");
    System.out.println("LA MODIFICACION FUE UN EXITO");
    }
    catch(Exception e15)
    {
    System.out.println("ERROR....NO procede LA MODIFICACION.."+e15);
    }
}

/////////////////////////// eliminar
public void Eliminar()
{
    try
    {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con = DriverManager.getConnection("jdbc:odbc:ODBC_SQL", "", "");
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Delete from Cliente WHERE id_cliente='"+codigook+"'");
    System.out.println("LA Eliminacion FUE UN EXITO");
    }
    catch(Exception e16)
    {
    System.out.println("ERROR....NO procede LA Eliminacion.."+e16);
    }
}
//////////////////////////////  adicionar registros Adicionar()
public void Adicionar()
{
    try
    {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con = DriverManager.getConnection("jdbc:odbc:ODBC_SQL", "", "");
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Insert Into Cliente Values('"+codigook+"','"+apok+"','"+amok+"','"+nomok+"')");
    System.out.println("LA Adicion FUE UN EXITO");
//    INSERT INTO Cliente values('C0001','ZAPATA','PAEZ','LUIS','AV. 28 DE JULIO 1415','zapata@yahoo.com',1500,500.45,5000.98,'01','01','01','01','12345678901','4830799 2321527 990222787','01','01011950','01012009','')

    }
    catch(Exception e17)
    {
    System.out.println("ERROR....NO procede LA Adicion.."+e17);
    }
}

}// clase
