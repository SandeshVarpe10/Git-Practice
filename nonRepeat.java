/*
	Q3. Problem Statement:
	Write a Java program to find the first non-repeating character in a character array.
	Example:
	Input: ['a', 'b', 'c', 'a', 'b', 'd']
	Output: c
*/
import java.util.*;
class nonRepeat{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[6];
		System.out.println("Enter Elements: ");
		for(int i=0;i<ch.length;i++)
			ch[i]=sc.next().charAt(0);
		
		int ind=0;
		for(int i=0;i<ch.length-1;i++){
			if(ch[i]!='*'){
				int count=1;
				for(int j=i+1;j<ch.length;j++){	
					if(ch[i]==ch[j]){
						ch[j]='*';
						count++;
					}
				}
				if(count==1){
					System.out.println("Non repeating character: "+ch[i]);
					break;
				}
			}
		}
	}
}			