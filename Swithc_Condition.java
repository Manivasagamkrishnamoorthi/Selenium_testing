package conditional_Statements;

public class Swithc_Condition {
	String Raja = "fighter";

	public void Rajaornot() {
		switch (Raja) {
		case "Dancer":

			System.out.println("Raja is a Dancer");
			break;
		case "Singer":
			System.out.println("Raja is a Singer ");
			break;
		case "fighter":
			System.out.println("Raja is a Fighter");
			break;

		default:
			System.out.println(Raja + "  is a not person");
		}
	}

	public static void main(String[] args) {
		Swithc_Condition Ra = new Swithc_Condition();
		Ra.Rajaornot();

	}

}
