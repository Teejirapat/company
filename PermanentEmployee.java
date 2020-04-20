package company;

public class PermanentEmployee extends Employee{
	
	private int salary;
	private int realsalary;
	private int socialSecurity;
	
	public PermanentEmployee(String name,int age,String department,int performanceScore,int salary) {
		setfullName(name);
		setage(age);
		setdepartment(department);
		setperformanceScore(performanceScore);
        this.salary =salary;
	}

	public int getMonthlyPayment() {
		socialSecurity = (salary/100)*5;
		if(socialSecurity>750) {
			socialSecurity = 750;
		}
		return realsalary = salary-socialSecurity;
	}
	public int getsocialSecurity() {
		
		return socialSecurity;
	}	
}
