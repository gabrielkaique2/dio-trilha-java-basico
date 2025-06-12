import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" **********************\n Seja bem-vindo(a)! \n Cadastre-se \n **********************\n");

        System.out.println("Entre com os 4 digitos de sua conta: ");
        int Numero = scan.nextInt();
        System.out.println("O número da sua conta é: "+ Numero +"\n");

        System.out.println("Entre com o código de sua agência: ");
        String Agencia = scan.next();
        System.out.println("Sua agência é: "+ Agencia+"\n");

        System.out.println("Entre com o seu nome e sobrenome: ");
        String NomeCliente = scan.next();
        System.out.println("Seu nome é: "+ NomeCliente+"\n");

        System.out.println("Entre com o seu saldo atual: ");
        double Saldo = scan.nextDouble();
        System.out.println("Seu saldo é de : R$" + Saldo);

        System.out.println("Olá, " + NomeCliente + " obrigado por criar uma conta em nosso banco.\nSua agência é: " + Agencia + " " +
                "\n Sua conta é: " + Numero + "\n Seu saldo é de: R$" + Double.toString(Saldo));

    }
}