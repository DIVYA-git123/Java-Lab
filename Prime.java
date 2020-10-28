import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,i;
		int f=0;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner (System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				f=f+1;
		}
      if(f==2)
    	  System.out.println("Number is prime");
      else
    	  System.out.println("Number is not prime");
	}

}
Output:
Enter the number :
8
Number is not prime
