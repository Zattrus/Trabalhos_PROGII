package Q08;

import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa extends Throwable{

    public void main(String[] args) {
        int x = 0;
        int y = 0;
        double r = 0;

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Eu sei dividir!");
            System.out.println("Informe o primeiro valor: ");
            x = teclado.nextInt();
            System.out.println("informe o segundo valor: ");
            y = teclado.nextInt();
            r = (x / y);

        }catch (InputMismatchException e) {
            System.out.println("Ops! Dados de entrada invalida");
        }catch (ArithmeticException e) {
            System.out.println("ERRO! O valor denominado e zero");
        }catch (java.lang.Exception e){
            System.out.println("ERRO INESPERADO!");
        }
        System.out.println("O resultado e " + r);
    }

    public static double r(int x, int y) {
        return x/y;
    }

    public static void soma() throws Exception {
        FileInputStream file = new FileInputStream("Eu sei somar");
        file.close();
    }

}
