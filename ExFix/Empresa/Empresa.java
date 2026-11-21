package ExFix.Empresa;
import java.util.Scanner;
public class Empresa extends Funcionario {
String setor;

public Empresa(String nome, float salario, String setor){
    super(nome, salario);
    this.setor = setor;
}

@Override 
public float bonificacao() {
    return super.getSalario() * 0.15F;
}

}
