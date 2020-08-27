import java.util.Scanner ;
public class Se2 {
    public static void main(String [ ]args) {
        int a , c ;
        String b ;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite el numero de dia");
        a = teclado.nextInt();
        System.out.println("Digite el mes ");
        b = teclado.nextLine();
        System.out.println("Digite el año"); 
        c = teclado.nextInt();
        switch(b){
            case "enero":
            System.out.println("LA fecha es :"+a +" / 1 /" + c);
            break;
            case "febrero":
            System.out.println("LA fecha es :"+a +" / 2 /" + c);
            break;
            case "marzo":
            System.out.println("LA fecha es :"+a +" / 3 /" + c);
            break;
            case "abril":
            System.out.println("LA fecha es :"+a +" / 4 /" + c);
            break;
            case "mayo":
            System.out.println("LA fecha es :"+a +" / 5 /" + c);
            break;
            case "junio":
            System.out.println("LA fecha es :"+a +" / 6 /" + c);
            break;
            case "julio":
            System.out.println("LA fecha es :"+a +" / 7 /" + c);
            break;
            case "agosto":
            System.out.println("LA fecha es :"+a +" / 8 /" + c);
            break;
            case "septiembre":
            System.out.println("LA fecha es :"+a +" / 9 /" + c);
            break;
            case "octubre":
            System.out.println("LA fecha es :"+a +" / 10 /" + c);
            break;
            case "noviembre":
            System.out.println("LA fecha es :"+a +" / 11 /" + c);
            break;
            case "diciembre":
            System.out.println("LA fecha es :"+a +" / 12 /" + c);
            break;
        }
    }

    
}