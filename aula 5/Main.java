import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      Random random = new Random();
      int numeroSecreto = random.nextInt(100)+1;
      int tentativa = 0;
      int chute;
      boolean acertou = false;

      while(!acertou){
          //Solicitando um numero para o usuario
          System.out.println("""
                             𝕛𝕠𝕘𝕠 𝕕𝕒 𝕒𝕕𝕚𝕧𝕚𝕟𝕙𝕒𝕔𝕒𝕠
                             """);
          System.out.println("Digite o numero entre 1 e 100");
          chute = scanner.nextInt();
          tentativa++;
          //verificando se o chute e maior ou menor que o numero secreto
          if(chute == numeroSecreto){
              System.out.println("parabens voce acertou o numero secreto em:" + tentativa + "tentativas");
        acertou = true;
          }else if (chute > numeroSecreto){
              System.out.println("O numero secreto e menor!tente novamente");
          }else{
              System.out.println("O numero e maior!tente novamente");
          }
          
      }
      scanner.close();
  }

}