import java.util.Scanner;

public class main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double real = sc.nextDouble();

        System.out.printf("Valor convertido: %.2fR$\n",(real/5.80));

        sc.close();
    }
}