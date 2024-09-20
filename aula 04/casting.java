

public class Main {
  public static void main(String[] args) {
   int meuInt = 10;
    double meuDouble = meuInt;

    System.out.println("valor do meuInt:"+ meuInt);
    System.out.println("valor do meuDouble apos o casting:"+ meuDouble);
    //casting explicito
    double outroDouble = 9.78;
    int outroInt = (int) outroDouble;

    System.out.println("esse e o valor do meu outroDouble:"+outroDouble);
    System.out.println("esse e o valor do meu outroInt:"+outroInt);
  }

 
}