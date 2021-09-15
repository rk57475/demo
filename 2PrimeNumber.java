import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Enter the value: " + num);
		
		if(num % 1==0) 
		{
			if(num % num == 0)
			{System.out.println(num + " is a prime no.");}
			
			else 
				System.out.println(num + "is not a prime no");
		}
		
		}
	}
