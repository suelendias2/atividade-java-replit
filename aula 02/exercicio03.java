//Definir a clase pessoa
class Pessoa{
  //Atributos da classe
  String nome;
  int idade;


//Construtor para inicializar os atributos
public Pessoa(String nome, int idade){
  this.nome = nome;
  this.idade = idade;
}
  //metodo para exibir as informaçoes de pessoa
  public void exibirInformacoes(){
    System.out.println("nome:" + nome);
    System.out.println("idade:" + idade);
  }
}

public class Main {
  public static void main(String[] args) {
    //criando um objeto pessoa
    Pessoa pessoa1 = new Pessoa("Suelen", 18);
    Pessoa pessoa2 = new Pessoa("Laura", 16);
    Pessoa pessoa3 = new Pessoa("Sofia", 16);
    
    pessoa1.exibirInformacoes();
    pessoa2.exibirInformacoes();
    pessoa3.exibirInformacoes();
  }
}