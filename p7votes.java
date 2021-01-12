/* LAB CYCLE 1 
7.An election is contested by 5 candidates. The candidates are numbered 1 to 5 and the voting
is done by marking the candidate number on the ballot paper. Develop an application to read
the ballots and count the votes cast for each candidate using an array variable count. In case,
a number read is outside the range 1 to 5, the ballot should be considered as a spoilt ballot;
and the program should also count the number of spoilt ballots.*/

import java.util.Scanner;

public class ballot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,n;
        int arr[]={0,0,0,0,0,0};
        System.out.print("Enter the numbers of ballot that are going to be read: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("cast your votes[1-5]: ");
            x = sc.nextInt();
            if(x>=1 && x<=5){
                arr[x]++;
            }
            else{
                System.out.println("No candidate with that number.\nSpoilt ballot");
                arr[0]++;
            }
        }
        System.out.println("Total number of votes cast: "+n);
        for(int i=1; i<=5; i++){
            System.out.println("Total votes casted for candidate "+i+ " is "+arr[i]);
        }
        System.out.println("Number of spoilt ballots: "+arr[0]);
    }
}