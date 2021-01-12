/*  LAB CYCLE 1 
11. Write a program to read a list containing Book Title, Book Code, Cost and Quantity
interactively for min. of 10 books and produce a five column output as shown below.
NAME CODE UNIT PRICE QUANTITY TOTAL PRICE
Define the suitable functions and perform the transactions. */
import java.util.Scanner;

 class Book{
   
    int code, quantity;
    double amount, total;
    String name = new String();
    Scanner in = new Scanner(System.in);
    
    void read(){
        System.out.println("Enter the title and code:");
        name = in.nextLine();
        code = in.nextInt();
        System.out.println("Enter the total number of books and price of each book:");
        quantity = in.nextInt();
        amount = in.nextFloat();
    }
    
    void total(){
        total = quantity * amount;
    }
}

public class Main{
    public static void main (String[] args) {
        Book[] obj = new Book[10];
        System.out.println("Enter info of 10 books:");
        for (int i=0; i<10; i++){
            obj[i]=new Book();
            obj[i].read();
            obj[i].total();
        }
        
        System.out.println("Name \tCode \tUnit Price \t     Quantity \t Total Price");
        for(int i=0;i<10;i++){
        System.out.println(obj[i].name + "\t" + obj[i].code + "\t" + obj[i].amount + "\t\t\t" + obj[i].quantity + "\t" + obj[i].total);
        }
    }
}
    