
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        Integer valor = 1;
        for (Integer i = 0; i < 3; i++){

            System.out.println("Digite o " +valor+"° valor:" );
            Integer valor1 = leia.nextInt();

            list.add(valor1);
            valor++;

        }
        list.sort(Comparator.reverseOrder());

        System.out.println("O maior valor é: "+list.get(0));

        }
    }

