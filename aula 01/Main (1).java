import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // criando um objeto Scanner para ler o teclado
    Scanner scanner = new Scanner(System.in);

    // solicitando o nome do usuario
    System.out.print("digite o seu nome");
    String nome = scanner.nextLine();

    // solicitando o nome do usuario
    System.out.print("digite o sua idade");
    String idade = scanner.nextLine();

    // exibindo o que o usuario digitou no teclado
    System.out.println("ola" + nome + "! sua idade é:" + idade);

    // fechando o scanner
    scanner.close();
  }
}