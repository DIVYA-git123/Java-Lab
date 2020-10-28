import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int n,i,s=0;
		System.out.println("Enter the value of n : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			s=s+i;
		}
       System.out.println("Sum is "+s);
	}

}

Output:
Enter the value of n :
5
Sum is 15 
