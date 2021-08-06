
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
	public static void loginCoordinatorMenu() {

		Helper.line(30, "-");
		System.out.println("School CCA Registration System - Coordinator");
		Helper.line(30, "-");

		System.out.println("1. Manage CCAs");
		System.out.println("2. Manage Registration");
		System.out.println("3. Quit");

	}
	public static void manageCCAMenu() {

		Helper.line(30, "-");
		System.out.println("Manage CCAs");
		Helper.line(30, "-");

		System.out.println("1. View all CCAs");
		System.out.println("2. View all CCA category");
		System.out.println("3. Add CCA details");
		System.out.println("4. Delete CCA");
		System.out.println("5. Add CCA category");
		System.out.println("6. Quit");

	}
	public static void manageRegistrationMenu() {

		Helper.line(30, "-");
		System.out.println("Manage Registrations");
		Helper.line(30, "-");

		System.out.println("1. View all Registrations");
		System.out.println("2. Change registration status");
		System.out.println("3. Quit");

	}

	
	public static void loginStudentParentMenu() { //Omar
		Helper.line(30, "-");
		System.out.println("School CCA Registration System - Coordinator");
		Helper.line(30, "-");

		System.out.println("1. Register for CCA");
		System.out.println("2. View registered CCA");
		System.out.println("3. Drop CCA");
	}
}
