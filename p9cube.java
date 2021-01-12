/* LAB CYCLE 1 
9. Create a class of objects CUBE. Develop an application to read the side for three cubes and
print the Volume and outer area. */

import java.util.Scanner;

class CUBE{
    double volume (double s){
        return s*s*s;
    }

    double area (double s){
        return 6*s*s;
    }
}

public class cubefunc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CUBE ob = new CUBE();
        double s;
        for(int i=0; i<3; i++){
            System.out.print("Enter the side of the square: ");
            s = sc.nextDouble();
            System.out.println();
            System.out.println("The area of the given cube with side "+s+" is "+ob.area(s));
            System.out.println("The volume of the given cube with side "+s+" is "+ob.volume(s));
            System.out.println();
        }
    }
}