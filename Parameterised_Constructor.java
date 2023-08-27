package constructor;

public class Parameterised_Constructor {
	String launch_name;
	String launch_type;

	public Parameterised_Constructor(String name, String type) {
		launch_name = name;
		launch_type = type;

	}

	public void sayaboutlaunch() {
		System.out.println("launchname is " + launch_name + " launch type is " + launch_type);
	}

	public static void main(String[] args) {
		Parameterised_Constructor launchdetails = new Parameterised_Constructor("Chicken", "nonveg");
		launchdetails.sayaboutlaunch();
	}

}
