package company;

public class HourlyEmployee extends Employee{

	private int workingSessionsPerMonth;
	private int salary;
	private int shift = 8;
	private int MIN_HOURLY_WAGE_RATE;

	public HourlyEmployee(String name,int age,String department,int workingSessionsPerMonth,int performanceScore) {
		setfullName(name);
		setage(age);
		setdepartment(department);
		setperformanceScore(performanceScore);
		this.workingSessionsPerMonth = workingSessionsPerMonth;
		
		
	}
	public void calculatePersonalHourlyWage(){
		if(getperformanceScore() <=5) {
			MIN_HOURLY_WAGE_RATE = 50;
			
		}
		if(getperformanceScore()==6){	
			MIN_HOURLY_WAGE_RATE = 50+5;
		   }
		if(getperformanceScore()==7){	
			MIN_HOURLY_WAGE_RATE = 50+10;
		   }
		if(getperformanceScore()==8){	
			MIN_HOURLY_WAGE_RATE = 50+15;
		   }
		if(getperformanceScore()==9){	
			MIN_HOURLY_WAGE_RATE = 50+20;
		   }
		if(getperformanceScore()==10){	
			MIN_HOURLY_WAGE_RATE = 50+25;
		   }
	}
	public int getMonthlyPayment() {		
		return salary=workingSessionsPerMonth*shift*MIN_HOURLY_WAGE_RATE;
	}
	protected int getsocialSecurity() {
		
		return 0;
	}
}
