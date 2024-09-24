import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
    Scanner leia = new Scanner(System.in);

System.out.println("Digite um valor: ");
Integer valor1 = leia.nextInt();


System.out.println("Digite outro valor: ");
Integer valor2 = leia.nextInt();

if (valor1 > valor2){
    System.out.println("O maior valor é: "+valor1);
}
else if(valor2 > valor1){
    System.out.println("O maior valor é: "+valor2);
}
    }
}