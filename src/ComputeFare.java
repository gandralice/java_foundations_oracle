import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int fare;
        input.close();
        if(age <= 11){
            fare = 3;
        }else if(age > 11 && age < 65){
            fare = 5;
        }else {
            fare = 4;
        }
        System.out.print("Enter rate: " + fare);
    }
}
