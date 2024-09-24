import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome:");

        nome = leia.nextLine();

        System.out.println("Olá " + nome + "!");

    }
}
