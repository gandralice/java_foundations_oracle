import java.util.Random;
//Simula o giro de dois dados de seis lados e exibe a soma deles
public class ex0403 {
    public static void main(String[] args) {
        Random rand = new Random();
        int dado1 = rand.nextInt(6) + 1;
        int dado2 = rand.nextInt(6) + 1;
        int soma = dado1 + dado2;
        System.out.println("dado 1: " + dado1 + ", dado 2: " + dado2 + ", soma: " + soma);
    }
}
