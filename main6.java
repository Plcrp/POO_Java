import java.util.Scanner;
public class main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2 ; i < p ; i++){
            if(p%i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime == false){
            System.err.println("Não é primo!\n");
        } else{
            System.err.println("É primo!\n");
        }

        sc.close();
    }
}
