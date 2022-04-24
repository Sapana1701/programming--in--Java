import java.util.Scanner;
 
 // Sapana Mahajan
 
 // Main Class
 class SapnaVowels
{
  public static void main(String args[])
  {
    
  // Creating Object Of Scanner Class
  Scanner src = new Scanner(System.in);
  
  // print Message 
  System.out.println("Enter A String :");
  // Store User Enter String In Str Variable
  String str = src.nextLine();
  
  // Store Length Of String In end Variable
  int end = str.length();
  // This Is Count How Many Vowels
  int times = 0;
  // Checking Variable
  int cr;
  
  
  // Loop for Analyse Full String
  for(int i = 0; i < end;i++){
     // Store Character At Which Index
     cr = str.charAt(i);
     
     // Checking Vowels
     if (cr == 'A' || cr == 'a' || cr == 'E' || cr == 'e' || cr == 'I' || cr == 'i' || cr == 'O' || cr == 'o')
      // When If Is Increament With One 
      times++;
   }
  
  
   
   
   // Print How Many Vowels
   System.out.println("Vowels In This String Is : "+times);
   }
 }
