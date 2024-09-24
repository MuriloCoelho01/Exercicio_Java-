import  java.util.Scanner;

public class Área_Triangulo {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        Double base = leia.nextDouble();

        System.out.println("Digite o valopr da altura: ");
        Double altura = leia.nextDouble();

        Double calculo = base * altura/2;

        System.out.println("A área do Triangulo é " + calculo);
    }
}
