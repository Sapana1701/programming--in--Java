/*Write a Java Program to Demonstrate use of
 Method overloading.
SYBCA 44 Mahajan sapana prakash  */


import java.util.*;

 class meoverload
 {
   void read(int x)
   {
     System.out.println("One value="+x*x);
   }
   void read (int a,int b)
   {
     System.out.println("One value="+a*a+"Second="+b*b);
   }
   void read (int j, int k,int l)
   { 
    System.out.println("One value="+j*j+"Second="+k*k+"Third="+l*l);
   }
 }
class methover
{
  public static void main(String []args)
  {
   meoverload me= new meoverload();
  me.read(4);
  me.read(3,4);
  me.read(3,4,5);
}
}
