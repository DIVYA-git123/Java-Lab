import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n =sc.nextInt();
		System.out.println("Factors of the given number is: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i+"   ");
		}

	}

}
Output:
Enter the number :
6
Factors of the given number is: 
1 2 3 6
