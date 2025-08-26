import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.close();
        boolean drivingUnderAge = false;
        if(age<18){
            drivingUnderAge = true;
        }
        System.out.println("drivingUnderAge: "+drivingUnderAge);
       
    }
}
