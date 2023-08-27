package basicJava;

public class My_Profile {

	int profile_no = 07;
	String profile_name = "Manivasagam";
	// Wrappercalss
	Integer Profile_balance = 500;
	Long Contact = 1234567890l;

	public void get_profile_no() {
		System.out.println("profile no is " + profile_no);
	}

	public void get_profile_name() {
		System.out.println("my profile name is " + profile_name);

	}

	// Returntypes
	public Long Mycontact() {
		System.out.println("mycontactno is " + Contact + "save to you");
		return Contact;

	}

	public static void main(String[] args) {
		// Objectcreation
		My_Profile Account = new My_Profile();
		Account.get_profile_name();
		Account.get_profile_no();
		// below method is retuntype using
		Long mycontact_is = Account.Mycontact();
		System.out.println(mycontact_is);

	}

}
