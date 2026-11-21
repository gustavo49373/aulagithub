package Exercicios;
public class EntradaEmAgenda {
private int ano;
private int mes;
private int hora;
private int dia;
private String assunto;

public EntradaEmAgenda(int ano, int mes, int hora, int dia, String Assento){
    this.ano = ano;
    this.mes = mes;
    this.hora = hora;
    this.dia = dia;
    this.assunto = assunto;
}

@Override 
public String toString(){
    return dia + "/" + mes + "/" + ano + "ás " + hora + "h - " + assunto;   
}

public boolean ehNoDia(int d, int m, int a){
    return (this.dia == d && this.mes == m && this.ano == a);
}

}
