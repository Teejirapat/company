package company;

public class EmployeeInheritanceTest {

	public static void printMonthlyPaymentSlip(String[] salary)
			{
				
			}
	public static void  main(String[] args) {
		
		PermanentEmployee PER1= new PermanentEmployee("Somchai-Hankla",40,"IT",8,20000);
		PermanentEmployee PER2= new PermanentEmployee("Somsong-Bunthum",22,"IT",4,12000);
		HourlyEmployee H1 = new HourlyEmployee("Manee-Dumkum",21,"Production",25,6);
		HourlyEmployee H2 = new HourlyEmployee("Piti-Rukthai",25,"Production",30,5);
		HourlyEmployee H3 = new HourlyEmployee("Veera-Rukdee",30,"Production",20,8);
		
		System.out.println("******************************************************\n");
        System.out.println("\tPayment Slip of "+PER1.getfullName()+"\n");
        System.out.println("******************************************************");
        System.out.printf("First Name :"+PER1.getfirstName()+"\t");
        System.out.println("Last Name :"+PER1.getLastName()+"\n");
        System.out.printf("Department :"+PER1.getdepartment()+"\t");
        System.out.println("Age :"+PER1.getage()+"\n");
        System.out.printf("Monthly Payment:"+PER1.getMonthlyPayment()+" baht");
        System.out.println(" Social Security:"+PER1.getsocialSecurity()+" baht\n\n");
        
        System.out.println("******************************************************\n");
        System.out.println("\tPayment Slip of "+PER2.getfullName()+"\n");
        System.out.println("******************************************************");
        System.out.printf("First Name :"+PER2.getfirstName()+"\t");
        System.out.println("Last Name :"+PER2.getLastName()+"\n");
        System.out.printf("Department :"+PER2.getdepartment()+"\t");
        System.out.println("Age :"+PER2.getage()+"\n");
        System.out.printf("Monthly Payment:"+PER2.getMonthlyPayment()+" baht");
        System.out.println(" Social Security:"+PER2.getsocialSecurity()+" baht\n\n");
        
        System.out.println("******************************************************\n");
        System.out.println("\tPayment Slip of "+H1.getfullName()+"\n");
        System.out.println("******************************************************");
        System.out.printf("First Name :"+H1.getfirstName()+"\t");
        System.out.println("Last Name :"+H1.getLastName()+"\n");
        System.out.printf("Department :"+H1.getdepartment()+"\t");
        System.out.println("Age :"+H1.getage()+"\n");
        H1.calculatePersonalHourlyWage();
        System.out.println("Monthly Payment:"+H1.getMonthlyPayment()+" baht\n\n");
        
        System.out.println("******************************************************\n");
        System.out.println("\tPayment Slip of "+H2.getfullName()+"\n");
        System.out.println("******************************************************");
        System.out.printf("First Name :"+H2.getfirstName()+"\t");
        System.out.println("Last Name :"+H2.getLastName()+"\n");
        System.out.printf("Department :"+H2.getdepartment()+"\t");
        System.out.println("Age :"+H2.getage()+"\n");
        H2.calculatePersonalHourlyWage();
        System.out.println("Monthly Payment:"+H2.getMonthlyPayment()+" baht\n\n");
 
        
        System.out.println("******************************************************\n");
        System.out.println("\tPayment Slip of "+H3.getfullName()+"\n");
        System.out.println("******************************************************");
        System.out.printf("First Name :"+H3.getfirstName()+"\t");
        System.out.println("Last Name :"+H3.getLastName()+"\n");
        System.out.printf("Department :"+H3.getdepartment()+"\t");
        System.out.println("Age :"+H3.getage()+"\n");
        H3.calculatePersonalHourlyWage();
        System.out.println("Monthly Payment:"+H3.getMonthlyPayment()+" baht\n\n");

        
        
       
	}

}
