import java.util.Scanner;
public class Re3 {
    public static void main(String [ ]args) {
        Scanner teclado = new Scanner (System.in); 
        int a ,b , f=1  ;
        System.out.println("Bienvenido al programa para saber el factorial de un numero");
        System.out.println("por favor introduzca el digito");
        a = teclado.nextInt ();
        b=a ;
      while (a!=0){
          f=f*a;
          a--;
      }
      System.out.println("El factorial del numero  "+ b +" es igual a: " + f);
      System.out.println("Gracias por usar!");
 }
 
 }