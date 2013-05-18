package clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion
{
 public Connection con;
 public Statement stat;
 public ResultSet r;


 public String codigook="";//capturan los valores para realizar bùsquedas
 public String apok= "";//capturan los valores del formulario agregar
 public String amok= "";//capturan los valores del formulario agregar
 public String nomok="";//capturan los valores del formulario agregar

public String codigo_bd="";// se encarga de leer los codigos de la base cliente
public String ap_bd="";// guarda datos buscados
public String am_bd="";
public String nom_bd="";
public String cadena="";// variable que se encarga de concatenar codigo, apmat. appa, nom

public String []cad=new String[20]; // guardan varios datos de la variable cadena
public String []cad1=new String[20];// aqui se vacean los codigo leidos
public String []cad2=new String[20];// aqui se vacean los appaternos y nombres
public String []cad3=new String[20];
public String []cad4=new String[20];
/* base creada en mysql
 create database prueba
use prueba
create table cliente(
id_cliente varchar(5) primary key,
ap_cliente varchar (50),
am_cliente varchar (50),
nom_cliente varchar (50)
)
insert into cliente values ('A0001','Rivera','Pardo','Jose')
insert into cliente values ('A0002','Ramirez','Pedo','Juan')
insert into cliente values ('A0003','Rosado','Pomalca','Josefina')
insert into cliente values ('A0004','River','Prado','Julio')
insert into cliente values ('A0005','Radio','reyes','Josel')
 */
// variables que sirven de contadores
public static int i=0; 
public int i2=0;
////////////////////////////////////////
// constructores
public Conexion()// consultar la data
{
  VerificarDriver();
  conectarBD();
  VerificarSQL();  // leer todo el file

}
public Conexion(String codigows)  // obtener registro y hacer modificaciones
{
  codigook= codigows;
  VerificarDriver();
  conectarBD();
  VerificarSQL2();  // busca codigo
}
public Conexion(String codigows,String apws,String amws,String nomws)// permite insertar nuevos datos
{
  codigook= codigows;
  apok= apws;
  amok= amws;
  nomok=nomws;
  VerificarDriver();
  conectarBD();
  VerificarSQL2();  // busca codigo
}

//////////////////////////////
public void VerificarDriver()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
}
catch(Exception e1){
}
}
////////////////////////////// ODBC
public void conectarBD(){
    
try
{
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","uni");
}
catch(Exception e2)
{
}
}
////////////////////////////// SQL
public void VerificarSQL()
{
try
{
stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
r=stat.executeQuery("SELECT  *  FROM cliente");
i=0;
while(r.next()){
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
}
}catch(Exception e3)
{}
}

public void VerificarSQL2()// realiza busqueda por codigo de cliente
{
try
{
stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
r=stat.executeQuery("SELECT  *  FROM cliente WHERE id_cliente='"+codigook+"' ");
i2=0;
if(r.next()){
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
}
catch(Exception e3){
 }
}

/////////////////////////// MODIFICAR
public void Modificar()
{
    try
    {
     VerificarDriver();
     conectarBD();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Update cliente Set ap_cliente='"+apok+"',am_cliente='"+amok+"',nom_cliente='"+nomok+"' WHERE id_cliente='"+codigook+"'");
     JOptionPane.showMessageDialog(null,"La actualizaciòn fue un èxito");
    }
    catch(Exception e15)
    {
    System.out.println("ERROR....NO procede LA MODIFICACION.."+e15);
    }
}

/////////////////////////// eliminar
public void Eliminar(){
    try
    {
     VerificarDriver();
     conectarBD();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Delete from cliente WHERE id_cliente='"+codigook+"'");
     JOptionPane.showMessageDialog(null,"La eliminacion fue un èxito");
    }
    catch(Exception e16){
    }
}
//////////////////////////////  adicionar registros Adicionar()
public void Adicionar(){
    try{
     VerificarDriver();
     conectarBD();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Insert Into cliente Values('"+codigook+"','"+apok+"','"+amok+"','"+nomok+"')");
     JOptionPane.showMessageDialog(null,"La adición fue un èxito");
    }
    catch(Exception e17){
    }
}

}// clase
