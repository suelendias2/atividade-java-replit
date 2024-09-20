import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print("Digite algo:");
    String entrada = scanner.nextLine();

    //Tenta converter a entrada para um numero inteiro
    try{
      int numero = Integer.parseInt(entrada);
      System.out.println("voce digitou um numero inteiro:" + numero);
    } catch (NumberFormatException e){
      System.out.println("voce digitou uma string:" + entrada);
    }

    scanner.close();
  }


}