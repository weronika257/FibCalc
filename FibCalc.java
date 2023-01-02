import java.util.Scanner;

public class FibCalc{
    public static void main(String[] args){
        
        System.out.println("FibCalc");
        System.out.println("Weronika Studzińska");
        System.out.println("Grupa 1.4");
        System.out.println("-------------------------------------------------------");
        System.out.println("Podaj numer elementu ciągu fibonacciego: ");
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println("WYNIK: F"+n +" = " + fibo(n));
    }

    static int fibo(int n){
        
        int fib[] = new int[n+1]; 
        
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i = 2; i <= n; i++){
            fib[i] = fib[i-2] + fib[i-1];
        }
        
        return fib[n];
    }
}