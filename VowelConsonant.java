package day5;
import java.util.Scanner;
public class VowelConsonant {
	
  
    static public void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter a character");
    	char y = sc.next().charAt(0);
    	if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u' ||y == 'A' || y == 'E' || y == 'I' || y == 'O'
                || y == 'U')
                System.out.println("It is a Vowel.");
            else
                System.out.println("It is a Consonant.");
    }
}
