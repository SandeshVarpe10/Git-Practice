import java.util.*;

class test{
	static int fact=1,sum=0;
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int no=sc.nextInt();
		
		boolean res=checkStrong(no);
		if(res)
			System.out.println("Strong");
		else
			System.out.println("Not a Strong");
	}
	
	public static boolean checkStrong(int no){
		int temp=no,rem;
		
		if(temp!=0){
			rem=temp%10;
			sum=sum+calfact(rem);
			fact=1;
			checkStrong(temp/10);
		}
		if(sum==no)
			return true;
		else
			return false;
	}
	
	public static int calfact(int rem){
			if(rem!=0){
				fact=fact*rem;
				calfact(rem-1);
			}
			return fact;
	}
}	