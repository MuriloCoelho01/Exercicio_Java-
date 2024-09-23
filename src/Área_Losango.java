import java.util.Scanner;

public class Área_Losango {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da diagonal maior: ");
        Double maior = leia.nextDouble();

        System.out.println("Digite o valor da diagonal menor: ");
        Double menor = leia.nextDouble();

        Double calculo = maior*menor/2;

        System.out.println("A área do Losango é "+ calculo);
    }
}
