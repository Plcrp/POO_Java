import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double in = scanner.nextDouble();

        if(in > 2500){
            System.out.printf("Imposto = %.2fR$\n", 0.2*(in-2500));
        } else{
            System.out.printf("Não paga imposto\n");
        }
        scanner.close();
    }
}
