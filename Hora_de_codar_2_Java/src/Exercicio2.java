    import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        Integer valor = leia.nextInt();

        if (valor > 0) {
            System.out.println("Esse valor é positivo");
        } else if (valor == 0) {
            System.out.println("Valor igual a 0");
        } else {
         System.out.println("Valor é negativo");
        }
    }
}