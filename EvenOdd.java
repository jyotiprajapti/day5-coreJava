package day5;
import java.util.Scanner;
public class EvenOdd {
	 public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter The Number:");
	        int i= sc.nextInt();
	        if(i%2==0){
	            System.out.println("This Number is Even");
	        }else if(i%2==1){
	            System.out.println("This Number is Odd");
	        }
	    }
}
