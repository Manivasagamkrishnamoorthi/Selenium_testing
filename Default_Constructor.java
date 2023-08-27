package constructor;
/*Constructor 
constructor name must be the same as its class name 
must not have explicit return type 
connot be abstract, static,final,and synchronized 
type of constuctors default,no arguments,parameterized
 */

public class Default_Constructor {
	String Employeename;
	int Employeeno;

	public static void main(String[] args) {
		Default_Constructor Employee = new Default_Constructor();
		System.out.println(Employee.Employeename);
		System.out.println(Employee.Employeeno);
	}

}
