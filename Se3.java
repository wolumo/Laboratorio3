import java.util.Scanner ;

public class Se3 {
    public static void main(String [] args){
        int a , b ;
        float c , i , t;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca su salario");
        a = teclado.nextInt();
        System.out.println("Introduzca horas extra trabajadas");
        b = teclado.nextInt();
        if(b > 38){
        c = (float) (a * 0.50);
        a= (int) (a + c);
        i = (float) (a * 0.10);
        t = a-i;
            System.out.println("Su salario total va a ser de :" + t);
     } 
     if (a<=750){
         System.out.println("Su salario es de :" + a );

     }
     if (a>750){
         c = (float) (a*0.10);
         a = (int) (a-c) ;
         System.out.println("Su salario es de :" + a );

     }
     }
    }
 
}