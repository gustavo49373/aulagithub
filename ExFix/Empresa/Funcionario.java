package ExFix.Empresa;

 public class Funcionario {
    private String nome;
    private float salario;
 
    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public float bonificacao(){
        return this.salario *= 0.95;
    }    

    public String nome(){
        return this.nome;
    }
    public float getSalario(){
        return this.salario;
    }
}