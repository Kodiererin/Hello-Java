import java.util.Scanner;

public class Test_Circle {
   public static void main(String[] args) {

       int P; // For Creating A Square 
       int x, y;// Coordinates Of Square 
       int r;//Radius Of Circle
       int c;//Every Single Point Of Circle (Equation If Circle)

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Radius Of Circle : ");
       r = sc.nextInt();


       // Crate A Circle Of  P*P
       P = 2*r;



       // Draw A Square Of Size P*P.

       for (int i = 0; i <= P; i++){

           for (int j = 0; j <= P; j++){

               // Start From The Left Corner Of Circle
               x = r-i;
               y = r-j;

               c = x*x + y*y ;

//               (x-j)^2 + (y-k)^2 = a^2
//               lekin yha pe a^2 faltu me kyu lena
               
               //If Point (x,y) Is Inside The Circle
               if (c <= r*r+2 ) {
                   System.out.print("* ");
               }
               else {
                   // If (x,y) Is Outside Of Circle
                   System.out.print("  ");
               }


           }

           System.out.println();//Jump In A New Line
       }

   }

}