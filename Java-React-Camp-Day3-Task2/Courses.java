package java.react.camp.day3.task2;

public class Courses {
	private int id;
	private String courseName;
	private String instructorName;
        
         public Courses() {
	
        }
	
	public Courses(int id, String courseName, String instructorName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
	}
        
	public int GetId() {
		return id;
	}
	public void SetId(int id) {
		this.id = id;
	}
	public String GetCourseName() {
		return courseName;
	}
	public void SetCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String GetİnstructorName() {
		return instructorName;
	}
	public void SetİnstructorName(String instructorName) {
		instructorName = instructorName;
	}
	
}