package labweek1work;
import java.util.Scanner;
public class sk_1prog5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i=0,r, max=0,ct=0;
		System.out.println("enter a number");
		n=s.nextInt();
		int a[]=new int [25];
		while(n>0)
		{
			r=n%2;
			a[i]=r;
			i++;
			n=n/2;
			
		}
		System.out.println("binary number is");
		for(i=i-1;i>=0;i--)
		{
			if(a[i]==1)
				ct++;
			else
			{
				if(ct>max)max=ct;
				ct=0;
			}
		}
		

	}

}
