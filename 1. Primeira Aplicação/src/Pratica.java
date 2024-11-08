import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.print("Digite dois numeros inteiros : ");
        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número 1 é maior que o numero 2");
        } if (numero1 < numero2) {
            System.out.println("O número 2 é maior que o numero 1");
        } else if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        }
    }
}
