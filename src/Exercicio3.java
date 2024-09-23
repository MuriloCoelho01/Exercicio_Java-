import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner leia1 = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leia1.next();

        System.out.println("Digite sua idade:");
        Integer idade = leia1.nextInt();

        System.out.println("Olá, "+ nome + " Sua idade é " + idade + " anos.");
    }
}
