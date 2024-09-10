import java.util.Scanner;
//somando dois numeros

public class Main {
  public static void main(String[] args) {
    // criando um objeto Scanner
    Scanner scanner = new Scanner(System.in);

    // Digite o primeiro numero
    System.out.print("Digite o primeiro numero:");
    int num1 = scanner.nextInt();

    // Digite o segundo numero
    System.out.print("Digite o segundo numero:");
    int num2 = scanner.nextInt();

    // somando os dois numeros
    int soma = num1 + num2;

    // Exibindo o resultado
    System.out.println("A soma é:" + soma);

    // fechando o scanner
    scanner.close();
  }
}