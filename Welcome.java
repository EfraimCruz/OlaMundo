import java.util.Scanner;

public class Welcome{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("\nHello, Wolrd");

        System.out.println("Digite seu nome ");
        nome = entrada.nextLine();

        System.out.println("Hello Wolrd e Hello "+nome);


    }
}