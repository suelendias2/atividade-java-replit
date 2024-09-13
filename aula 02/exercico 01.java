import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //instanciando o objeto Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos numeros voce deseja inserir?");
    int tamanho = scanner.nextInt();

    //Criando uma array para armazenar os numeros
    int[] numeros = new int[tamanho];

    //preenchendo todo o array
    for(int i = 0; i < tamanho; i++){
      System.out.print("Digite o numero" + (i+1)+":");
      numeros[i] = scanner.nextInt();
    }

    //Exibindo todos os valores do Array
    System.out.println("voce inseriu os numeros:");
    for(int i = 0; i < tamanho; i++){
      System.out.println(numeros[i]);
    }
    scanner.close();
  }
}