import java.util.Scanner;

public class main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double i  = sc.nextDouble();
        double j = sc.nextDouble();

        System.out.printf("Área = %.2f\n",i*j);

        sc.close();


    }
}