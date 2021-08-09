//CCA Class -xixin
public class CCA {
    private String title;
    private String description;
    private int classSize;
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
	public CCA(String title, String description, int classSize, String ccaDay, String ccaTime, String venu,
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
    public int getClassSize() {
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
    public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}
