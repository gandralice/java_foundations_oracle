import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("mes como um numero: ");
        int mes_num = input.nextInt();
        String mes_string;
        switch (mes_num) {
            case 1: mes_string = "janeiro";
                break;
            case 2: mes_string = "fevereiro";
                break;
            case 3: mes_string = "marco";
                break;
            case 4: mes_string = "abril" ;
                break;
            case 5: mes_string = "maio";
                break;
            case 6: mes_string = "junho";
                break;
            case 7: mes_string = "julho";
                break;
            case 8: mes_string = "agosto";
                break;
            case 9: mes_string = "setembro";
                break;
            case 10: mes_string = "outubro";
                break;
            case 11: mes_string = "novembro";
                break;
            case 12: mes_string = "dezembro";
                break;
            default: mes_string = "mes invalido";
        }
        System.out.println("mes string: " + mes_string);
    }
}
