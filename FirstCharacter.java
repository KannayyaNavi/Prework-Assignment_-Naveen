import java.util.Scanner;

class FirstCharacter{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String str=in.nextLine();
	splitWords(str);
	}
	public static void splitWords(String str){
	String words[] = str.split(" ");
	for(int i=0;i<words.length;i++){
	String s=words[i];
	System.out.print(s.charAt(0));
	}
	}
}		