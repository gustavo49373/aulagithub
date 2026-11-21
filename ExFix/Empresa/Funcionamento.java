package ExFix.Empresa;
import java.util.Scanner;

public class Funcionamento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //I liked it
        String nome;
        float salario;
        
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite seu salario: ");
        salario = sc.nextFloat();

        Funcionario x = new Funcionario(nome, salario);
        Empresa c = new Empresa("Maria", 3000, "3");
        System.out.printf("Nome: %s\nSalario com bonificacao: %.2f",x.nome(),  x.getSalario());
        System.out.print(c.bonificacao());
    }

}
