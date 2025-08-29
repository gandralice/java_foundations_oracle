import java.sql.SQLOutput;
import java.util.Scanner;

public class ex0501 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o comprimento de onda em nanômetros: ");
        double comprimento = input.nextDouble();
        input.close();
        if(comprimento < 380 || comprimento >= 750) {
            System.out.println("comprimento invalido");
        } else if (comprimento < 450) {
            System.out.println("Violeta");
        } else if (comprimento < 495) {
            System.out.println("Azul");
        } else if (comprimento < 570) {
            System.out.println("Verde");
        } else if (comprimento < 590) {
            System.out.println("Amarelo");
        } else if (comprimento < 620) {
            System.out.println("Laranja");
        } else {
            System.out.println("Vermelho");
        }
    }
}
