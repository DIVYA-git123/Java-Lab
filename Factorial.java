import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,f=1;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
			System.out.println("Factorial of the number is "+f);

	}

}
Output:
Enter the number: 
6
Factorial of the number is 720
