import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[]args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        for (Integer i = 0; i < 3; i++){
            System.out.println("Digite um valor: ");
            Integer numero = leia.nextInt();

            lista.add(numero);
        }

         lista.sort(Comparator.reverseOrder());

          Integer calculo = lista.get(0) + lista.get(1);

          System.out.println("A soma dos 2 maiores numeros é "+ calculo);
    }
    }