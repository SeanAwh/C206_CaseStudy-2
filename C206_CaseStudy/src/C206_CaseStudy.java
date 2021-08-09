import java.util.ArrayList;

public class C206_CaseStudy {

	static ArrayList<Student> studentList = new ArrayList<Student>();

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
				System.out.println("4. Logout");

				adminOption = Helper.readInt("Enter option: > ");

				switch (adminOption) {
				case 1:
					// view all student
					adminViewStudent();
					break;
				case 2:
					// add student
					adminAddStudent();
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

		} else {
			System.out.println("Invalid Username or Password");
		}

	}

	////////// Admin add student method //////////
	public static void adminAddStudent() { // Sean
		System.out.println("Enter the following");
		int studentID = Helper.readInt("Student ID: > ");
		String studentName = Helper.readString("Student Name: > ");
		String studentGrade = Helper.readString("Student Grade: > ");
		String studentClass = Helper.readString("Student Class: > ");
		String studentTeacher = Helper.readString("Student Teacher: > ");

		studentList.add(new Student(studentID, studentName, studentGrade, studentClass, studentTeacher));
	}

	public static void adminViewStudent() { //Sean
		Helper.line(30, "-");
		System.out.println("List of students in database");
		Helper.line(30, "-");
		String display = String.format("%-20s %-20s %-20s %-20s %-20s\n", "Student ID","Student Name", "Grade","Class","Teacher");
		
		if (!studentList.isEmpty()) {
			for (int i = 0; i < studentList.size(); i++) {
				
				display += String.format("%-20d %-20s %-20s %-20s %-20s\n", studentList.get(i).getId(),studentList.get(i).getStudentName(),studentList.get(i).getGrade(),studentList.get(i).getClassId(),studentList.get(i).getTeacherName());
				
			}
		}
		else {
			display += "Student list is empty";
		}
		System.out.println(display);
	}

	////////// Coordinator menu //////////
	public static void loginCoordinatorMenu() { // xixin
		ArrayList<CCA> ccaList = new ArrayList<CCA>();

		ccaList.add(new CCA("Lego Expert", "Designing and building using Lego", 25, 
				"Thursday", "3.00pm - 4.00pm", "Class room A", "Albert"));
		ccaList.add(new CCA("Jewellery Making", "Make a variety of jewellery items",15,
				"Wednesday","3.00pm - 4.00pm", "Class room B", "Malvin"));

		Helper.line(30, "-");
		System.out.println("Coordinator login");
		Helper.line(30, "-");

		String coordUser = Helper.readString("Enter Username: > ");
		String coordPass = Helper.readString("Enter Password: > ");

		if (coordUser.equals("coordinator") && coordPass.equals("coordinator")) {

		System.out.println("1. Manage CCAs");
		System.out.println("2. Manage Registration");
		System.out.println("3. Quit");
		
		int coordOption = 0;
		while (coordOption != 3) {
			Helper.line(30, "-");
			System.out.println("Coordinator Menu");
			Helper.line(30, "-");
			
			coordOption = Helper.readInt("Enter option: > ");
			
			switch (coordOption) {
			case 1:
				//manage CCAs
				int coordOptionCCA = 0;
				while (coordOptionCCA != 7) {					
					manageCCAMenu();
					
					coordOptionCCA = Helper.readInt("Enter option: > ");
					
					switch (coordOptionCCA) {
					case 1:
						// view all ccas
						C206_CaseStudy.viewAllCCA(ccaList);
						break;
					case 2:
						// View all CCA category
						
						break;
					case 3:
						// Add CCA details
						CCA cca = inputCCA();
						C206_CaseStudy.addCCA(ccaList, cca);
						break;
					case 4:
						// Delete CCA
						break;
					case 5:
						// Add CCA category
						break;
					case 6:
						// Delete CCA category
						break;
					default:
						if (coordOptionCCA != 7) {
							System.out.println("Invalid input");
						}

						break;
					}					
				}
				break;
			case 2:
				//manage registration
				break;
			default:
				if (coordOption != 3) {
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

	public static void manageCCAMenu() { // xixin

		Helper.line(30, "-");
		System.out.println("Manage CCAs");
		Helper.line(30, "-");

		System.out.println("1. View all CCAs");
		System.out.println("2. View all CCA category");
		System.out.println("3. Add CCA details");
		System.out.println("4. Delete CCA");
		System.out.println("5. Add CCA category");
		System.out.println("6. Delete CCA category");
		System.out.println("7. Quit");

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
				output += String.format("%-20s %-45s %-15s %-15s %-20s %-15s %-15s\n", title ,description, classSize, 
						ccaDay, ccaTime, venu, instructorName);
			}
			return output;
		}
		public static void viewAllCCA(ArrayList<CCA> ccaList) {
			C206_CaseStudy.setHeader("CCA LIST");
			String output = String.format("%-20s %-45s %-15s %-15s %-20s %-15s %-15s\n", "TITLE", "DESCRIPTION","CLASS SIZE", 
					"DAY","TIME", "VENU", "INSTRUCTOR-IN-CHARGE");
			 output += retrieveAllCCA(ccaList);	
			System.out.println(output);
		}

		/**
		 * @param string
		 */
		private static void setHeader(String string) {
			// TODO Auto-generated method stub
		}
		//================================= Coordinator option 1 / Option 3 Add CCA details)=================================
		public static CCA inputCCA() {
			String ccaTitle = Helper.readString("Enter title > ");
			String ccaDescrip = Helper.readString("Enter description > ");
			int ccaClassSize = Helper.readInt("Enter class size > ");
			String ccaDay = Helper.readString("Enter day > ");
			String ccaTime = Helper.readString("Enter time (hh.mm - hh.mm) > ");
			String ccaVenu = Helper.readString("Enter venu > ");
			String ccaInstructor = Helper.readString("Enter instructor-in-charge > ");

				CCA cca= new CCA(ccaTitle, ccaDescrip, ccaClassSize, ccaDay, ccaTime, ccaVenu, ccaInstructor);
				return cca;
					
		}
		public static void addCCA(ArrayList<CCA> ccaList, CCA cca) {
					
			ccaList.add(cca);
			System.out.println("CCA added!");
		}
}
