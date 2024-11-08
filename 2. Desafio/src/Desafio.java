import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Kauê Riki";
        String tipoConta = "Corrente";
        Double saldo = 2500.00;
        int opcao = 0;

        System.out.println("*******************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("********************");

        Scanner leitor = new Scanner(System.in);

        String menu;
        menu = """
                Escolha uma opção:
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println(saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                double valorReceber = leitor.nextDouble();
                saldo = saldo + valorReceber;
                System.out.println("O seu saldo atualizado é: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor a ser transferido: ");
                double valorTransferir = leitor.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Não há saldo suficiente");
                } else {
                    saldo -= valorTransferir;
                    System.out.println("O seu saldo atualizado é: " + saldo);
                }
            }
        }
    }
}
