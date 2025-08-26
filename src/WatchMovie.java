import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        double price = input.nextDouble();
        System.out.print("Enter the movie rate (1-5) \n");
        double rate = input.nextDouble();
        input.close();

        if(price >= 12.0 && rate == 5){
            System.out.println("estou interessado em assistir o filme.");
        } else {
            System.out.println("não estou interessado em assistir o filme.");
        }

    }
}
