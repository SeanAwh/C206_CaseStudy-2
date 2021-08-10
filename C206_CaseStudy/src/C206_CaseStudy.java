import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		ArrayList<Student> parentList = new ArrayList<Student>();

		ccaList.add(new CCA("Lego Expert", "Designing and building using Lego", 25, 
				"Thursday", "15:00 - 16:00", "Class room A", "Albert"));
		ccaList.add(new CCA("Jewellery Making", "Make a variety of jewellery items",15,
				"Wednesday","15:00 - 16:00", "Class room B", "Malvin"));

		studentList.add(new Student(1,"John","P3","C206","Desmond")) ;
		parentList.add(new Student(1,"John","P3","C206","Desmond","Sally","sally@email.com",91234321));
		
		int mainMenuOption = 0;
		while (mainMenuOption != 7) {
			mainMenu();
			mainMenuOption = Helper.readInt("Enter an option > ");

			if (mainMenuOption == 1) { ///////////////////////////// Option 1 Sean
				Helper.line(30, "-");
				System.out.println("Admin login");
				Helper.line(30, "-");

				String adminUser = Helper.readString("Enter Username: > ");
				String adminPass = Helper.readString("Enter Password: > ");

				if (adminUser.equals("admin") && adminPass.equals("admin")) { // Sean
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
							System.out.println(adminViewStudent(studentList));
							break;
						case 2:
							// add student
							addStudent(studentList, adminAddStudent());
							break;
						case 3:
							// delete student
							adminDeleteStudent(studentList);
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
				
			} else if (mainMenuOption == 2) { ///////////////////////////// Option 2
				Helper.line(30, "-");
				System.out.println("Coordinator login");
				Helper.line(30, "-");

				String coordUser = Helper.readString("Enter Username: > ");
				String coordPass = Helper.readString("Enter Password: > ");

				if (coordUser.equals("coordinator") && coordPass.equals("coordinator")) {

				
				int coordOption = 0;
				while (coordOption != 3) {
					Helper.line(30, "-");
					System.out.println("Coordinator Menu");
					Helper.line(30, "-");
					
					System.out.println("1. Manage CCAs");
					System.out.println("2. Manage Registration");
					System.out.println("3. Logout");
					
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
								C206_CaseStudy.coordDeleteCCA(ccaList);
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
						manageRegistrationMenu();
						int coordOptionReg = 0;
						while (coordOptionReg != 3) {
							viewRegistrationMenu();
							coordOptionReg = Helper.readInt("Enter option: > ");
							
							switch (coordOptionReg) {
							case 1:
								// view all registered parent
								C206_CaseStudy.viewParentRegister(parentList);
								break;
							case 2:
								// View all registered student
								C206_CaseStudy.viewStudentRegister(studentList);
								break;
							default:
								if (coordOptionReg != 7) {
									System.out.println("Invalid input");
								}

								break;
							}
						}	
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
				
			} else if (mainMenuOption == 3) { ///////////////////////////// Option 3
				loginStudentParentMenu();
			} else if (mainMenuOption == 4) { ///////////////////////////// Option 4
				int stuPrntOption = 0;
				while (stuPrntOption != 3) { //xixin
					Helper.line(30, "-");
					System.out.println("Register for an account");
					Helper.line(30, "-");
					
					System.out.println("1. Register as student");
					System.out.println("2. Register as parent");
					System.out.println("3. Quit");
					
					stuPrntOption = Helper.readInt("Enter option: > ");
					
					switch (stuPrntOption) {
					case 1:
						//register as student
						Student studentReg = studentRegister();
						C206_CaseStudy.addStudent(studentList, studentReg);
						break;
					case 2:
						//register as parent
						Student parentReg = parentRegister();
						C206_CaseStudy.addParent(parentList, parentReg);
						break;
					default:
						if (stuPrntOption != 3) {
							System.out.println("Invalid input");
						}
						break;
					}	
				}

			} else if (mainMenuOption == 5) { ///////////////////////////// Option 5
				C206_CaseStudy.viewAllCCA(ccaList);
			} else if (mainMenuOption == 6) { ///////////////////////////// Option 6
			    //View all CCA category
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
	public static void viewRegistrationMenu() { // xixin

		Helper.line(30, "-");
		System.out.println("View Registrations");
		Helper.line(30, "-");

		System.out.println("1. View parent registrations");
		System.out.println("2. View student registrations");
		System.out.println("3. Quit");

	}

	public static void loginStudentParentMenu() { // Omar
		Helper.line(30, "-");
		System.out.println("School CCA Registration System");
		Helper.line(30, "-");

		System.out.println("1. Register for CCA");
		System.out.println("2. View registered CCA");
		System.out.println("3. Drop CCA");
	}
	
	
	//================================= Admin menu options =================================
	////////// Admin add student method //////////
	public static Student adminAddStudent() { // Sean
		System.out.println("Enter the following");
		int studentID = Helper.readInt("Student ID: > ");
		String studentName = Helper.readString("Student Name: > ");
		String studentGrade = Helper.readString("Student Grade: > ");
		String studentClass = Helper.readString("Student Class: > ");
		String studentTeacher = Helper.readString("Student Teacher: > ");
		
		Student stud = new Student(studentID, studentName, studentGrade, studentClass, studentTeacher);
		return stud;
	}
	
	public static void addStudent(ArrayList<Student> studentList, Student stud) {
		
		studentList.add(stud);
		System.out.println("Student added");
	}

	///////// Admin View all students /////////
	public static String adminViewStudent(ArrayList<Student> studentList) { // Sean
		Helper.line(30, "-");
		System.out.println("List of students in database");
		Helper.line(30, "-");
		String display = "";
		if (!studentList.isEmpty()) {
			display += String.format("%-20s %-20s %-10s %-10s %-10s\n", "Student ID", "Student Name", "Grade",
					"Class", "Teacher");
			for (int i = 0; i < studentList.size(); i++) {

				display += String.format("%-20d %-20s %-10s %-10s %-10s\n", studentList.get(i).getId(),
						studentList.get(i).getStudentName(), studentList.get(i).getGrade(),
						studentList.get(i).getClassId(), studentList.get(i).getTeacherName());
			}
		} else {
			display += "Student list is empty";
		}
		return display;
	}
	
	
	///////// Admin delete student /////////
	public static void adminDeleteStudent(ArrayList<Student> studentList) { // Sean
		System.out.println(adminViewStudent(studentList));
		System.out.println("---------Delete Student----------");
		int studentID = Helper.readInt("Student ID: > ");
		System.out.println(deleteStudent(studentList, studentID));
	}
	
	public static String deleteStudent(ArrayList<Student> studentList, int id) {
		String info ="";
		for(int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) {
				studentList.remove(i);
				info += "Removed student: "+id;
				break;
			}
			else {
				info = "Invalid student ID";
			}
		}
		return info;
	}
	
	
	//================================= Coordinator menu options =================================
    //////// Coordinator View all CCAs /////////	
	public static String retrieveAllCCA(ArrayList<CCA> ccaList) { //xixin
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
        ////////Coordinator Add a CCA /////////
		public static CCA inputCCA() { // xixin
			String ccaTitle = Helper.readString("Enter title > ");
			String ccaDescrip = Helper.readString("Enter description > ");
			int ccaClassSize = Helper.readInt("Enter class size > ");
			String ccaDay = Helper.readString("Enter day > ");
			String ccaTime = Helper.readString("Enter time (hh:mm - hh:mm) > ");
			String ccaVenu = Helper.readString("Enter venu > ");
			String ccaInstructor = Helper.readString("Enter instructor-in-charge > ");

				CCA cca= new CCA(ccaTitle, ccaDescrip, ccaClassSize, ccaDay, ccaTime, ccaVenu, ccaInstructor);
				return cca;
					
		} 
		public static void addCCA(ArrayList<CCA> ccaList, CCA cca) {
					
			ccaList.add(cca);
			System.out.println("CCA added!");
		}
        ////////Coordinator Delete a CCA /////////
		public static void coordDeleteCCA(ArrayList<CCA> ccaList) { // Sean
			System.out.println(retrieveAllCCA(ccaList));
			System.out.println("---------Delete CCA----------");
			String ccaTitle = Helper.readString("Enter CCA Title to delete: > ");
			System.out.println(deleteCCA(ccaList, ccaTitle));
		}	
		public static String deleteCCA(ArrayList<CCA> ccaList, String title) {
			String displayMssg ="";
			for(int i = 0; i < ccaList.size(); i++) {
				if (ccaList.get(i).getTitle().equals(title)) {
					ccaList.remove(i);
					displayMssg += "Removed CCA: "+ title;
					break;
				}
				else {
					displayMssg = "Invalid CCA title";
				}
			}
			return displayMssg;
		}
		//================================= Student/Parent registration menu options =================================
	    //////// Parent register /////////	

		public static Student parentRegister() { //bazlyn
		       int id = Helper.readInt("Enter Student's ID > ");
		       String studentName = Helper.readString("Enter Student's name > ");
		       String studentGrade = Helper.readString("Enter Student's grade > ");
		       String classId = Helper.readString("Enter Student's class ID > ");
		       String teacherName = Helper.readString("Enter teacher's name > ");
		       String parentName = Helper.readString("Enter your name > ");
		       String email = Helper.readString("Enter your email > ");
		       int number = Helper.readInt("Enter contact number > ");
			   
		       //Student studentReg = new Student(id, studentName, studentGrade, classId, teacherName);
		       Student parentReg= new Student(id, studentName, studentGrade, classId, teacherName, parentName,
			        email, number);
			   
		       return parentReg;
						
		} 
		public static void addParent(ArrayList<Student> parentList, Student parentReg) {
					
			parentList.add(parentReg);
			System.out.println("Parent account registered successful!");
		}
		 //////// Student register /////////	
		public static Student studentRegister() { //bazlyn, xixin
		       int id = Helper.readInt("Enter Student's ID > ");
		       String studentName = Helper.readString("Enter Student's name > ");
		       String studentGrade = Helper.readString("Enter Student's grade > ");
		       String classId = Helper.readString("Enter Student's class ID > ");
		       String teacherName = Helper.readString("Enter teacher's name > ");

		       Student studentReg = new Student(id, studentName, studentGrade, classId, teacherName);
			   
		       return studentReg;
							
		} 
		public static void addRegStudent(ArrayList<Student> studentList, Student studentReg) {
			
			studentList.add(studentReg);
			System.out.println("Student account registered successful!");
		}
        ////////View registered parent /////////
		public static String retrieveAllParentRegistration(ArrayList<Student> parentList) { //xixin
			String output = "";

			for (int i = 0; i < parentList.size(); i++) {

				int id = parentList.get(i).getId();
				String studentName = parentList.get(i).getStudentName();
				String grade = parentList.get(i).getGrade();
				String classId = parentList.get(i).getClassId();
				String teacher = parentList.get(i).getTeacherName();
				String parentName = parentList.get(i).getParentName();
				String email = parentList.get(i).getEmail();
				int contactNo = parentList.get(i).getNumber();
				output += String.format("%-10s %-15s %-15s %-15s %-10s %-10s %-20s %-15s\n", id ,studentName, grade, 
						classId, teacher, parentName, email, contactNo);
			}
			return output;
		}
	    public static void viewParentRegister(ArrayList<Student> parentList) {
			C206_CaseStudy.setHeader("REGISTERED PARENTS/STUDENT LIST");
			String output = String.format("%-10s %-15s %-15s %-15s %-10s %-10s %-20s %-15s\n", "Student ID", "Student Name","Grade", 
					"Class","Teacher", "Parent Name", "Email", "Contact Number");
			output += retrieveAllParentRegistration(parentList);	
			System.out.println(output);
		}
	    ////////View registered student /////////
		public static String retrieveAllStudentRegistration(ArrayList<Student> studentList) { //xixin
			String output = "";

			for (int i = 0; i < studentList.size(); i++) {

				int id = studentList.get(i).getId();
				String studentName = studentList.get(i).getStudentName();
				String grade = studentList.get(i).getGrade();
				String classId = studentList.get(i).getClassId();
				String teacher = studentList.get(i).getTeacherName();
				output += String.format("%-10s %-15s %-15s %-15s %-10s\n", id ,studentName, grade, 
						classId, teacher);
			}
			return output;
		}
	    public static void viewStudentRegister(ArrayList<Student> studentList) {
			C206_CaseStudy.setHeader("REGISTERED PARENTS/STUDENT LIST");
			String output = String.format("%-10s %-15s %-15s %-15s %-10s\n", "Student ID", "Student Name","Grade", 
					"Class","Teacher");
			output += retrieveAllStudentRegistration(studentList);	
			System.out.println(output);
		}
	    //Delete parent//
	    public static String deleteParent(ArrayList<Student> parentList, int id) {
		String info ="";
		for(int i = 0; i < parentList.size(); i++) {
			if (parentList.get(i).getId() == id) {
				parentList.remove(i);
				info += "Removed parent: "+id;
				break;
			}
			else {
				info = "Invalid student ID";
			}
		}
		return info;
	        
	}
}
