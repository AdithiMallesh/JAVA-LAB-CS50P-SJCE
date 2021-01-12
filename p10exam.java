/*10. The annual examination results of 20 students are to be tabulated as follows:
Roll No. Subjec-1 Subject-2 Subject 3
Develop an application to read the data and determine the following:
a) Total marks obtained by each student.
b) The highest marks in each subject and the Roll No. of the student who secured it.
c) The student who obtained the highest total marks. */
import java.util.*;
public class stulist {
    
    
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    
    // creates an array of integer to hold the 20 marks.

int [] regno= new int[20];
int [] sub1 = new int[20];
int [] sub2 = new int[20];
int [] sub3 = new int[20];

    int [] total =new int[20];
    int max1=0;
int max2=0;
int max3=0;
    //read 20 numbers from the keyboard using a loop
    System.out.println("Enter student details:");
    for (int i=0;i<20;i++)
{
System.out.println("Enter student register number:");
regno[i]=in.nextInt();
System.out.println("Enter student marks in 3 subjects:");
      sub1[i]=in.nextInt();//assign the mark to the array
	sub2[i]=in.nextInt();
sub3[i]=in.nextInt();
      //we assume marks will be entered correctly
      total[i] =sub1[i]+sub2[i]+sub3[i];//add mark to the current total

    }//end of for
System.out.println("Entered student details are :");
System.out.println("register number : \tsub1 :\t sub2: \t sub3" );
 for (int i=0;i<20;i++) 
{
 System.out.println(+regno[i]+"\t\t\t" +sub1[i]+"\t " +sub2[i] + "\t " +sub3[i]);


    }//end of for

    //display all the numbers and prints out the average
    System.out.println("The numbers entered are:");
    System.out.println("register number : \tsub1 :\t sub2: \t sub3" );
    for (int i=0;i<20;i++)
    {
System.out.println("");
System.out.println(+regno[i]+"\t\t\t" +sub1[i]+"\t " +sub2[i] + "\t " +sub3[i]+"\t"+total [i]);
    }
 


         int p ;
           
         // Initialize maximum element 
          max1 = sub1[0]; 
         // Traverse array elements from second and 
         // compare every element with current max   
         for (p= 1; p< sub1.length ; p++)
             if (sub1[p]> max1) 
             
                 max1 = sub1[p];
                
        
         System.out.println("maximum of sub1 and regno "+ max1 + p);
             
         
         int q;
           
         // Initialize maximum element 
          max2 = sub2[0]; 
     //   int heighestreg=regno[0];
         // Traverse array elements from second and 
         // compare every element with current max   
         for (q= 1; q< sub2.length ;q++)
             if (sub2[q]> max2) 
             
                 max2 = sub2[q];
                
        
         System.out.println("maximum of sub2 and regno "+ max2);
         
         int k; 
           
         // Initialize maximum element 
          max3 = sub3[0]; 
     //   int heighestreg=regno[0];
         // Traverse array elements from second and 
         // compare every element with current max   
         for (k = 1; k < sub3.length ; k++) 
             if (sub3[k] > max3) 
             
                 max3 = sub3[k];
                
        
         System.out.println("maximum of sub3 and regno "+ max3);
             

    
  }//end of main
}