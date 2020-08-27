import java.util.Scanner; 
 public class Re1 {
    public static void main(String[ ] args) {
    int n=1 , b=1 ; 
    double c ;
    float d=1 ;
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Bienvenido el programa para efectuar la constante de PI"); 
        System.out.println("Por favor digite el numero de termino que tendra dicha constante");//introduccion de periodos// 
        n = teclado.nextInt () ;
        while(b <= n) {
            c = ((2*b)/(2*b)-1 ) * ((2*b)/(2*b)+1); //Operacion de la formula//
            b++ ; //incrementacion de la variable//
            d= (float) (d * c);
        }
        System.out.println("La constante numero: "+ n + " es  igual a :" + d );
        System.out.println("Gracias por usar"); 
    }
    
}