import java.util.Scanner;

class PatternPrinter{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n = in.nextInt();
 	patternPrinter(n);
	 }
static void patternPrinter(int n) {
	int count=n, temp=n;
	while(n>0){
	count=temp;
	while(count>0){
	for(int i=0;i<n;i++){
	System.out.print(count+ " ");
	}
	count--;
	}	
	System.out.print(" ");
	n--;
	}
	}
}
