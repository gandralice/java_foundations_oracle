import java.util.Scanner;
//Converte a temperatura fornecida de Fahrenheit para Celsius.
public class ex0401 {
    private double fahrenheit;
    public ex0401(double fa) {
        this.fahrenheit = fahrenheit;
    }
    public double convertTemp (){
        return 5.0/9.0 *(this.fahrenheit - 32);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double faTemp = input.nextDouble();
        input.close();
        ex0401 conv = new ex0401(faTemp);

        System.out.println("Fahrenheit temperature is: "+ conv.convertTemp());

    }
}