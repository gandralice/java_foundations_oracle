import java.util.Scanner;
public class StringEquality {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String name = input.nextLine();
       input.close();
       if(name.equals("Moe")){
           System.out.println("Você é o rei do rock and roll");
       }else {
           System.out.println("Você não é o rei");
       }
   }
    
}

