/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Liew Xi Xin
 * Student ID: 20019652
 * Class: W66F
 * Date/Time created: Monday 09-08-2021 14:46
 */

/**
 * @author 20019652 xixin
 *
 */
public class CCA {
    private String title;
    private String description;
    private String classSize;
	private String ccaDay;
	private String ccaTime;
	private String venu;
	private String instructorName;
	/**
	 * @param title
	 * @param description
	 * @param classSize
	 * @param ccaDay
	 * @param ccaTime
	 * @param venu
	 * @param instructorName
	 */
	public CCA(String title, String description, String classSize, String ccaDay, String ccaTime, String venu,
			String instructorName) {
		this.title = title;
		this.description = description;
		this.classSize = classSize;
		this.ccaDay = ccaDay;
		this.ccaTime = ccaTime;
		this.venu = venu;
		this.instructorName = instructorName;
	}
	public String getTitle() {
   	 return title;
    }
    public String getDescription() {
   	 return description;
    }
    public String getClassSize() {
   	 return classSize;
    }
    public String getCcaDay() {
   	 return ccaDay;
    }
    public String getCcaTime() {
   	 return ccaTime;
    }
    public String getVenu() {
   	 return venu;
    }
    public String getInstructorName() {
   	 return instructorName;
    }
}
