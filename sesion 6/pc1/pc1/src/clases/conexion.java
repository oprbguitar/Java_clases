/* * @author alumno Pierre Reyes */
package clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    public Connection con;
    public Statement stat;
    public ResultSet r;
    //=====================================
    public Integer codeok;
    public String descok="";
    public Integer cantok;
    public Double precok;
    public String suspok="";
    //========================================
    public Integer code_db=0;
    public String desc_db="";
    public Integer cant_db=0;
    public Double prec_db=0.00;
    public String susp_db="";
    public String cadena="";
    //=====================================
    public String [] cad=new String[20];
    public Integer [] cad1=new Integer[20];
    public String [] cad2=new String[20];
    public Integer [] cad3=new Integer[20];
    public Double [] cad4=new Double[20];
    public String [] cad5=new String[20];
    //===================================
public static int i=0;
public static int i2=0;
//=========================================
public conexion(){
VerificarDriver();
conectarBD();
VerificarSQL();
}
//=======================================
public conexion(Integer codigows){
codeok=codigows;
VerificarDriver();
conectarBD();
VerificarSQL2();
}
//=========================================
public conexion(Integer codews,String descws,Integer cantws,Double prews,String suspws)
{
  codeok= codews;
  descok= descws;
  cantok= cantws;
  precok= prews;
  suspok= suspws;
  VerificarDriver();
  conectarBD();
  VerificarSQL2();  
}
//==================================================
public void VerificarDriver(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e1){
        }
     }
//=========================================
public void conectarBD(){    
        try{
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturacion","root","blink182");
        }catch(Exception e2){
           }
        }
//======================================
public void VerificarSQL(){
    try{
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     r=stat.executeQuery("SELECT  *  FROM productos");
      i=0;
     while(r.next()){
         code_db=r.getInt("id_pro");
         desc_db=r.getString("desc_pro");
         cant_db=r.getInt("cant_pro");
         prec_db=r.getDouble("pre_pro");
         susp_db=r.getString("susp_pro");
         

         cadena= code_db+" "+desc_db +" "+cant_db +" "+prec_db +" "+susp_db;
         cad[i]=cadena;
         cad1[i]=code_db;
         cad2[i]=desc_db;
         cad3[i]=cant_db;
         cad4[i]=prec_db;
         cad5[i]=susp_db;
         i++;
         }
       }catch(Exception e3){
       }
   }
//=============================================
public void VerificarSQL2(){
    try{
    stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
    r=stat.executeQuery("SELECT  *  FROM productos WHERE id_pro='"+codeok+"' ");
    i2=0;

    if(r.next()){
    code_db=r.getInt("id_pro");
    desc_db=r.getString("desc_pro");
    cant_db=r.getInt("cant_pro");
    prec_db=r.getDouble("pre_pro");
    susp_db=r.getString("susp_pro");
         
    cadena= code_db+" "+desc_db +" "+cant_db +" "+prec_db+" "+susp_db;
    cad[i]=cadena;
    cad1[i]=code_db;
    cad2[i]=desc_db;
    cad3[i]=cant_db;
    cad4[i]=prec_db;
    cad5[i]=susp_db;
    i2++;
    }
  }catch(Exception e3){
       }
    }
//=====================================================
public void Modificar(){
    try{
     VerificarDriver();
     conectarBD();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Update productos Set desc_pro='"+descok+"',cant_pro='"+cantok+"',pre_pro='"+precok+"' WHERE id_pro='"+codeok+"'");//,susp_pro='"+suspok+"'
     JOptionPane.showMessageDialog(null,"La actualizaciòn fue un èxito");
    }
    catch(Exception e4)
    {
    System.out.println("ERROR....NO procede LA MODIFICACION.."+e4);
    }
   }
//=======================================================
public void Eliminar(){
    try{
     VerificarDriver();
     conectarBD();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Delete from productos WHERE id_pro='"+codeok+"'");
     JOptionPane.showMessageDialog(null,"La eliminacion fue un èxito");
     }
    catch(Exception e5){
    }
  }
//==============================================================
public void Adicionar(){
    try{
     VerificarDriver();
     conectarBD();
     stat = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
     stat.execute("Insert Into productos Values('"+codeok+"','"+descok+"','"+cantok+"','"+precok+"','"+suspok+"')");
     JOptionPane.showMessageDialog(null,"La adición fue un èxito");
    }
    catch(Exception e6){
    }
   }
}
