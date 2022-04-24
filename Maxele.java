using System;

namespace MaxEle
{
  internal class program
  { 
    int i,n, max = 0;
    int [] arr = new int[10];
    
    
    void arr1()
    {
      
      Console.WriteLine("Enter the  Length Of Array ");
      n=Convert.ToInt32(Console.ReadLine());
      
      
      for(int i = 0; i < n; i++)
      {
        Console.WriteLine("Enter"+(i+1)+"Element :");
        arr[i] = Convert.ToInt32(Console.ReadLine());
        }
       }
       void Maxe()
       {
         for(i=0; i<10; i++)
         {
           if(arr[i] > max)
           {
             max = arr[i];
         }
       }
       Console.WriteLine("Maximum Element Is :" +max);
    }
    
       
   static void Main(string[] args)
   {
     program p = new program();
     p.arr1();
     Console.ReadLine();
     
   }
   
  }    
}
