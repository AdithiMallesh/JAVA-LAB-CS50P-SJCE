/*  LAB CYCLE 1 
6. The daily maximum temperatures recorded for 5 cities during the first 6 days of January
month have to be tabulated. Develop an application to read the data and find the city and day
corresponding to highest temperature and lowest temperature. */
import java.util.Scanner; 

public class Temperature {
    public static void main(String[] args){
        float temp[][]=new float[3][3];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the temperature data:");
        for(int i=0;i<3;i++){
            System.out.println("City "+ (i+1) +":");
            for(int j=0;j<2;j++){
                System.out.print("Temperature on Day "+ (j+1) +": ");
                temp[i][j] = scanner.nextFloat();
            }
            System.out.println();
        }
        float maxTemp=temp[0][0];
        float minTemp=temp[0][0];
        int maxCity=0,maxDay=0,minCity=0,minDay=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                if(temp[i][j]>maxTemp){
                    maxTemp=temp[i][j];
                    maxCity=i;
                    maxDay=j;
                }
                if(temp[i][j]<minTemp){
                    minTemp=temp[i][j];
                    minCity=i;
                    minDay=j;
                }
            }
        }
        System.out.println("Max Temperature City: City "+(maxCity+1));
        System.out.println("Max Temperature Day: "+(maxDay+1));
        System.out.println("Max Temperature: "+(maxTemp));
        System.out.println("Min Temperature City: City "+(minCity+1));
        System.out.println("Min Temperature Day: "+(minDay+1));
        System.out.println("Min Temperature: "+(minTemp));
    }
}
