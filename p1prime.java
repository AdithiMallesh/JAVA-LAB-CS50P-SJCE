/* lab cyle 1 
1. To generate and print prime numbers for the given range. */
import java.util.Scanner;
//class 
public class prime
{
  public static void main(String[] args)
  {
    Scanner myScan = new Scanner(System.in);
    //declare variables
    int a, b, i, j;
    boolean flag;
    // ask for lower limit
    System.out.printf("Enter the lower limit of range: ");
    a=myScan.nextInt();//taking input
    // ask for higher limit
    System.out.printf("Enter the upper limit of the range: ");
    b=myScan.nextInt();//taking input8
    System.out.println("The Prime numbers in the given range are: ");
        // Traverse each number in the interval
        // with the help of for loop
    for(i=a;i<=b;i++)
    {
             // Skip 0 and 1 as they are
            // niether prime nor composite
      if(i==1||i==0)
      {
        continue;}
      flag= true;
for(j=2; j<=i/2;++j)
      {if(i%j==0)
      { flag=false;
          break; } }
      if (flag==true)
      {
        System.out.println(i);
      }
    }}}