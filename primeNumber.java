import java.util.*;

// public class primeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number to check prime");
//         int num = sc.nextInt();
//         int count = 0;
//         for (int i = 1; i <= num; i++) {
//             if (num % i == 0) {
//                 count++;
//             }
//         }
//         if (count == 2) {
//             System.out.println("its prime");
//         } else {
//             System.out.println("its not prime ");

//         }
//     }
// }

// Find by using recursion 

public class primeNumber {

    public static boolean isPrime(int n, int divisor) {
        if (n <=1) {
            return false;

        }
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor-1);
    }

    public static void main(String[] args) {
        System.out.println("ENTER Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrimeNum=isPrime(num, num / 2);
        sc.close();
        System.out.println("Prime num "+num+" is "+isPrimeNum);
    


    }
}
