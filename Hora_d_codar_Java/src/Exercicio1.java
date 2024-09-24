import java.util.Scanner;

   public class Exercicio1 {
       public static void main(String[] args){

           Scanner leia = new Scanner(System.in);

           String nome_do_carro;

           System.out.println("Digite o modelo de um carro:");

           nome_do_carro = leia.nextLine();

           System.out.println("O modelo do carro digitado é: " + nome_do_carro);


       }
}
