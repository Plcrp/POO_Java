import java.util.Scanner;
import java.util.Random;

public class main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomKey = random.nextInt(100)+1;
        int number = sc.nextInt();

        while(number != randomKey){
            if(number > randomKey){
                System.out.println("Menor");
            }else{
                System.out.println("Maior");
            }
            number = sc.nextInt();
        }

        System.out.println("Parabéns!\n");

        sc.close();
    }
}
