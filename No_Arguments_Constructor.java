package constructor;

public class No_Arguments_Constructor {
	int Employeeid;
	String Employeename;

	public No_Arguments_Constructor() {
		Employeeid = 07;
		Employeename = "Manivasagam";
		System.out.println("Employee object is created ");
		System.out.println(Employeeid);
	}

	public static void main(String[] args) {
		No_Arguments_Constructor Employeedetails = new No_Arguments_Constructor();

	}

}
