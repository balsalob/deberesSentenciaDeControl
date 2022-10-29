import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        int numeroWhile = 0;
        String estacion = "verano";

        System.out.println("Escribe un número:");

        numero = reader.nextInt();

        if(numero > 0){
            System.out.println("En número es positivo");
        }else if (numero < 0){
            System.out.println("En número es negativo");
        }else {
            System.out.println("En número es 0");
        }

        System.out.println("Escribe un número (Tiene que ser menor que 3:");

        numeroWhile = reader.nextInt();

        while(numeroWhile > 2){
            System.out.println("He dicho menor que 3:");

            numeroWhile = reader.nextInt();
        }

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(Integer.toString(numeroWhile));
        }

        System.out.println("Do while");

        do {
            numeroWhile++;
            System.out.println(Integer.toString(numeroWhile));
        }while (numeroWhile < 3);

        System.out.println("For");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(Integer.toString(numeroFor));
        }

        System.out.println("Escribe una estación (todo en minúscula):");

        estacion = reader.next();

        switch (estacion) {
            case "primavera":
                System.out.println("Has elegido primavera");
                break;
            case "verano":
                System.out.println("Has elegido verano");
                break;
            case "otoño":
                System.out.println("Has elegido otoño");
                break;
            case "invierno":
                System.out.println("Has elegido invierno");
                break;
            default:
                System.out.println("Eso no es ninguna estación");
        }

    }
}