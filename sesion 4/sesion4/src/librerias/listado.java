
package librerias;
import java.util.*;// permite llamar arreglo dinamicos
public class listado {
    public static Collection<productos> generalista() { 
     Vector<productos> data =new Vector<productos>();
     data.add(new productos(1,"DVD",12,350));
     data.add(new productos(2,"Escaner",5,455));
     data.add(new productos(3,"computador",19,345));
     data.add(new productos(4,"Laptop",89,2576));
     data.add(new productos(5,"Mouse",27,352));
     data.add(new productos(6,"TV LCD",26,690));
     data.add(new productos(7,"Tablet",34,650));
     data.add(new productos(8,"Monitor",78,750));
     return data;
     
    }
}
