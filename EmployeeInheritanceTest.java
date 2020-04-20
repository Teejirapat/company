package company;

import java.util.ArrayList;

public class EmployeeInheritanceTest {

	public static void  main(String[] args) {
		ArrayList<Employee> person = new ArrayList<Employee>();
		person.add(new PermanentEmployee("Somchai-Hankla",40,"IT",8,20000));
		person.add(new PermanentEmployee("Somsong-Bunthum",22,"IT",4,12000));
		person.add(new HourlyEmployee("Manee-Dumkum",21,"Production",25,6));
		person.add(new HourlyEmployee("Piti-Rukthai",25,"Production",30,5));
		person.add(new HourlyEmployee("Veera-Rukdee",30,"Production",20,8));
		printMonthlyPaymentSlip(person);
		
	}
	public static void printMonthlyPaymentSlip(ArrayList<Employee> A) {
		
		for(Employee b:A) {
			System.out.println("******************************************************\n");
        System.out.println("\tPayment Slip of "+b.getfullName()+"\n");
        System.out.println("******************************************************");
        System.out.printf("First Name :"+b.getfirstName()+"\t");
        System.out.println("Last Name :"+b.getLastName()+"\n");
        System.out.printf("Department :"+b.getdepartment()+"\t");
        System.out.println("Age :"+b.getage()+"\n");
        
        System.out.printf("Monthly Payment:"+b.getMonthlyPayment()+" baht");
        if(b.getsocialSecurity()>0) {
        	System.out.println(" Social Security:"+b.getsocialSecurity()+" baht\n\n");
        }
        else
        	System.out.println("\n");
        
		}
		
	
	}			
}	
		
        
