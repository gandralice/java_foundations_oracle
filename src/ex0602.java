import java.util.Scanner;

public class ex0602 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number: ");
        int num = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        input.close();
    }
}
