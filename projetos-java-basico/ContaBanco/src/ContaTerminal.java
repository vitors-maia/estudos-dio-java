import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
       Scanner clientInfo = new Scanner(System.in);
       int contaBancaria;
       System.out.println("Bem-vindo a central de cadastro! Por favor, informe seu número da conta:");
       contaBancaria = clientInfo.nextInt();
       System.out.println("Confirmamos que sua conta é: " + contaBancaria);

       System.out.println("Agora informe sua agência seguindo o seguinte exemplo \"000-0\":");
       String agenciaBancaria = clientInfo.next();
       System.out.println("Confirmamos que sua agência é: " + agenciaBancaria);

       System.out.println("Agora informe o seu nome:");
       String nomeCliente = clientInfo.next();
       
       double saldoBancario = 237.48;

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBancaria + ", conta " + contaBancaria + " e seu saldo no valor de R$" + saldoBancario + " já está disponível para saque."); 

       clientInfo.close();


    }
}
