package week1.day2;

public class EmployeeDetails {
public void employeeName() {
	String EmployeeName= "Sreedhar varma";
	int EmployeeId= 148;
	System.out.println("Employee Name="+EmployeeName);
	System.out.println("Employee Id="+EmployeeId);
}
public void EmployeeAddress() {
	String EmployeeAddress="Chennai";
	System.out.println("Employee Address="+EmployeeAddress);
}
public void EmployeeSalary() {
	double EmployeeSalary= 49999.99;
	System.out.println("Employee Salary="+EmployeeSalary);
}
public void EmployeeMobileNo() {
	long EmployeeMobileNo= 6309472214L;
	System.out.println("Employee Mobile No="+EmployeeMobileNo);
	
}
public static void main(String[] args) {
	EmployeeDetails details= new EmployeeDetails();
	details.employeeName();
	details.EmployeeAddress();
	details.EmployeeSalary();
	details.EmployeeMobileNo();
	
	
	
}
}
