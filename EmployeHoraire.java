package brief2_employe;

public class EmployeHoraire extends Employe {
    double hour;
    double rate;
	public EmployeHoraire(String firstName, String lastName,String birth,double hour,double rate) {
		super(firstName, lastName,birth);
		this.hour=hour;
		this.rate=rate;
	}
	@Override
	public Number calculateSalary() {
		
		return hour*rate;
	}
	@Override
    public String toString() {
	   return String.format("First name:"+ this.getFirstName()+"\nLast name:"+this.getLastName()+"\nDate of birth:"+this.getBirth()+"\nThe salary is "+calculateSalary() );
    }
	@Override
	public void ShowData() {
		 System.out.println("Hourly Employee :First Name :"+this.getFirstName()+"Last Name :"+ this.getLastName()+"Date of birth :"+this.getBirth()+"Salary :"+ calculateSalary());
		
	}
}
