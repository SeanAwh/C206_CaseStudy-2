/*
 * Student Name: Bazlyn Kaiyisa
 * Student ID: 19016637
 * Date/Time created: Tuesday 10-08-2021 11:52
 */

public class Parent {
	private int id;
	private String parentName;
	private String email;
	private int number;
	
	public Parent(int id, String parentName, String email, int number) {
		super();
		this.id = id;
		this.parentName = parentName;
		this.email = email;
		this.number = number;
	}
    public int getId() {
	return id;
    }
    public void setId(int id) {
	this.id = id;
    }
    public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
