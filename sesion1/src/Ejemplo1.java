public class Ejemplo1 {
    public static void main(String[] args) {
        int a=50;
        int b=0;
        int c;
        double w=325.60;
        double z=45.85;
        double suma=w+z;
        try{
            c=a/b;
            System.out.println("Resultado: "+c);
        }catch(ArithmeticException e1){
//            System.out.println("Error, division por cero: ");
        }
        System.out.println("Imprimiendo valrores");
        System.out.println("w: "+w);
        System.out.println("z:"+z);
        System.out.println("suma: "+suma);
    }
}
