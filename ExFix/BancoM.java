package ExFix;
import java.util.Scanner;

public class BancoM {
    public static void main(String[] args){
        Banco banco;
        Scanner sc = new Scanner(System.in);
        double saldo;
        String nome;
        String doubt;
        int numeroBanco;
        System.out.print("Enter account number: ");
        numeroBanco = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        nome = sc.nextLine();

        System.out.print("\nIs there an initial deposit? (y/n) ");
        doubt = sc.nextLine();
        if(doubt.equalsIgnoreCase("Y")){
            System.out.print("Enter initial deposit value: ");
            saldo = sc.nextDouble();
             banco = new Banco(numeroBanco, nome, saldo);
            System.out.printf("Account data:\nAccount: %d, Holder: %s, Balance: $ %.2f", numeroBanco, nome, banco.getSaldo());
        } else if(doubt.equalsIgnoreCase("N")){
             banco = new Banco(numeroBanco, nome);
        } else {
          System.out.println("Invalid option.");
          return;
        }

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
         System.out.printf("\nUpdated Account data:\nAccount: %d, Holder: %s, Balance: $ %.2f", numeroBanco, nome, banco.deposito(deposit));

        System.out.print("\nEnter a withdraw value: ");
        double saque = sc.nextDouble();
       
        System.out.printf("\nUpdated Account data:\nAccount: %d, Holder: %s, Balance: $ %.2f", numeroBanco, nome, banco.saque(saque));
        

    }
}
