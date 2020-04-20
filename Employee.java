package company;

public abstract  class Employee {
	
	private String name,department;
	private String [] NAME;
	private int age,performanceScore;
	
	public void setfullName(String Name) {
	  name = Name;
	  
	}
public String getfullName() {
		return name;
	}
    public String getfirstName() {
        NAME = name.split("-");
	    return NAME[0];
}
    public String getLastName() {
    	NAME = name.split("-");
		return NAME[1];
	}
    public void setage(int AGE) {
	  age = AGE;
}
public int getage() {
	return age;
}
    public void setdepartment(String DEPARTMENT) {
      department = DEPARTMENT;
}
public String getdepartment() {
	return department;
}
    public void setperformanceScore(int SCORE) {
      performanceScore = SCORE;
}
public int getperformanceScore() {
	return performanceScore;
}
   public abstract int getMonthlyPayment();
	public abstract int getsocialSecurity();
}
