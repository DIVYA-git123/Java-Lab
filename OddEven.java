import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
Output:
Enter the number :
153
Number is odd
