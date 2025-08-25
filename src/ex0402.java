import java.util.Scanner;
//Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados.
public class ex0402 {
    private int ladoA;private int ladoB;
    public ex0402(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public double hypotenuse(){
        return Math.sqrt(ladoA*ladoA + ladoB*ladoB);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("lado a: ");
        int a = input.nextInt();
        System.out.print("lado b: ");
        int b = input.nextInt();
        input.close();
        ex0402 hyp = new ex0402(a,b);
        System.out.println("hypotenuse: "+ hyp.hypotenuse());
    }
}
