package day5;
import java.util.Scanner;
public class PrimeFactors {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number to find Prime Factors of "); 
        int n=sc.nextInt();
       
        System.out.print("Prime Factors are : " );
        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if (n < 1) System.out.println(n);
    }



}
