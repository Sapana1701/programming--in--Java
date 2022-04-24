import java.util.*;
public class ascii
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character to print its ascii value:");
		char a=sc.next().charAt(0);
		int asciivalue=a;
		System.out.println(asciivalue);
   	}
}
