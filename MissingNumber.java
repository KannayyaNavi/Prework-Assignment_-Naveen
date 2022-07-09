import java.util.Scanner;

class MissingNumber{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int a[]=new int[n-1];
	
	int sum1=0;
	for(int i=0;i<a.length;i++){
	a[i]=in.nextInt();
	sum1=sum1+a[i];
	}

	int sum2=0;
	for(int i=1;i<=n;i++){
	sum2=sum2+i;
	}
	System.out.println("Missing Number:"+ (sum2-sum1));
	}
}