import java.util.Scanner;

public class Área_Circulo {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        final Double PI = 3.14;

        System.out.println("Digite o valor do raio: ");
        Double raio = leia.nextDouble();

        Double calculo = PI * (raio * raio);

        System.out.println("A área do Circulo é "+ calculo);
    }
}
