import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double taxa = sc.nextDouble();
        double tempo = sc.nextDouble();

        System.out.printf("Juros = %.2f\n",valor*(taxa+1)*tempo);

        sc.close();
    }
}
