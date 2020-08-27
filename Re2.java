import java.util.Scanner ; 
public class Re2 { 
    public static void main(String[ ]args ){
        int a=0  , i , num ; 
     Scanner teclado = new Scanner(System.in);
     System.out.println("Bienvenido al programa para saber si el numero que digito es primo o no");
     System.out.println("Por favor , introduzca el numero"); 
     num = teclado.nextInt();
     for( i = 1 ; i<=num ; i++); 
        if((num % i) == 0)  
        {
            a=a+1; 
        }
    if(a == 2 ) 
    {
        System.out.println("EL numero es primo");  
    } else {
        System.out.println("El numero no es primo");
    }
    }
    
}