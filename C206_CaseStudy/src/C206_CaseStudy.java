
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int mainMenuOption = 0;
	while (mainMenuOption != 5) {
		mainMenu();
		mainMenuOption = Helper.readInt("Enter an option > ");
	}
	
		
	}
	public static void loginMenu() {
		Helper.line(30, "-");
		System.out.println("School CCA Registration System - LOGIN");
		Helper.line(30, "-");
	}

	public static void mainMenu() {

		Helper.line(30, "-");
		System.out.println("School CCA Registration System");
		Helper.line(30, "-");

		System.out.println("1. Login as administrator");
		System.out.println("2. Login as coordinator");
		System.out.println("3. Login as student or parent");
		System.out.println("4. Registration to System");
		System.out.println("5. Quit");

	}
	public static void loginAdministratorMenu() {

		Helper.line(30, "-");
		System.out.println("School CCA Registration System");
		Helper.line(30, "-");

		System.out.println("1. Login as administrator");
		System.out.println("2. Login as coordinator");
		System.out.println("3. Login as student or parent");
		System.out.println("4. Registration to System");
		System.out.println("5. Quit");

	}
	

	

}
