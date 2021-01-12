/* LAB CYCLE 1 
8. Given are two one dimensional array A and B which are sorted in ascending order. Develop
an application to merge them into a single sorted array C that contains every item form A and
B, in ascending order. */
import java.util.Scanner;

public class mergesort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;

        //read array 1
        System.out.print("Enter the number of elements in array 1: ");
        n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elemnts of the sorted array: ");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        //read array 2
        System.out.print("Enter the number of elements in array 2: ");
        n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elemnts of the sorted array: ");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        //merging 2 arrays
        int[] array = new int[n1+n2];
        int i,j,k;
        for(i=0, j=0, k=0; i<n1 && j<n2; k++){
            if(arr1[i]<=arr2[j]){
                array[k] = arr1[i];
                i++;
            }
            else{
                array[k] = arr2[j];
                j++;
            }
        }
        while(i<n1){
            array[k] = arr1[i];
            k++;
            i++;
        }
        while(j<n2){
            array[k] = arr2[j];
            j++;
            k++;
        }

        System.out.print("The merged array is: [ ");
        for(int m=0; m<n1+n2; m++){
            System.out.print(array[m]+" ");
        }
        System.out.print("]");
    }
}
    
