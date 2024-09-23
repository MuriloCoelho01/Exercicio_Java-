import java.util.Scanner;

public class Área_Trapézio {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da base maior:");
        Double maior = leia.nextDouble();

        System.out.println("Digite o valor da base menor:");
        Double menor = leia.nextDouble();

        System.out.println("Digite o valor da altura: ");
        Double altura = leia.nextDouble();

        Double calculo = (maior + menor)*altura/2;

        System.out.println("A área do Trapézio é " + calculo);
    }
}
