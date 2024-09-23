
//Aproximacao do numero pI com n interações
public class Main {
  public static void main(String[] args) {
    int iteracoes = 10000;
    double pi = 0.0;

    // Iniciando a aproximacao
    for (int i = 0; i < iteracoes; i++) {
      if (i % 2 == 0) {
        pi += 1.0 / (2 * i + 1);
        System.out.println("Iteração:" + i + ":" + pi);
      } else {
        pi -= 1.0 / (2 * i + 1);
        System.out.println("Iteração:" + i + ":" + pi);
      }
    }
    pi *= 4; // Multiplicando o resultado por 4
    System.out.println("O numero aproximado foi:" + pi);
  }
}