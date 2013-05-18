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
 public String nomok= "";//capturan los valores del formulario agregar
 public String espok="";//capturan los valores del formulario agregar
 public String curok="";
 public String penok;

public String codigo_bd="";// se encarga de leer los codigos de la base cliente
public String ap_bd="";// guarda datos buscados
public String nom_bd="";
public String esp_bd="";
public String cur_bd="";
public String pen_bd="";
public String cadena="";// variable que se encarga de concatenar codigo, apmat. appa, nom

public String []cad=new String[20]; // guardan varios datos de la variable cadena
public String []cad1=new String[20];// aqui se vacean los codigo leidos
public String []cad2=new String[20];// aqui se vacean los appaternos y nombres
public String []cad3=new String[20];
public String []cad4=new String[20];
public String []cad5=new String[20];
public String []cad6=new String[20];

/* base creada en mysql
 create database prueba
use prueba
create table alumnos(
id_alumno varchar(10) primary key,
ape_alumno varchar(50),
nom_alumno varchar(50),
esp_alumno varchar(50),
cur_alumno varchar(30),
pen_alumno double
)

insert into alumnos values ('A0001','Rivera','Pardo','Sistemas','base de datos',899)
insert into alumnos values ('A0002','Ramirez','Pedo','Desarrollo','sql',588)
insert into alumnos values ('A0003','Rosado','Pomalca','Proyectos','PMBOK',789)
insert into alumnos values ('A0004','River','Julio','Diseño','Autocad',870)
insert into alumnos values ('A0005','Radio','Tomas','Actuacion','Canto',800)
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
public Conexion(String codigows,String apws,String nomws,String espws,String curws,String penws )// permite insertar nuevos datos
{
  codigook= codigows;
  apok= apws;
  nomok= nomws;
  espok=espws;
  curok=curws;
  penok=penws;
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
r=stat.executeQuery("SELECT  *  FROM alumnos");
i=0;
while(r.next()){
codigo_bd=r.getString("id_alumno");
ap_bd=r.getString("ape_alumno");
nom_bd=r.getString("nom_alumno");
esp_bd=r.getString("esp_alumno");
cur_bd=r.getString("cur_alumno");
pen_bd=r.getString("pen_alumno");

cadena= codigo_bd+" "+ap_bd +" "+nom_bd +" "+esp_bd+" "+cur_bd+" "+pen_bd;
cad[i]=cadena;
cad1[i]=codigo_bd;
cad2[i]=ap_bd;
cad3[i]=nom_bd;
cad4[i]=esp_bd;
cad5[i]=cur_bd;
cad6[i]=pen_bd;
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
r=stat.executeQuery("SELECT  *  FROM alumnos WHERE id_alumno='"+codigook+"' ");
i2=0;
if(r.next()){
codigo_bd=r.getString("id_alumno");
ap_bd=r.getString("ape_alumno");
nom_bd=r.getString("nom_alumno");
esp_bd=r.getString("esp_alumno");
cur_bd=r.getString("cur_alumno");
pen_bd=r.getString("pen_alumno");

cadena= codigo_bd+" "+ap_bd +" "+nom_bd +" "+esp_bd+" "+cur_bd+" "+pen_bd;
cad[i2]=cadena;
cad1[i2]=codigo_bd;
cad2[i2]=ap_bd;
cad3[i2]=nom_bd;
cad4[i2]=esp_bd;
cad5[i2]=cur_bd;
cad6[i2]=pen_bd;
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
     stat.execute("Update cliente Set ap_alumno='"+apok+"',nom_alumno='"+nomok+"',esp_alumno='"+espok+"',cur_alumno='"+curok+"',pen_alumno='"+penok+"' WHERE id_alumno='"+codigook+"'");
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
     stat.execute("Delete from cliente WHERE id_alumno='"+codigook+"'");
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
     stat.execute("Insert Into alumnos Values('"+codigook+"','"+apok+"','"+nomok+"','"+espok+"','"+curok+"','"+penok+"')");
     JOptionPane.showMessageDialog(null,"La adición fue un èxito");
    }
    catch(Exception e17){
    }
}

}// clase
