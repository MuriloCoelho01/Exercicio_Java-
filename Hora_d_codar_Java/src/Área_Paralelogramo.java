
import java.util.Scanner;

public class Área_Paralelogramo {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor da base?");
        Double base = leia.nextDouble();

        System.out.println("Qual o valor da altura");
        Double altura = leia.nextDouble();

        Double calculo = base*altura;

        System.out.println("A área do Paralelogramo é " + calculo);


    }
}
