import java.util.Scanner;

public class ex0601 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 2321;
        System.out.println("enter your pin");
        int userPin = input.nextInt();
        while(userPin != pin){
            System.out.println("wrong pin");
            userPin = input.nextInt();
        }
        input.close();
        System.out.println("right pin");
    }
}
