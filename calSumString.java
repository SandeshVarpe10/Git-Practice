class calSumString{
	public static void main(String x[]){
		String s=new String("abc123mno456pqr");
		int len=s.length(),sum=0,num=0;
		char ch[]=new char[len];
		
		for(int i=0;i<len;i++){
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='0' && ch[i]<='9'){
				num=ch[i]-48;
				sum+=num;
			}
		}
		System.out.print("Sum of Digits are: "+sum);
	}
}	
		