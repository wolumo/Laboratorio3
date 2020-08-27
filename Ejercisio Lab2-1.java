import java.util.Scanner;
public class Se1 {
    public static void main(String [ ]args){
        int a ;
        double b ;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido al progrma para saber si se le aplicara el descuento");
        System.out.println("Por favor , digite el monto total de las compras");
        a = teclado.nextInt();
        if(a<450){
            System.out.println("Usted paga el monto total de :"+a);
            System.out.println("No se le aplico descuento");
        }
        if(a>450 && a<850) {
            b= a * 0.10 ;
            a = (int) (a - b);
            System.out.println("Usted paga el monto total de :"+a);
            System.out.println(" Se le aplico 10% descuento");

        }
        if(a>800){
            b = a*0.20 ;
            a = (int) (a - b);
            System.out.println("Usted paga el monto total de :"+b);
            System.out.println("Se le aplico 20% descuento ");
        }

    }
}