package java.react.camp.day3.task2;

public class Instructor {
    
	private int id;
	private String firstName;
	private String lastName;
	
	public Instructor(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
        
	public int GetId() {
		return id;
	}
	public void SetId(int id) {
		this.id = id;
	}
	public String GetFirstName() {
		return firstName;
	}
	public void SetFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String GetLastName() {
		return lastName;
	}
	public void SetLastName(String lastName) {
		this.lastName = lastName;
	}
}