import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
  //Criando uma instanciaa do Scanner
    Scanner scanner = new Scanner(System.in);

    //solicitando o tamanho do Array
    System.out.println("Quantos numeros voce deseja inserir?");
    int tamanho = scanner.nextInt();

    //criando o Array
    int[] numeros = new int[tamanho];

    //inserindo os numeros mo Array
    for(int i = 0; i < tamanho; i++){
      System.out.println("Digite o numero" + (i + 1) + ":");
      numeros[i] = scanner.nextInt();
    }

    //ordenando o Array com o sort
    Arrays.sort(numeros);

    //Exibindo todos os numeros do Array
    for(int i = 0; i < tamanho; i++){
      System.out.println(numeros[i]);
    }

    //fechando o Scanner
    scanner.close();
  }
}