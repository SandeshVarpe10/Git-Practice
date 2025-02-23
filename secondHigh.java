import java.util.*;
	class secondHigh{
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			int a[]=new int[5];
			System.out.print("Enter elements: ");
			for(int i=0;i<a.length;i++)
				a[i]=sc.nextInt();
		
			int high=0,secHigh=0;
			for(int i=0;i<a.length;i++){
				if(a[i]>high){
					secHigh=high;
					high=a[i];
				}
				else if(a[i]>secHigh && a[i]<high){
					secHigh=a[i];
				}
			}
			System.out.print("Sec High is: "+secHigh);
		}
	}