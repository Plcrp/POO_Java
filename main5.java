import java.util.Scanner;
public interface main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            double n = sc.nextDouble();

            for(int i = 1 ; i <= n ; i++){
                System.out.printf("%.2f\n",i*n);
            }

        sc.close();
    }
}
