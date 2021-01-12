/* 12. Given that an EMPLOYEE class contains the following members:
Members: Employee ID, Employee Name, Department name &amp; Basic Pay
Methods: To read each employee details, to calculate Gross Pay and to print the employee
details.
Develop an application to read data of N employees and compute the Gross Pay and Net Pay of
each employee.
Gross Pay = Basic Pay + DA + HRA (DA = 58% of Basic Pay, HRA = 16% of Basic Pay)
Net Pay = Gross – Income Tax
Income Tax calculated as follows:
Gross Pay - Up to 2 lakhs - Nil
Above 2 and up to 3 lakhs - 10% of the Gross Pay
Above 3 and up to 5 lakhs - 15% of the Gross Pay and
Above 5 lakhs 30 % of the Gross Pay, an additional charge of 2% of the tax will be added
to total tax */
import java.util.Scanner;
//declare class//
 class Employee{
      //declare string// 
   String name = new String();
   int ID;
   String Dept;
   double basic,Gross_pay,Net_pay,Tax;
   Scanner in = new Scanner(System.in);
 
    void read(){
    System.out.println("Enter the name:");
    name=in.nextLine();
    System.out.println("Enter the department:");
    Dept=in.nextLine();
    System.out.println("Enter ID:");
    ID=in.nextInt();
    System.out.println("Enter Basic Salary:");
    basic=in.nextInt();
    }

   void compute(){
    Gross_pay=basic + 0.58*basic + 0.16*basic;
      
 	if(Gross_pay<=200000)
	  Tax=0;
	else if(Gross_pay<300000)
	  Tax=0.1*Gross_pay;
	else if(Gross_pay<500000)
	  Tax=0.15*Gross_pay;
	else{
          Tax=0.3*Gross_pay;
          Tax=0.02*Tax;
        }
     
    Net_pay=Gross_pay-Tax;
   }

}

    public  class Main{
	public static void main(String args[]){
 	int n;
	System.out.println("Enter the number of employee:");
	Scanner in= new Scanner (System.in);
	n = in.nextInt();
	
     Employee[] obj = new Employee[n];

	for(int i=0;i<n;i++){
	 obj[i]=new Employee();
	 obj[i].read();
	 obj[i].compute();

	}
	
    System.out.println("Name\t ID\t Department\t basic\t Gross pay\t Net pay");
        
	for(int i=0;i<n;i++)
	System.out.println(obj[i].name+ "\t" + obj[i].ID + "\t" + obj[i].Dept + "\t  " + obj[i].basic  + "\t  " + obj[i].Gross_pay + "\t\t" + obj[i].Net_pay);
     }
  } 
