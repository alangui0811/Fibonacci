import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el numero al que quieres llegar: ");
        int n = sc.nextInt();
        sc.close();
        int x = 0;
        int y = 1;
        int result = 0;
        System.out.println(x);

        while (result < n) {  
            result = x + y;
            if (result > n) {
                break;
            }
            System.out.println("," + result);
            x = y;
            y = result;
        }
    }
    //Nice    
}
