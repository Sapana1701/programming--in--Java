
import java.util.*;
import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:- ");
		String a=sc.next();
		int y=a.length();
		System.out.println("The length of string is:- "+y);
		String z=a.toUpperCase();
		System.out.println("String in uppercase:- " +z);
		String l=a.toLowerCase();
		System.out.println("String in lowercase:- " +l);
		char m=a.charAt(3);
		System.out.println("Character index 3 is:- " +m);
        String o=a.replace('a','b');
  		System.out.println("String after replacing:- " +o);
  		String n=a.substring(2,5);
        System.out.println("Sub string from 2 to 5:- " +n);
        System.out.println("enter the character to find index:- ");
        String s=sc.next();
        int k=a.indexOf(s);
        System.out.println("Index of "+s+" is "+k);
        String myStr="Hello planet earth you are a great planet.";
        System.out.println(myStr.lastIndexOf("planet"));
        System.out.println("Enter the first String:- ");
        String str1=sc.next();
        System.out.println("Enter the second String:- ");
        String str2=sc.next();
        String cnct=str1.concat(str2);
        System.out.println("concateneted String is:- " +cnct);
        boolean b1=a.equals(str1);
        if(b1==true)
        {
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal")
}
}
