/* LAB CYCLE 1 
13. Develop an application to find the area and volume of geometrical shapes (like rectangle,
triangle, circle, square, cube, cuboids and cylinder by overloading the necessary methods. */
import java.io.*;
public class geometry
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

        Cube c=new Cube();					//creating objects for all classes
        Cuboid cd=new Cuboid();
        Sphere s=new Sphere();
        Cylinder cr=new Cylinder();
        Square sq=new Square();
        Triangle t=new Triangle();
        Rectangle r=new Rectangle();
        Circle cl=new Circle();
        System.out.println("1. Cube");				//user input
        System.out.println("2. Cuboid");
        System.out.println("3. Sphere");
        System.out.println("4. Cylinder");
        System.out.println("5. Square");
        System.out.println("6. Triangle");
        System.out.println("7. Rectangle");
        System.out.println("8. Circle");

        System.out.println("enter your choice:");		//choice reading
        int a= Integer.parseInt(br.readLine());

        switch (a) 						//actions based on choice
        {
            case 1:

                System.out.println("Enter value for side:");
                Float side= Float.parseFloat(br.readLine());

                System.out.println("The surface area for cube is=" + c.surfaceArea(side));
                System.out.println("The volume of cube=" + c.volume(side));
                break;

            case 2:
                System.out.println("Enter value of length:");
                float length= Float.parseFloat(br.readLine());

                System.out.println("Enter value of breadth");
                Float breadth= Float.parseFloat(br.readLine());

                System.out.println("Enter value of height:");
                Float height= Float.parseFloat(br.readLine());

                System.out.println("Surface area of cuboid is=" + cd.surfaceArea(length,breadth,height));

                System.out.println("volume of cuboid is=" + cd.volume(length,breadth,height));
                break;


            case 3:

                System.out.println("Enter value for radius:");
                Float radius= Float.parseFloat(br.readLine());

                System.out.println("The surface area for Sphere is=" + s.surfaceArea(radius));
                System.out.println("The volume of Sphere=" + s.volume(radius));
                break;

            case 4:

                System.out.println("Enter value for radius:");
                float radius1= Float.parseFloat(br.readLine());

                System.out.println("Enter value for height:");
                float height1= Float.parseFloat(br.readLine());

                System.out.println("The surface area for Sphere is=" + cr.surfaceArea(radius1,height1));
                System.out.println("The volume of Sphere=" + cr.volume(radius1,height1));
                break;
            case 5: 
                System.out.println("enter value of side:");
                float side1=Float.parseFloat(br.readLine());
                
                System.out.println("the surface area for square is="+ sq.surfaceArea(side1));
                System.out.println("the volume for square is="+ sq.volume(side1));
                break;
                
            case 6:
                
                System.out.println("enter value of base:");
                float base=Float.parseFloat(br.readLine());
                
                System.out.println("enter value of height:");
                float height2=Float.parseFloat(br.readLine());
                System.out.println("the surface area for triangle is="+t.surfaceArea(base,height2));
                break;
              
            case 7: 
                System.out.println("enter value of length:");
                int length1=Integer.parseInt(br.readLine());
                 System.out.println("enter value of breadth:");
                int breadth1=Integer.parseInt(br.readLine());
                System.out.println("the surface area for rectangle is="+r.surfaceArea(length1,breadth1));
                break;
                
            case 8:
                System.out.println("enter value of radius:");
                double radius2= Double.parseDouble(br.readLine());
                System.out.println("the surface area for circle is="+cl.surfaceArea(radius2));
                break;
                

            case 9:
                System.exit(0);

            default:
                System.out.println("Invalid Entry!");
        }
    }
}

class Cube
{
    public float surfaceArea(float side) 	//surface area calculation
    {
        return 6*side*side;
    }

    public float volume(float side) 	//volume calculation using formula
    {
        return (side*side*side);
    }
}

class Cuboid
{
    public float surfaceArea(float length,float breadth,float height)
    {
        return (2*((length*breadth)+(breadth*height)+(height*length))) ;
    }

    public float volume(float length,float breadth,float height)
    {
        return (length*breadth*height );
    }
}

class Cylinder
{
    public float surfaceArea(float radius,float height)
    {
        return (2*22/7*radius*height );
    }

    public float volume(float radius,float height)
    {
        return (22/7*radius*radius*height );
    }
}

class Sphere
{
    public float surfaceArea(float radius)
    {
        return 4/3*22/7*radius*radius ;
    }

    public float volume(float radius)
    {
        return (4/3*22/7*radius*radius*radius );
    }
}
    class Square
{
    public float surfaceArea(float x)
    {
        return (x*x );
    }

    public float volume(float x)
    {
        return (x*x*x);
    }
}
    
     class Triangle
{
    public float surfaceArea(float base,float height)
    {
        return (1/2*(base*height) );
    }

    
}
     class Rectangle
{
    public int surfaceArea(int length,int breadth) 	//surface area calculation
    {
        return length*breadth;
    }

    public float volume(float side) 	//volume calculation using formula
    {
        return (side*side*side);
    }
}
     class Circle
{
    public double surfaceArea(double r) 	//surface area calculation
    {
        return (3.14*r*r);
    }
     }

    