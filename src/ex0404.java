import java.util.Scanner;

public class ex0404 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your complete name: ");
        String name = input.nextLine();
        String[] nm = name.split(" ");
        System.out.println(nm[1] + " ," + nm[0].charAt(0));
    }
}
