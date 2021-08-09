import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CCA> ccaList = new ArrayList<CCA>();

		ccaList.add(new CCA("Lego Expert", "Designing and building using Lego", 25, 
				"Thursday", "3.00pm - 4.00pm", "Class room A", "Albert"));
		ccaList.add(new CCA("Jewellery Making", "Make a variety of jewellery items",15,
				"Wednesday","3.00pm - 4.00pm", "Class room B", "Malvin"));


		int mainMenuOption = 0;
		while (mainMenuOption != 7) {
			mainMenu();
			mainMenuOption = Helper.readInt("Enter an option > ");

			if (mainMenuOption == 1) {
				loginAdministratorMenu();
			} else if (mainMenuOption == 2) {
				loginCoordinatorMenu();
			} else if (mainMenuOption == 3) {
				loginStudentParentMenu();
			} else if (mainMenuOption == 5) {
				manageCCAMenu();
				int manageCCAMenuOption = 0;
				if (manageCCAMenuOption == 1) {
					C206_CaseStudy.viewAllCCA(ccaList);
				}
			}
		}

	}

	////////// Main menu //////////
	public static void mainMenu() { // xixin

		Helper.line(30, "-");
		System.out.println("School CCA Registration System");
		Helper.line(30, "-");

		System.out.println("1. Login as administrator");
		System.out.println("2. Login as coordinator");
		System.out.println("3. Login as student or parent");
		System.out.println("4. Registration to System");
		System.out.println("5. View all CCAs");
		System.out.println("6. View all CCA category");
		System.out.println("7. Quit");

	}

	////////// Admin menu //////////
	public static void loginAdministratorMenu() { // Sean

		Helper.line(30, "-");
		System.out.println("Admin login");
		Helper.line(30, "-");

		String adminUser = Helper.readString("Enter Username: > ");
		String adminPass = Helper.readString("Enter Password: > ");

		if (adminUser.equals("admin") && adminPass.equals("admin")) {
			int adminOption = 0;
			while (adminOption != 4) {
				Helper.line(30, "-");
				System.out.println("Admin Menu");
				Helper.line(30, "-");

				System.out.println("1. View all students");
				System.out.println("2. Add students");
				System.out.println("3. Delete student");
				System.out.println("4. Quit");

				adminOption = Helper.readInt("Enter option: > ");

				switch (adminOption) {
				case 1:
					// view all student
					break;
				case 2:
					// add student
					break;
				case 3:
					// delete student
					break;
				default:
					if (adminOption != 4) {
						System.out.println("Invalid input");
					}

					break;
				}
			}

		}
		else {
			System.out.println("Invalid Username or Password");
		}

	}

	////////// Coordinator menu //////////
	public static void loginCoordinatorMenu() { // xixin

		Helper.line(30, "-");
		System.out.println("School CCA Registration System - Coordinator");
		Helper.line(30, "-");

		System.out.println("1. Manage CCAs");
		System.out.println("2. Manage Registration");
		System.out.println("3. Quit");

	}

	public static void manageCCAMenu() { // xixin

		Helper.line(30, "-");
		System.out.println("Manage CCAs");
		Helper.line(30, "-");

		System.out.println("1. View all CCAs");
		System.out.println("2. View all CCA category");
		System.out.println("3. Add CCA details");
		System.out.println("4. Delete CCA");
		System.out.println("5. Add CCA category");
		System.out.println("5. Delete CCA category");
		System.out.println("6. Quit");

	}

	public static void manageRegistrationMenu() { // xixin

		Helper.line(30, "-");
		System.out.println("Manage Registrations");
		Helper.line(30, "-");

		System.out.println("1. View all Registrations");
		System.out.println("2. Change registration status");
		System.out.println("3. Quit");

	}

	public static void loginStudentParentMenu() { // Omar
		Helper.line(30, "-");
		System.out.println("School CCA Registration System - Coordinator");
		Helper.line(30, "-");

		System.out.println("1. Register for CCA");
		System.out.println("2. View registered CCA");
		System.out.println("3. Drop CCA");
	}
	//================================= Option 1 View all CCAs (LoginCoordinator Option 2 - Manage CCAs) =================================
		public static String retrieveAllCCA(ArrayList<CCA> ccaList) {
			String output = "";

			for (int i = 0; i < ccaList.size(); i++) {

				String title = ccaList.get(i).getTitle();
				String description = ccaList.get(i).getDescription();
				int classSize = ccaList.get(i).getClassSize();
				String ccaDay = ccaList.get(i).getCcaDay();
				String ccaTime = ccaList.get(i).getCcaTime();
				String venu = ccaList.get(i).getVenu();
				String instructorName = ccaList.get(i).getInstructorName();
				output += String.format("%-10s %-30s %-10d %-10s %-20s %-10s %-10s\n", title ,description, classSize, 
						ccaDay, ccaTime, venu, instructorName);
			}
			return output;
		}
		public static void viewAllCCA(ArrayList<CCA> ccaList) {
			C206_CaseStudy.setHeader("CCA LIST");
			String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "TITLE", "DESCRIPTION",
					"CLASS SIZE", "DAY","TIME", "VENU", "INSTRUCTOR-IN-CHARGE");
			 output += retrieveAllCCA(ccaList);	
			System.out.println(output);
		}

		/**
		 * @param string
		 */
		private static void setHeader(String string) {
			// TODO Auto-generated method stub
		}
}
