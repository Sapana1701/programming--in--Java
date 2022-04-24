import java.util.*;

// By Sapana Mahajan

/*
  5 11 16 21
  22 27 32 37
  38 4 5 6
  7 12 12 18
  */
 class numseries2
 {
   public static void main(String args[])
   { 
     int num1= 5;
     int num2= 22;
     int num3= 4;
     int num4= 7;
     for(int i=1; i<=4; i++){
     System.out.println("\n");
      for(int j=2; j<=5; j++){
         if(i==1){
          System.out.print("\t\t"+num1);
          num1=5*j+1;
        }
        if(i==2){
          System.out.print("\t\t"+num2); 
          num2 +=5; //num2=num2+5
        }
        if(i==3){
        for(j=1; j<=4; j++){
          if(j==1)
          {
            System.out.print(" \t 38");
          }
          else{
            System.out.print("\t\t"+num3);
          num3++;
          }
        }
      }
        if(i==4){
          for(j = 1; j<= 4; j++){
            if( j == 1 || j == 2){
          System.out.print("\t\t"+num4); 
          
          num4 +=5;  //num4=num4+5
          }
          if( j == 3){
            num4 -= 3;
            System.out.print("\t\t"+num4); 
          }
          if( j == 4){
            num4 += 4;
            System.out.print("\t\t"+num4); 
          }
          }
        }
   }
 }
}
}
