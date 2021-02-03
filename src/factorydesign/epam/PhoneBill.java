package factorydesign.epam;

import java.util.Scanner;

public class PhoneBill {
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the billing network");
		String inputData = sc.next();
		SelectNetworkFactory sf=new SelectNetworkFactory();
		CellularPlan cp = sf.getPlan(inputData);

		System.out.println("Enter the minutes ");
		int inputMinutes = sc.nextInt();
		sc.close();
		cp.getRate();
		System.out.println("The total cost of the call in rupees as per rate is:");
		cp.processBill(inputMinutes);
	}
}