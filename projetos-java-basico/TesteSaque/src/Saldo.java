import java.util.Scanner;
public class Saldo {
    public static void main(String[] args) {
        
        Scanner valorSaque = new Scanner(System.in);
        double saque;
        System.out.println("Insira o valor a ser sacado:");
        saque = valorSaque.nextDouble();

        double saldoInicial = 1500.00;

        if (saldoInicial >= saque) {
            double saldoFinal = saldoInicial - saque;
            System.out.println("Seu saldo inicial era de: R$"+ saldoInicial);
            System.out.println("Saque efetuado no valor de: R$" + saque);
            System.out.println("Saldo em conta: R$" +saldoFinal);
        } else {
            System.out.println("Seu saldo é de: R$"+ saldoInicial +". Saque não efetuado.");
        }

        valorSaque.close();
    }
}
