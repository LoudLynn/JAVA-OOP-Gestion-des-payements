package brief2_employe;
import java.util.Scanner;

public class MainEmploye {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nm,ln,d;
		double s, nmV,nmH,cms ;
		
		
		
		System.out.println("Enter ur  first name");
		nm =sc.nextLine();
		System.out.println("Enter ur  last name");
		ln =sc.nextLine();
		System.out.println("Enter ur  date of birth");
		d =sc.nextLine();
		
		
		
		
		String ef = "Atman"; //employeeFix
		String ec = "Maryam"; //employeeCommission
		String eh = "Elon"; //employeeHour

		
		if ( nm.equals(ef) ) {
			EmployeeFix emF = new EmployeeFix(nm, ln, d,2000); 	
			System.out.println(emF);
			
		} else if(nm.equals(ec)) {
			System.out.println("Enter sales number : ");
			nmV =sc.nextDouble();
			EmployeCommission emC = new EmployeCommission(nm, ln, d, 1000, nmV, 0.5); 
			System.out.println(emC);
			
		}
		if (nm.equals(eh)) {
			System.out.println("Enter Worked Hours : ");
			nmH =sc.nextDouble();
			EmployeHoraire emH = new EmployeHoraire(nm, ln, d, nmH, 50); 
			System.out.println(emH);

		}
		
		
		
		sc.close();
}
}
