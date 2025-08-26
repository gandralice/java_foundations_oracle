import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("insira um numero entre 1 e 10:");
        num = in.nextInt();
        in.close();
        if(num>10 || num<1){
            System.out.println("erro. numero invalido");
        }else {
            if(num%2==0){
                System.out.println("o numero " + num + " é par");
            }else {
                System.out.println("o numero " + num + " é impar");
            }
        }
        
    }
}
