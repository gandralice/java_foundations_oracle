import java.util.Scanner;

public class ex0502 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cod cor sinal de transito (1 vermelho, 2 verde, 3 amarelo): ");
        int cod = input.nextInt();
        input.close();
        String prox;
        switch(cod) {
            case 1: prox = "verde"; break;
            case 2: prox = "amarelo"; break;
            case 3: prox = "vermelho"; break;
            default: prox = "cod invalido";
        }
        System.out.println(prox);
    }
}
