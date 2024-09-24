import java.util.Scanner;

public class Área_Quadrado {
    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor do lado?");
        Double lado = leia.nextDouble();

        Double calculo = lado*lado;

        System.out.println("A área do Quadrado é " + calculo);

    }
}
